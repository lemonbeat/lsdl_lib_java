
package com.lemonbeat.lsdl.calculation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.calculation package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.calculation
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
     * Create an instance of {@link CalculationType }
     * 
     */
    public CalculationType createCalculationType() {
        return new CalculationType();
    }

    /**
     * Create an instance of {@link CalSubType }
     * 
     */
    public CalSubType createCalSubType() {
        return new CalSubType();
    }

    /**
     * Create an instance of {@link CalculationDeleteType }
     * 
     */
    public CalculationDeleteType createCalculationDeleteType() {
        return new CalculationDeleteType();
    }

    /**
     * Create an instance of {@link CalculationSetType }
     * 
     */
    public CalculationSetType createCalculationSetType() {
        return new CalculationSetType();
    }

    /**
     * Create an instance of {@link CalculationMemoryGetType }
     * 
     */
    public CalculationMemoryGetType createCalculationMemoryGetType() {
        return new CalculationMemoryGetType();
    }

    /**
     * Create an instance of {@link CalculationMemoryReportType }
     * 
     */
    public CalculationMemoryReportType createCalculationMemoryReportType() {
        return new CalculationMemoryReportType();
    }

    /**
     * Create an instance of {@link CalculationReportType }
     * 
     */
    public CalculationReportType createCalculationReportType() {
        return new CalculationReportType();
    }

    /**
     * Create an instance of {@link CalculationGetType }
     * 
     */
    public CalculationGetType createCalculationGetType() {
        return new CalculationGetType();
    }

}
