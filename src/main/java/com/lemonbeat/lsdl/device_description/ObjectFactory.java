//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:42 PM CEST 
//


package com.lemonbeat.lsdl.device_description;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.device_description package. 
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

    private final static QName _NetworkDeviceDeviceDescriptionGet_QNAME = new QName("urn:device_descriptionxsd", "device_description_get");
    private final static QName _NetworkDeviceDeviceDescriptionReport_QNAME = new QName("urn:device_descriptionxsd", "device_description_report");
    private final static QName _NetworkDeviceDeviceDescriptionSet_QNAME = new QName("urn:device_descriptionxsd", "device_description_set");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.device_description
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
     * Create an instance of {@link DeviceDescriptionGetType }
     * 
     */
    public DeviceDescriptionGetType createDeviceDescriptionGetType() {
        return new DeviceDescriptionGetType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link DeviceDescriptionType }
     * 
     */
    public DeviceDescriptionType createDeviceDescriptionType() {
        return new DeviceDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDescriptionGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:device_descriptionxsd", name = "device_description_get", scope = Network.Device.class)
    public JAXBElement<DeviceDescriptionGetType> createNetworkDeviceDeviceDescriptionGet(DeviceDescriptionGetType value) {
        return new JAXBElement<DeviceDescriptionGetType>(_NetworkDeviceDeviceDescriptionGet_QNAME, DeviceDescriptionGetType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:device_descriptionxsd", name = "device_description_report", scope = Network.Device.class)
    public JAXBElement<DeviceDescriptionType> createNetworkDeviceDeviceDescriptionReport(DeviceDescriptionType value) {
        return new JAXBElement<DeviceDescriptionType>(_NetworkDeviceDeviceDescriptionReport_QNAME, DeviceDescriptionType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:device_descriptionxsd", name = "device_description_set", scope = Network.Device.class)
    public JAXBElement<DeviceDescriptionType> createNetworkDeviceDeviceDescriptionSet(DeviceDescriptionType value) {
        return new JAXBElement<DeviceDescriptionType>(_NetworkDeviceDeviceDescriptionSet_QNAME, DeviceDescriptionType.class, Network.Device.class, value);
    }

}
