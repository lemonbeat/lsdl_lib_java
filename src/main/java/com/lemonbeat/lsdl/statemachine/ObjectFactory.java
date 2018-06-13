//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:35 PM CEST 
//


package com.lemonbeat.lsdl.statemachine;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.statemachine package. 
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

    private final static QName _NetworkDeviceStatemachineReportStateMemory_QNAME = new QName("urn:statemachinexsd", "statemachine_report_state_memory");
    private final static QName _NetworkDeviceStatemachineReportMemory_QNAME = new QName("urn:statemachinexsd", "statemachine_report_memory");
    private final static QName _NetworkDeviceStatemachineGetStateMemory_QNAME = new QName("urn:statemachinexsd", "statemachine_get_state_memory");
    private final static QName _NetworkDeviceStatemachineGetState_QNAME = new QName("urn:statemachinexsd", "statemachine_get_state");
    private final static QName _NetworkDeviceStatemachineGetMemory_QNAME = new QName("urn:statemachinexsd", "statemachine_get_memory");
    private final static QName _NetworkDeviceStatemachineDelete_QNAME = new QName("urn:statemachinexsd", "statemachine_delete");
    private final static QName _NetworkDeviceStatemachineSetState_QNAME = new QName("urn:statemachinexsd", "statemachine_set_state");
    private final static QName _NetworkDeviceStatemachineGet_QNAME = new QName("urn:statemachinexsd", "statemachine_get");
    private final static QName _NetworkDeviceStatemachineReportState_QNAME = new QName("urn:statemachinexsd", "statemachine_report_state");
    private final static QName _NetworkDeviceStatemachineReport_QNAME = new QName("urn:statemachinexsd", "statemachine_report");
    private final static QName _NetworkDeviceStatemachineSet_QNAME = new QName("urn:statemachinexsd", "statemachine_set");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.statemachine
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
     * Create an instance of {@link StatemachineType }
     * 
     */
    public StatemachineType createStatemachineType() {
        return new StatemachineType();
    }

    /**
     * Create an instance of {@link StatemachineGetStateType }
     * 
     */
    public StatemachineGetStateType createStatemachineGetStateType() {
        return new StatemachineGetStateType();
    }

    /**
     * Create an instance of {@link StatemachineStateType }
     * 
     */
    public StatemachineStateType createStatemachineStateType() {
        return new StatemachineStateType();
    }

    /**
     * Create an instance of {@link StatemachineSetStateType }
     * 
     */
    public StatemachineSetStateType createStatemachineSetStateType() {
        return new StatemachineSetStateType();
    }

    /**
     * Create an instance of {@link StatemachineReportType }
     * 
     */
    public StatemachineReportType createStatemachineReportType() {
        return new StatemachineReportType();
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link StatemachineSetType }
     * 
     */
    public StatemachineSetType createStatemachineSetType() {
        return new StatemachineSetType();
    }

    /**
     * Create an instance of {@link StatemachineReportStateType }
     * 
     */
    public StatemachineReportStateType createStatemachineReportStateType() {
        return new StatemachineReportStateType();
    }

    /**
     * Create an instance of {@link StatemachineDeleteType }
     * 
     */
    public StatemachineDeleteType createStatemachineDeleteType() {
        return new StatemachineDeleteType();
    }

    /**
     * Create an instance of {@link StatemachineGetType }
     * 
     */
    public StatemachineGetType createStatemachineGetType() {
        return new StatemachineGetType();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link StatemachineMemoryReportType }
     * 
     */
    public StatemachineMemoryReportType createStatemachineMemoryReportType() {
        return new StatemachineMemoryReportType();
    }

    /**
     * Create an instance of {@link StatemachineMemoryGetType }
     * 
     */
    public StatemachineMemoryGetType createStatemachineMemoryGetType() {
        return new StatemachineMemoryGetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineMemoryReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_report_state_memory", scope = Network.Device.class)
    public JAXBElement<StatemachineMemoryReportType> createNetworkDeviceStatemachineReportStateMemory(StatemachineMemoryReportType value) {
        return new JAXBElement<StatemachineMemoryReportType>(_NetworkDeviceStatemachineReportStateMemory_QNAME, StatemachineMemoryReportType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineMemoryReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_report_memory", scope = Network.Device.class)
    public JAXBElement<StatemachineMemoryReportType> createNetworkDeviceStatemachineReportMemory(StatemachineMemoryReportType value) {
        return new JAXBElement<StatemachineMemoryReportType>(_NetworkDeviceStatemachineReportMemory_QNAME, StatemachineMemoryReportType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineMemoryGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_get_state_memory", scope = Network.Device.class)
    public JAXBElement<StatemachineMemoryGetType> createNetworkDeviceStatemachineGetStateMemory(StatemachineMemoryGetType value) {
        return new JAXBElement<StatemachineMemoryGetType>(_NetworkDeviceStatemachineGetStateMemory_QNAME, StatemachineMemoryGetType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineGetStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_get_state", scope = Network.Device.class)
    public JAXBElement<StatemachineGetStateType> createNetworkDeviceStatemachineGetState(StatemachineGetStateType value) {
        return new JAXBElement<StatemachineGetStateType>(_NetworkDeviceStatemachineGetState_QNAME, StatemachineGetStateType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineMemoryGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_get_memory", scope = Network.Device.class)
    public JAXBElement<StatemachineMemoryGetType> createNetworkDeviceStatemachineGetMemory(StatemachineMemoryGetType value) {
        return new JAXBElement<StatemachineMemoryGetType>(_NetworkDeviceStatemachineGetMemory_QNAME, StatemachineMemoryGetType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineDeleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_delete", scope = Network.Device.class)
    public JAXBElement<StatemachineDeleteType> createNetworkDeviceStatemachineDelete(StatemachineDeleteType value) {
        return new JAXBElement<StatemachineDeleteType>(_NetworkDeviceStatemachineDelete_QNAME, StatemachineDeleteType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineSetStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_set_state", scope = Network.Device.class)
    public JAXBElement<StatemachineSetStateType> createNetworkDeviceStatemachineSetState(StatemachineSetStateType value) {
        return new JAXBElement<StatemachineSetStateType>(_NetworkDeviceStatemachineSetState_QNAME, StatemachineSetStateType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_get", scope = Network.Device.class)
    public JAXBElement<StatemachineGetType> createNetworkDeviceStatemachineGet(StatemachineGetType value) {
        return new JAXBElement<StatemachineGetType>(_NetworkDeviceStatemachineGet_QNAME, StatemachineGetType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineReportStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_report_state", scope = Network.Device.class)
    public JAXBElement<StatemachineReportStateType> createNetworkDeviceStatemachineReportState(StatemachineReportStateType value) {
        return new JAXBElement<StatemachineReportStateType>(_NetworkDeviceStatemachineReportState_QNAME, StatemachineReportStateType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_report", scope = Network.Device.class)
    public JAXBElement<StatemachineReportType> createNetworkDeviceStatemachineReport(StatemachineReportType value) {
        return new JAXBElement<StatemachineReportType>(_NetworkDeviceStatemachineReport_QNAME, StatemachineReportType.class, Network.Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatemachineSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:statemachinexsd", name = "statemachine_set", scope = Network.Device.class)
    public JAXBElement<StatemachineSetType> createNetworkDeviceStatemachineSet(StatemachineSetType value) {
        return new JAXBElement<StatemachineSetType>(_NetworkDeviceStatemachineSet_QNAME, StatemachineSetType.class, Network.Device.class, value);
    }

}
