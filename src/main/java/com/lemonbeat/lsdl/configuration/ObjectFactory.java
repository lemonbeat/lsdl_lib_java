
package com.lemonbeat.lsdl.configuration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.configuration package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.configuration
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
     * Create an instance of {@link ConfigStatusReportType }
     * 
     */
    public ConfigStatusReportType createConfigStatusReportType() {
        return new ConfigStatusReportType();
    }

    /**
     * Create an instance of {@link ConfigStatusGetType }
     * 
     */
    public ConfigStatusGetType createConfigStatusGetType() {
        return new ConfigStatusGetType();
    }

    /**
     * Create an instance of {@link ConfigModeSetType }
     * 
     */
    public ConfigModeSetType createConfigModeSetType() {
        return new ConfigModeSetType();
    }

}
