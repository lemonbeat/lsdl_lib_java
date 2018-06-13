//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:47 PM CEST 
//


package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.mac package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.mac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mac }
     * 
     */
    public Mac createMac() {
        return new Mac();
    }

    /**
     * Create an instance of {@link MacOptionAckRequestType }
     * 
     */
    public MacOptionAckRequestType createMacOptionAckRequestType() {
        return new MacOptionAckRequestType();
    }

    /**
     * Create an instance of {@link MacOptionAckType }
     * 
     */
    public MacOptionAckType createMacOptionAckType() {
        return new MacOptionAckType();
    }

    /**
     * Create an instance of {@link MacOptionFragmentType }
     * 
     */
    public MacOptionFragmentType createMacOptionFragmentType() {
        return new MacOptionFragmentType();
    }

    /**
     * Create an instance of {@link MacOptionChannelMapType }
     * 
     */
    public MacOptionChannelMapType createMacOptionChannelMapType() {
        return new MacOptionChannelMapType();
    }

    /**
     * Create an instance of {@link MacOptionWakeOnRadioType }
     * 
     */
    public MacOptionWakeOnRadioType createMacOptionWakeOnRadioType() {
        return new MacOptionWakeOnRadioType();
    }

}
