
package com.lemonbeat.lsdl.action;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="get" type="{urn:actionxsd}getType"/>
 *         &lt;element name="set" type="{urn:actionxsd}setType"/>
 *         &lt;element name="report" type="{urn:actionxsd}reportType"/>
 *         &lt;element name="invoke" type="{urn:actionxsd}invokeType"/>
 *         &lt;element name="timer_start" type="{urn:actionxsd}timerType"/>
 *         &lt;element name="timer_stop" type="{urn:actionxsd}timerType"/>
 *       &lt;/choice>
 *       &lt;attribute name="action_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionType", propOrder = {
    "getOrSetOrReport"
})
public class ActionType {

    @XmlElementRefs({
        @XmlElementRef(name = "get", namespace = "urn:actionxsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "report", namespace = "urn:actionxsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "invoke", namespace = "urn:actionxsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "timer_start", namespace = "urn:actionxsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "timer_stop", namespace = "urn:actionxsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "urn:actionxsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> getOrSetOrReport;
    @XmlAttribute(name = "action_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long actionId;

    /**
     * Gets the value of the getOrSetOrReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getOrSetOrReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetOrSetOrReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link InvokeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getGetOrSetOrReport() {
        if (getOrSetOrReport == null) {
            getOrSetOrReport = new ArrayList<JAXBElement<?>>();
        }
        return this.getOrSetOrReport;
    }

    /**
     * Gets the value of the actionId property.
     * 
     */
    public long getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     */
    public void setActionId(long value) {
        this.actionId = value;
    }

}
