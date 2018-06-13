//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:37 PM CEST 
//


package com.lemonbeat.lsdl.timer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *                   &lt;element name="timer_get" type="{urn:timerxsd}timerGetType"/>
 *                   &lt;element name="timer_report" type="{urn:timerxsd}timerReportType"/>
 *                   &lt;element name="timer_set" type="{urn:timerxsd}timerSetType"/>
 *                   &lt;element name="timer_delete" type="{urn:timerxsd}timerDeleteType"/>
 *                   &lt;element name="timer_get_memory" type="{urn:timerxsd}timerMemoryGetType"/>
 *                   &lt;element name="timer_report_memory" type="{urn:timerxsd}timerMemoryReportType"/>
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
     *         &lt;element name="timer_get" type="{urn:timerxsd}timerGetType"/>
     *         &lt;element name="timer_report" type="{urn:timerxsd}timerReportType"/>
     *         &lt;element name="timer_set" type="{urn:timerxsd}timerSetType"/>
     *         &lt;element name="timer_delete" type="{urn:timerxsd}timerDeleteType"/>
     *         &lt;element name="timer_get_memory" type="{urn:timerxsd}timerMemoryGetType"/>
     *         &lt;element name="timer_report_memory" type="{urn:timerxsd}timerMemoryReportType"/>
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
        "timerGetOrTimerReportOrTimerSet"
    })
    public static class Device {

        @XmlElements({
            @XmlElement(name = "timer_get", type = TimerGetType.class),
            @XmlElement(name = "timer_report", type = TimerReportType.class),
            @XmlElement(name = "timer_set", type = TimerSetType.class),
            @XmlElement(name = "timer_delete", type = TimerDeleteType.class),
            @XmlElement(name = "timer_get_memory", type = TimerMemoryGetType.class),
            @XmlElement(name = "timer_report_memory", type = TimerMemoryReportType.class)
        })
        protected List<Object> timerGetOrTimerReportOrTimerSet;
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
         * Gets the value of the timerGetOrTimerReportOrTimerSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timerGetOrTimerReportOrTimerSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimerGetOrTimerReportOrTimerSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TimerGetType }
         * {@link TimerReportType }
         * {@link TimerSetType }
         * {@link TimerDeleteType }
         * {@link TimerMemoryGetType }
         * {@link TimerMemoryReportType }
         * 
         * 
         */
        public List<Object> getTimerGetOrTimerReportOrTimerSet() {
            if (timerGetOrTimerReportOrTimerSet == null) {
                timerGetOrTimerReportOrTimerSet = new ArrayList<Object>();
            }
            return this.timerGetOrTimerReportOrTimerSet;
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
