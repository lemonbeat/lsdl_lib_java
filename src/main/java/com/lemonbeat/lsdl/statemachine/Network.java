//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:35 PM CEST 
//


package com.lemonbeat.lsdl.statemachine;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="statemachine_get" type="{urn:statemachinexsd}statemachineGetType"/>
 *                   &lt;element name="statemachine_report" type="{urn:statemachinexsd}statemachineReportType"/>
 *                   &lt;element name="statemachine_set" type="{urn:statemachinexsd}statemachineSetType"/>
 *                   &lt;element name="statemachine_delete" type="{urn:statemachinexsd}statemachineDeleteType"/>
 *                   &lt;element name="statemachine_get_state" type="{urn:statemachinexsd}statemachineGetStateType"/>
 *                   &lt;element name="statemachine_report_state" type="{urn:statemachinexsd}statemachineReportStateType"/>
 *                   &lt;element name="statemachine_set_state" type="{urn:statemachinexsd}statemachineSetStateType"/>
 *                   &lt;element name="statemachine_get_memory" type="{urn:statemachinexsd}statemachineMemoryGetType"/>
 *                   &lt;element name="statemachine_report_memory" type="{urn:statemachinexsd}statemachineMemoryReportType"/>
 *                   &lt;element name="statemachine_get_state_memory" type="{urn:statemachinexsd}statemachineMemoryGetType"/>
 *                   &lt;element name="statemachine_report_state_memory" type="{urn:statemachinexsd}statemachineMemoryReportType"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="device_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="go_to_sleep" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "device"
})
@XmlRootElement(name = "network")
public class Network {

    @XmlElement(required = true)
    protected List<Network.Device> device;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long version;

    /**
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Network.Device }
     * 
     * 
     */
    public List<Network.Device> getDevice() {
        if (device == null) {
            device = new ArrayList<Network.Device>();
        }
        return this.device;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="statemachine_get" type="{urn:statemachinexsd}statemachineGetType"/>
     *         &lt;element name="statemachine_report" type="{urn:statemachinexsd}statemachineReportType"/>
     *         &lt;element name="statemachine_set" type="{urn:statemachinexsd}statemachineSetType"/>
     *         &lt;element name="statemachine_delete" type="{urn:statemachinexsd}statemachineDeleteType"/>
     *         &lt;element name="statemachine_get_state" type="{urn:statemachinexsd}statemachineGetStateType"/>
     *         &lt;element name="statemachine_report_state" type="{urn:statemachinexsd}statemachineReportStateType"/>
     *         &lt;element name="statemachine_set_state" type="{urn:statemachinexsd}statemachineSetStateType"/>
     *         &lt;element name="statemachine_get_memory" type="{urn:statemachinexsd}statemachineMemoryGetType"/>
     *         &lt;element name="statemachine_report_memory" type="{urn:statemachinexsd}statemachineMemoryReportType"/>
     *         &lt;element name="statemachine_get_state_memory" type="{urn:statemachinexsd}statemachineMemoryGetType"/>
     *         &lt;element name="statemachine_report_state_memory" type="{urn:statemachinexsd}statemachineMemoryReportType"/>
     *       &lt;/choice>
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="device_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="go_to_sleep" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statemachineGetOrStatemachineReportOrStatemachineSet"
    })
    public static class Device {

        @XmlElementRefs({
            @XmlElementRef(name = "statemachine_report_memory", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_set_state", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_report_state_memory", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_report", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_delete", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_get_state_memory", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_get_state", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_report_state", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_get_memory", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_get", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "statemachine_set", namespace = "urn:statemachinexsd", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> statemachineGetOrStatemachineReportOrStatemachineSet;
        @XmlAttribute(name = "version", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long version;
        @XmlAttribute(name = "device_id")
        @XmlSchemaType(name = "unsignedInt")
        protected Long deviceId;
        @XmlAttribute(name = "go_to_sleep")
        @XmlSchemaType(name = "unsignedInt")
        protected Long goToSleep;

        /**
         * Gets the value of the statemachineGetOrStatemachineReportOrStatemachineSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statemachineGetOrStatemachineReportOrStatemachineSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatemachineGetOrStatemachineReportOrStatemachineSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link StatemachineMemoryReportType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineSetStateType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineMemoryReportType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineReportType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineDeleteType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineMemoryGetType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineGetStateType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineReportStateType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineMemoryGetType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineGetType }{@code >}
         * {@link JAXBElement }{@code <}{@link StatemachineSetType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getStatemachineGetOrStatemachineReportOrStatemachineSet() {
            if (statemachineGetOrStatemachineReportOrStatemachineSet == null) {
                statemachineGetOrStatemachineReportOrStatemachineSet = new ArrayList<JAXBElement<?>>();
            }
            return this.statemachineGetOrStatemachineReportOrStatemachineSet;
        }

        /**
         * Ruft den Wert der version-Eigenschaft ab.
         * 
         */
        public long getVersion() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         * 
         */
        public void setVersion(long value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der deviceId-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDeviceId() {
            return deviceId;
        }

        /**
         * Legt den Wert der deviceId-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDeviceId(Long value) {
            this.deviceId = value;
        }

        /**
         * Ruft den Wert der goToSleep-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getGoToSleep() {
            return goToSleep;
        }

        /**
         * Legt den Wert der goToSleep-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setGoToSleep(Long value) {
            this.goToSleep = value;
        }

    }

}
