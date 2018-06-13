//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:38 PM CEST 
//


package com.lemonbeat.lsdl.value_description;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.value_description package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.value_description
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
     * Create an instance of {@link NumberFormatType }
     * 
     */
    public NumberFormatType createNumberFormatType() {
        return new NumberFormatType();
    }

    /**
     * Create an instance of {@link ValueDescriptionMemoryGetType }
     * 
     */
    public ValueDescriptionMemoryGetType createValueDescriptionMemoryGetType() {
        return new ValueDescriptionMemoryGetType();
    }

    /**
     * Create an instance of {@link ValueDescriptionMemoryReportType }
     * 
     */
    public ValueDescriptionMemoryReportType createValueDescriptionMemoryReportType() {
        return new ValueDescriptionMemoryReportType();
    }

    /**
     * Create an instance of {@link ValueDescriptionReportType }
     * 
     */
    public ValueDescriptionReportType createValueDescriptionReportType() {
        return new ValueDescriptionReportType();
    }

    /**
     * Create an instance of {@link HexBinaryFormatType }
     * 
     */
    public HexBinaryFormatType createHexBinaryFormatType() {
        return new HexBinaryFormatType();
    }

    /**
     * Create an instance of {@link ValueDescriptionType }
     * 
     */
    public ValueDescriptionType createValueDescriptionType() {
        return new ValueDescriptionType();
    }

    /**
     * Create an instance of {@link StringFormatType }
     * 
     */
    public StringFormatType createStringFormatType() {
        return new StringFormatType();
    }

    /**
     * Create an instance of {@link ValueDescriptionGetType }
     * 
     */
    public ValueDescriptionGetType createValueDescriptionGetType() {
        return new ValueDescriptionGetType();
    }

    /**
     * Create an instance of {@link ValueDescriptionDeleteType }
     * 
     */
    public ValueDescriptionDeleteType createValueDescriptionDeleteType() {
        return new ValueDescriptionDeleteType();
    }

    /**
     * Create an instance of {@link ValueDescriptionAddType }
     * 
     */
    public ValueDescriptionAddType createValueDescriptionAddType() {
        return new ValueDescriptionAddType();
    }

}
