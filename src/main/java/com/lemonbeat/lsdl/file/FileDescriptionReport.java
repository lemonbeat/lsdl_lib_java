
package com.lemonbeat.lsdl.file;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Information about device specific features of the File Service.
 * 
 *         Send as a response to a file_description_get.
 *       
 * 
 * <p>Java class for file_description_report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file_description_report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file_description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="files" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="storage_description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="storage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                           &lt;attribute name="used" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                           &lt;attribute name="wear_level" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_description_report", propOrder = {
    "fileDescription",
    "storageDescription"
})
public class FileDescriptionReport {

    @XmlElement(name = "file_description", required = true)
    protected FileDescriptionReport.FileDescription fileDescription;
    @XmlElement(name = "storage_description", required = true)
    protected FileDescriptionReport.StorageDescription storageDescription;

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FileDescriptionReport.FileDescription }
     *     
     */
    public FileDescriptionReport.FileDescription getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDescriptionReport.FileDescription }
     *     
     */
    public void setFileDescription(FileDescriptionReport.FileDescription value) {
        this.fileDescription = value;
    }

    /**
     * Gets the value of the storageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FileDescriptionReport.StorageDescription }
     *     
     */
    public FileDescriptionReport.StorageDescription getStorageDescription() {
        return storageDescription;
    }

    /**
     * Sets the value of the storageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDescriptionReport.StorageDescription }
     *     
     */
    public void setStorageDescription(FileDescriptionReport.StorageDescription value) {
        this.storageDescription = value;
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
     *       &lt;sequence>
     *         &lt;element name="files" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                 &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "files"
    })
    public static class FileDescription {

        protected List<FileDescriptionReport.FileDescription.Files> files;

        /**
         * Gets the value of the files property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the files property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFiles().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FileDescriptionReport.FileDescription.Files }
         * 
         * 
         */
        public List<FileDescriptionReport.FileDescription.Files> getFiles() {
            if (files == null) {
                files = new ArrayList<FileDescriptionReport.FileDescription.Files>();
            }
            return this.files;
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
         *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Files {

            @XmlAttribute(name = "description", required = true)
            protected String description;
            @XmlAttribute(name = "type", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long type;
            @XmlAttribute(name = "path", required = true)
            protected String path;
            @XmlAttribute(name = "mode", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long mode;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the type property.
             * 
             */
            public long getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             */
            public void setType(long value) {
                this.type = value;
            }

            /**
             * Gets the value of the path property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPath() {
                return path;
            }

            /**
             * Sets the value of the path property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPath(String value) {
                this.path = value;
            }

            /**
             * Gets the value of the mode property.
             * 
             */
            public long getMode() {
                return mode;
            }

            /**
             * Sets the value of the mode property.
             * 
             */
            public void setMode(long value) {
                this.mode = value;
            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="storage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                 &lt;attribute name="used" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                 &lt;attribute name="wear_level" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "storage"
    })
    public static class StorageDescription {

        protected List<FileDescriptionReport.StorageDescription.Storage> storage;

        /**
         * Gets the value of the storage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStorage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FileDescriptionReport.StorageDescription.Storage }
         * 
         * 
         */
        public List<FileDescriptionReport.StorageDescription.Storage> getStorage() {
            if (storage == null) {
                storage = new ArrayList<FileDescriptionReport.StorageDescription.Storage>();
            }
            return this.storage;
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
         *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="used" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="wear_level" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Storage {

            @XmlAttribute(name = "path", required = true)
            protected String path;
            @XmlAttribute(name = "type", required = true)
            protected String type;
            @XmlAttribute(name = "size", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger size;
            @XmlAttribute(name = "used", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger used;
            @XmlAttribute(name = "wear_level")
            @XmlSchemaType(name = "unsignedInt")
            protected Long wearLevel;

            /**
             * Gets the value of the path property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPath() {
                return path;
            }

            /**
             * Sets the value of the path property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPath(String value) {
                this.path = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSize(BigInteger value) {
                this.size = value;
            }

            /**
             * Gets the value of the used property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsed() {
                return used;
            }

            /**
             * Sets the value of the used property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsed(BigInteger value) {
                this.used = value;
            }

            /**
             * Gets the value of the wearLevel property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWearLevel() {
                return wearLevel;
            }

            /**
             * Sets the value of the wearLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWearLevel(Long value) {
                this.wearLevel = value;
            }

        }

    }

}
