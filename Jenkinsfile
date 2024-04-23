#!/usr/bin/env groovy

pipeline {

    agent {
        node {
            label 'swdev-docker'
        }
    }

    triggers {
        cron(env.BRANCH_NAME == 'master' ? 'H 7 * * *' : '')
    }

    options {
        gitLabConnection('gitlab.lemonbeat.com')
        buildDiscarder(logRotator(numToKeepStr: '50', artifactNumToKeepStr: '10'))
    }

    stages {

        stage('clean'){
            steps {
                updateGitlabCommitStatus name: 'lsdl_lib_java', state: 'running'
                cleanWs()
            }
        }

        stage('git pull'){
            steps {
                checkout([
                        $class: 'GitSCM',
                        branches: [[name: "${BRANCH_NAME}"]],
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [],
                        submoduleCfg: [],
                        userRemoteConfigs: scm.userRemoteConfigs
                ])
                checkout scmGit(
                        branches: [[name: '*/master']],
                        extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'lsdl_xsd']],
                        userRemoteConfigs: [[
                            credentialsId: '69c12235-622a-4303-8714-c5be49f65a9a',
                            url: 'git@gitlab.lemonbeat.com:common/lsdl_xsd.git'
                        ]]
                )
            }
        }  // END stage git pull

        stage('Test') {
            matrix {
                axes {
                    axis {
                        name 'JAVA_VERSION'
                        values '8', '11', '13', '17', '21'
                    }
                }
                stages {
                    stage("build and test") {
                        agent {
                            docker {
                                image "openjdk:${JAVA_VERSION}-jdk-buster"
                                label "swdev-docker"
                                reuseNode true
                                args '-u 0:0 -v /var/run/docker.sock:/var/run/docker.sock'
                            }
                        }
                        steps {
                            sh script: """#!/bin/bash
                            ./gradlew build
                            """
                            junit 'build/test-results/**/*.xml'
                        }
                    }
                }
            }
        } // stage('Test')

        stage('docs and jar'){
            agent {
                docker {
                    image 'openjdk:8-jdk-buster'
                    label 'swdev-docker'
                    reuseNode true
                    args '-u 0:0 -v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            stages {
                stage('jar'){
                    steps {
                        sh '''
                        ./gradlew jar
                        '''
                        archiveArtifacts artifacts: 'build/libs/*.jar', allowEmptyArchive: 'true'
                    }
                }
            }
        }

    } // END stages

    post {
        always {
            step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: emailextrecipients([[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']])])
            sh '''
            sudo chown -R svc_jenkins:users ${PWD}
            '''
            cleanWs()
        }
        failure {
            updateGitlabCommitStatus name: 'lsdl_lib_java', state: 'failed'
            addGitLabMRComment comment: 'Well, that didn´t work obviously.'
        }
        success {
            updateGitlabCommitStatus name: 'lsdl_lib_java', state: 'success'
            addGitLabMRComment comment: 'This worked, as it should have.'
        }
        aborted {
            updateGitlabCommitStatus name: 'lsdl_lib_java', state: 'canceled'
            addGitLabMRComment comment: 'The build was canceled.'
        }

    } // END post

} // END pipeline