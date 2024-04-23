
package com.lemonbeat.lsdl.action;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.action package. 
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

    private final static QName _ActionTypeSet_QNAME = new QName("urn:actionxsd", "set");
    private final static QName _ActionTypeGet_QNAME = new QName("urn:actionxsd", "get");
    private final static QName _ActionTypeInvoke_QNAME = new QName("urn:actionxsd", "invoke");
    private final static QName _ActionTypeTimerStop_QNAME = new QName("urn:actionxsd", "timer_stop");
    private final static QName _ActionTypeReport_QNAME = new QName("urn:actionxsd", "report");
    private final static QName _ActionTypeTimerStart_QNAME = new QName("urn:actionxsd", "timer_start");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.action
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
     * Create an instance of {@link InvokeType }
     * 
     */
    public InvokeType createInvokeType() {
        return new InvokeType();
    }

    /**
     * Create an instance of {@link ActionInvokeType }
     * 
     */
    public ActionInvokeType createActionInvokeType() {
        return new ActionInvokeType();
    }

    /**
     * Create an instance of {@link ActionSetType }
     * 
     */
    public ActionSetType createActionSetType() {
        return new ActionSetType();
    }

    /**
     * Create an instance of {@link ActionMemoryGetType }
     * 
     */
    public ActionMemoryGetType createActionMemoryGetType() {
        return new ActionMemoryGetType();
    }

    /**
     * Create an instance of {@link SetType }
     * 
     */
    public SetType createSetType() {
        return new SetType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link TimerType }
     * 
     */
    public TimerType createTimerType() {
        return new TimerType();
    }

    /**
     * Create an instance of {@link GetType }
     * 
     */
    public GetType createGetType() {
        return new GetType();
    }

    /**
     * Create an instance of {@link ActionMemoryReportType }
     * 
     */
    public ActionMemoryReportType createActionMemoryReportType() {
        return new ActionMemoryReportType();
    }

    /**
     * Create an instance of {@link ActionReportType }
     * 
     */
    public ActionReportType createActionReportType() {
        return new ActionReportType();
    }

    /**
     * Create an instance of {@link ActionDeleteType }
     * 
     */
    public ActionDeleteType createActionDeleteType() {
        return new ActionDeleteType();
    }

    /**
     * Create an instance of {@link ActionGetType }
     * 
     */
    public ActionGetType createActionGetType() {
        return new ActionGetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "set", scope = ActionType.class)
    public JAXBElement<SetType> createActionTypeSet(SetType value) {
        return new JAXBElement<SetType>(_ActionTypeSet_QNAME, SetType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "get", scope = ActionType.class)
    public JAXBElement<GetType> createActionTypeGet(GetType value) {
        return new JAXBElement<GetType>(_ActionTypeGet_QNAME, GetType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "invoke", scope = ActionType.class)
    public JAXBElement<InvokeType> createActionTypeInvoke(InvokeType value) {
        return new JAXBElement<InvokeType>(_ActionTypeInvoke_QNAME, InvokeType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "timer_stop", scope = ActionType.class)
    public JAXBElement<TimerType> createActionTypeTimerStop(TimerType value) {
        return new JAXBElement<TimerType>(_ActionTypeTimerStop_QNAME, TimerType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "report", scope = ActionType.class)
    public JAXBElement<ReportType> createActionTypeReport(ReportType value) {
        return new JAXBElement<ReportType>(_ActionTypeReport_QNAME, ReportType.class, ActionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:actionxsd", name = "timer_start", scope = ActionType.class)
    public JAXBElement<TimerType> createActionTypeTimerStart(TimerType value) {
        return new JAXBElement<TimerType>(_ActionTypeTimerStart_QNAME, TimerType.class, ActionType.class, value);
    }

}
