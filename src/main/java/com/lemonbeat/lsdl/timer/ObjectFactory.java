
package com.lemonbeat.lsdl.timer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.timer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.timer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link Network.Device }
     * 
     */
    public Network.Device createNetworkDevice() {
        return new Network.Device();
    }

    /**
     * Create an instance of {@link ExecuteType }
     * 
     */
    public ExecuteType createExecuteType() {
        return new ExecuteType();
    }

    /**
     * Create an instance of {@link TimerDeleteType }
     * 
     */
    public TimerDeleteType createTimerDeleteType() {
        return new TimerDeleteType();
    }

    /**
     * Create an instance of {@link TimerMemoryReportType }
     * 
     */
    public TimerMemoryReportType createTimerMemoryReportType() {
        return new TimerMemoryReportType();
    }

    /**
     * Create an instance of {@link TimerSetType }
     * 
     */
    public TimerSetType createTimerSetType() {
        return new TimerSetType();
    }

    /**
     * Create an instance of {@link TimerReportType }
     * 
     */
    public TimerReportType createTimerReportType() {
        return new TimerReportType();
    }

    /**
     * Create an instance of {@link TimerGetType }
     * 
     */
    public TimerGetType createTimerGetType() {
        return new TimerGetType();
    }

    /**
     * Create an instance of {@link TimerMemoryGetType }
     * 
     */
    public TimerMemoryGetType createTimerMemoryGetType() {
        return new TimerMemoryGetType();
    }

}
