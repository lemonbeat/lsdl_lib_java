
package com.lemonbeat.lsdl.status;

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
 *                   &lt;element name="status_report" type="{urn:statusxsd}statusReportType"/>
 *                   &lt;element name="status_get_level" type="{urn:statusxsd}statusGetLevelType"/>
 *                   &lt;element name="status_set_level" type="{urn:statusxsd}statusSetLevelType"/>
 *                   &lt;element name="status_report_level" type="{urn:statusxsd}statusReportLevelType"/>
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
     *         &lt;element name="status_report" type="{urn:statusxsd}statusReportType"/>
     *         &lt;element name="status_get_level" type="{urn:statusxsd}statusGetLevelType"/>
     *         &lt;element name="status_set_level" type="{urn:statusxsd}statusSetLevelType"/>
     *         &lt;element name="status_report_level" type="{urn:statusxsd}statusReportLevelType"/>
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
        "statusReportOrStatusGetLevelOrStatusSetLevel"
    })
    public static class Device {

        @XmlElements({
            @XmlElement(name = "status_report", type = StatusReportType.class),
            @XmlElement(name = "status_get_level", type = StatusGetLevelType.class),
            @XmlElement(name = "status_set_level", type = StatusSetLevelType.class),
            @XmlElement(name = "status_report_level", type = StatusReportLevelType.class)
        })
        protected List<Object> statusReportOrStatusGetLevelOrStatusSetLevel;
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
         * Gets the value of the statusReportOrStatusGetLevelOrStatusSetLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusReportOrStatusGetLevelOrStatusSetLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusReportOrStatusGetLevelOrStatusSetLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusReportType }
         * {@link StatusGetLevelType }
         * {@link StatusSetLevelType }
         * {@link StatusReportLevelType }
         * 
         * 
         */
        public List<Object> getStatusReportOrStatusGetLevelOrStatusSetLevel() {
            if (statusReportOrStatusGetLevelOrStatusSetLevel == null) {
                statusReportOrStatusGetLevelOrStatusSetLevel = new ArrayList<Object>();
            }
            return this.statusReportOrStatusGetLevelOrStatusSetLevel;
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
