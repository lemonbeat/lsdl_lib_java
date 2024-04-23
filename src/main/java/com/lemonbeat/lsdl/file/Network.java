
package com.lemonbeat.lsdl.file;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *                 &lt;choice>
 *                   &lt;element name="file_description_get" type="{urn:filexsd}file_description_get"/>
 *                   &lt;element name="file_description_report" type="{urn:filexsd}file_description_report"/>
 *                   &lt;element name="file_information_get" type="{urn:filexsd}file_information_get"/>
 *                   &lt;element name="file_information_report" type="{urn:filexsd}file_information_report"/>
 *                   &lt;element name="file_get" type="{urn:filexsd}file_get"/>
 *                   &lt;element name="file_get_init" type="{urn:filexsd}file_get_init"/>
 *                   &lt;element name="file_get_data" type="{urn:filexsd}file_get_data"/>
 *                   &lt;element name="file_get_data_report" type="{urn:filexsd}file_get_data_report"/>
 *                   &lt;element name="file_add" type="{urn:filexsd}file_add"/>
 *                   &lt;element name="file_add_init" type="{urn:filexsd}file_add_init"/>
 *                   &lt;element name="file_add_data" type="{urn:filexsd}file_add_data"/>
 *                   &lt;element name="file_add_data_report" type="{urn:filexsd}file_add_data_report"/>
 *                   &lt;element name="file_delete" type="{urn:filexsd}file_delete"/>
 *                   &lt;element name="file_delete_report" type="{urn:filexsd}file_delete_report"/>
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
     *       &lt;choice>
     *         &lt;element name="file_description_get" type="{urn:filexsd}file_description_get"/>
     *         &lt;element name="file_description_report" type="{urn:filexsd}file_description_report"/>
     *         &lt;element name="file_information_get" type="{urn:filexsd}file_information_get"/>
     *         &lt;element name="file_information_report" type="{urn:filexsd}file_information_report"/>
     *         &lt;element name="file_get" type="{urn:filexsd}file_get"/>
     *         &lt;element name="file_get_init" type="{urn:filexsd}file_get_init"/>
     *         &lt;element name="file_get_data" type="{urn:filexsd}file_get_data"/>
     *         &lt;element name="file_get_data_report" type="{urn:filexsd}file_get_data_report"/>
     *         &lt;element name="file_add" type="{urn:filexsd}file_add"/>
     *         &lt;element name="file_add_init" type="{urn:filexsd}file_add_init"/>
     *         &lt;element name="file_add_data" type="{urn:filexsd}file_add_data"/>
     *         &lt;element name="file_add_data_report" type="{urn:filexsd}file_add_data_report"/>
     *         &lt;element name="file_delete" type="{urn:filexsd}file_delete"/>
     *         &lt;element name="file_delete_report" type="{urn:filexsd}file_delete_report"/>
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
        "fileDescriptionGet",
        "fileDescriptionReport",
        "fileInformationGet",
        "fileInformationReport",
        "fileGet",
        "fileGetInit",
        "fileGetData",
        "fileGetDataReport",
        "fileAdd",
        "fileAddInit",
        "fileAddData",
        "fileAddDataReport",
        "fileDelete",
        "fileDeleteReport"
    })
    public static class Device {

        @XmlElement(name = "file_description_get")
        protected FileDescriptionGet fileDescriptionGet;
        @XmlElement(name = "file_description_report")
        protected FileDescriptionReport fileDescriptionReport;
        @XmlElement(name = "file_information_get")
        protected FileInformationGet fileInformationGet;
        @XmlElement(name = "file_information_report")
        protected FileInformationReport fileInformationReport;
        @XmlElement(name = "file_get")
        protected FileGet fileGet;
        @XmlElement(name = "file_get_init")
        protected FileGetInit fileGetInit;
        @XmlElement(name = "file_get_data")
        protected FileGetData fileGetData;
        @XmlElement(name = "file_get_data_report")
        protected FileGetDataReport fileGetDataReport;
        @XmlElement(name = "file_add")
        protected FileAdd fileAdd;
        @XmlElement(name = "file_add_init")
        protected FileAddInit fileAddInit;
        @XmlElement(name = "file_add_data")
        protected FileAddData fileAddData;
        @XmlElement(name = "file_add_data_report")
        protected FileAddDataReport fileAddDataReport;
        @XmlElement(name = "file_delete")
        protected FileDelete fileDelete;
        @XmlElement(name = "file_delete_report")
        protected FileDeleteReport fileDeleteReport;
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
         * Gets the value of the fileDescriptionGet property.
         * 
         * @return
         *     possible object is
         *     {@link FileDescriptionGet }
         *     
         */
        public FileDescriptionGet getFileDescriptionGet() {
            return fileDescriptionGet;
        }

        /**
         * Sets the value of the fileDescriptionGet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileDescriptionGet }
         *     
         */
        public void setFileDescriptionGet(FileDescriptionGet value) {
            this.fileDescriptionGet = value;
        }

        /**
         * Gets the value of the fileDescriptionReport property.
         * 
         * @return
         *     possible object is
         *     {@link FileDescriptionReport }
         *     
         */
        public FileDescriptionReport getFileDescriptionReport() {
            return fileDescriptionReport;
        }

        /**
         * Sets the value of the fileDescriptionReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileDescriptionReport }
         *     
         */
        public void setFileDescriptionReport(FileDescriptionReport value) {
            this.fileDescriptionReport = value;
        }

        /**
         * Gets the value of the fileInformationGet property.
         * 
         * @return
         *     possible object is
         *     {@link FileInformationGet }
         *     
         */
        public FileInformationGet getFileInformationGet() {
            return fileInformationGet;
        }

        /**
         * Sets the value of the fileInformationGet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileInformationGet }
         *     
         */
        public void setFileInformationGet(FileInformationGet value) {
            this.fileInformationGet = value;
        }

        /**
         * Gets the value of the fileInformationReport property.
         * 
         * @return
         *     possible object is
         *     {@link FileInformationReport }
         *     
         */
        public FileInformationReport getFileInformationReport() {
            return fileInformationReport;
        }

        /**
         * Sets the value of the fileInformationReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileInformationReport }
         *     
         */
        public void setFileInformationReport(FileInformationReport value) {
            this.fileInformationReport = value;
        }

        /**
         * Gets the value of the fileGet property.
         * 
         * @return
         *     possible object is
         *     {@link FileGet }
         *     
         */
        public FileGet getFileGet() {
            return fileGet;
        }

        /**
         * Sets the value of the fileGet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileGet }
         *     
         */
        public void setFileGet(FileGet value) {
            this.fileGet = value;
        }

        /**
         * Gets the value of the fileGetInit property.
         * 
         * @return
         *     possible object is
         *     {@link FileGetInit }
         *     
         */
        public FileGetInit getFileGetInit() {
            return fileGetInit;
        }

        /**
         * Sets the value of the fileGetInit property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileGetInit }
         *     
         */
        public void setFileGetInit(FileGetInit value) {
            this.fileGetInit = value;
        }

        /**
         * Gets the value of the fileGetData property.
         * 
         * @return
         *     possible object is
         *     {@link FileGetData }
         *     
         */
        public FileGetData getFileGetData() {
            return fileGetData;
        }

        /**
         * Sets the value of the fileGetData property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileGetData }
         *     
         */
        public void setFileGetData(FileGetData value) {
            this.fileGetData = value;
        }

        /**
         * Gets the value of the fileGetDataReport property.
         * 
         * @return
         *     possible object is
         *     {@link FileGetDataReport }
         *     
         */
        public FileGetDataReport getFileGetDataReport() {
            return fileGetDataReport;
        }

        /**
         * Sets the value of the fileGetDataReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileGetDataReport }
         *     
         */
        public void setFileGetDataReport(FileGetDataReport value) {
            this.fileGetDataReport = value;
        }

        /**
         * Gets the value of the fileAdd property.
         * 
         * @return
         *     possible object is
         *     {@link FileAdd }
         *     
         */
        public FileAdd getFileAdd() {
            return fileAdd;
        }

        /**
         * Sets the value of the fileAdd property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileAdd }
         *     
         */
        public void setFileAdd(FileAdd value) {
            this.fileAdd = value;
        }

        /**
         * Gets the value of the fileAddInit property.
         * 
         * @return
         *     possible object is
         *     {@link FileAddInit }
         *     
         */
        public FileAddInit getFileAddInit() {
            return fileAddInit;
        }

        /**
         * Sets the value of the fileAddInit property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileAddInit }
         *     
         */
        public void setFileAddInit(FileAddInit value) {
            this.fileAddInit = value;
        }

        /**
         * Gets the value of the fileAddData property.
         * 
         * @return
         *     possible object is
         *     {@link FileAddData }
         *     
         */
        public FileAddData getFileAddData() {
            return fileAddData;
        }

        /**
         * Sets the value of the fileAddData property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileAddData }
         *     
         */
        public void setFileAddData(FileAddData value) {
            this.fileAddData = value;
        }

        /**
         * Gets the value of the fileAddDataReport property.
         * 
         * @return
         *     possible object is
         *     {@link FileAddDataReport }
         *     
         */
        public FileAddDataReport getFileAddDataReport() {
            return fileAddDataReport;
        }

        /**
         * Sets the value of the fileAddDataReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileAddDataReport }
         *     
         */
        public void setFileAddDataReport(FileAddDataReport value) {
            this.fileAddDataReport = value;
        }

        /**
         * Gets the value of the fileDelete property.
         * 
         * @return
         *     possible object is
         *     {@link FileDelete }
         *     
         */
        public FileDelete getFileDelete() {
            return fileDelete;
        }

        /**
         * Sets the value of the fileDelete property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileDelete }
         *     
         */
        public void setFileDelete(FileDelete value) {
            this.fileDelete = value;
        }

        /**
         * Gets the value of the fileDeleteReport property.
         * 
         * @return
         *     possible object is
         *     {@link FileDeleteReport }
         *     
         */
        public FileDeleteReport getFileDeleteReport() {
            return fileDeleteReport;
        }

        /**
         * Sets the value of the fileDeleteReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileDeleteReport }
         *     
         */
        public void setFileDeleteReport(FileDeleteReport value) {
            this.fileDeleteReport = value;
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
