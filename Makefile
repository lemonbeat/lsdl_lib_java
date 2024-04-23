SHELL := /bin/bash
.DEFAULT_GOAL := help
ROOT_DIR=$(realpath $(shell pwd))

# https://marmelab.com/blog/2016/02/29/auto-documented-makefile.html
help: ## Print this help
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

xjc: ## Generate Java classes from XSD
	rm -Rf lsdl_xsd
	git clone git@gitlab.lemonbeat.com:common/lsdl_xsd.git
	docker run --rm \
	-v $(ROOT_DIR):/opt/lsdl_lib \
	-w /opt/lsdl_lib \
	openjdk:8-jdk-buster \
	/bin/bash -c "\
	./generate_classes.sh && \
	chown $(shell id -u):$(shell id -g) /opt/lsdl_lib/* -R"