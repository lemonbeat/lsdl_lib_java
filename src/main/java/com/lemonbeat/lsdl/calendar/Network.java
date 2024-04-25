
package com.lemonbeat.lsdl.calendar;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 *                   &lt;element name="calendar_get" type="{urn:calendarxsd}calendarGetType"/>
 *                   &lt;element name="calendar_report" type="{urn:calendarxsd}calendarReportType"/>
 *                   &lt;element name="calendar_set" type="{urn:calendarxsd}calendarSetType"/>
 *                   &lt;element name="calendar_delete" type="{urn:calendarxsd}calendarDeleteType"/>
 *                   &lt;element name="calendar_get_timezone" type="{urn:calendarxsd}calendarTimezoneGetType"/>
 *                   &lt;element name="calendar_set_timezone" type="{urn:calendarxsd}calendarTimezoneSetType"/>
 *                   &lt;element name="calendar_report_timezone" type="{urn:calendarxsd}calendarTimezoneReportType"/>
 *                   &lt;element name="calendar_get_memory" type="{urn:calendarxsd}calendarMemoryGetType"/>
 *                   &lt;element name="calendar_report_memory" type="{urn:calendarxsd}calendarMemoryReportType"/>
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
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="calendar_get" type="{urn:calendarxsd}calendarGetType"/>
     *         &lt;element name="calendar_report" type="{urn:calendarxsd}calendarReportType"/>
     *         &lt;element name="calendar_set" type="{urn:calendarxsd}calendarSetType"/>
     *         &lt;element name="calendar_delete" type="{urn:calendarxsd}calendarDeleteType"/>
     *         &lt;element name="calendar_get_timezone" type="{urn:calendarxsd}calendarTimezoneGetType"/>
     *         &lt;element name="calendar_set_timezone" type="{urn:calendarxsd}calendarTimezoneSetType"/>
     *         &lt;element name="calendar_report_timezone" type="{urn:calendarxsd}calendarTimezoneReportType"/>
     *         &lt;element name="calendar_get_memory" type="{urn:calendarxsd}calendarMemoryGetType"/>
     *         &lt;element name="calendar_report_memory" type="{urn:calendarxsd}calendarMemoryReportType"/>
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
        "calendarGetOrCalendarReportOrCalendarSet"
    })
    public static class Device {

        @XmlElements({
            @XmlElement(name = "calendar_get", type = CalendarGetType.class),
            @XmlElement(name = "calendar_report", type = CalendarReportType.class),
            @XmlElement(name = "calendar_set", type = CalendarSetType.class),
            @XmlElement(name = "calendar_delete", type = CalendarDeleteType.class),
            @XmlElement(name = "calendar_get_timezone", type = CalendarTimezoneGetType.class),
            @XmlElement(name = "calendar_set_timezone", type = CalendarTimezoneSetType.class),
            @XmlElement(name = "calendar_report_timezone", type = CalendarTimezoneReportType.class),
            @XmlElement(name = "calendar_get_memory", type = CalendarMemoryGetType.class),
            @XmlElement(name = "calendar_report_memory", type = CalendarMemoryReportType.class)
        })
        protected List<Object> calendarGetOrCalendarReportOrCalendarSet;
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
         * Gets the value of the calendarGetOrCalendarReportOrCalendarSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calendarGetOrCalendarReportOrCalendarSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCalendarGetOrCalendarReportOrCalendarSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CalendarGetType }
         * {@link CalendarReportType }
         * {@link CalendarSetType }
         * {@link CalendarDeleteType }
         * {@link CalendarTimezoneGetType }
         * {@link CalendarTimezoneSetType }
         * {@link CalendarTimezoneReportType }
         * {@link CalendarMemoryGetType }
         * {@link CalendarMemoryReportType }
         * 
         * 
         */
        public List<Object> getCalendarGetOrCalendarReportOrCalendarSet() {
            if (calendarGetOrCalendarReportOrCalendarSet == null) {
                calendarGetOrCalendarReportOrCalendarSet = new ArrayList<Object>();
            }
            return this.calendarGetOrCalendarReportOrCalendarSet;
        }

        /**
         * Gets the value of the version property.
         * 
         */
        public long getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         */
        public void setVersion(long value) {
            this.version = value;
        }

        /**
         * Gets the value of the deviceId property.
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
         * Sets the value of the deviceId property.
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
         * Gets the value of the goToSleep property.
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
         * Sets the value of the goToSleep property.
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
