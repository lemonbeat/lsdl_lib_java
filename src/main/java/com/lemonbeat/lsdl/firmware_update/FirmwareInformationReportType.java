
package com.lemonbeat.lsdl.firmware_update;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firmwareInformationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firmwareInformationReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="firmware_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="received_size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="chunk_size" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firmwareInformationReportType")
public class FirmwareInformationReportType {

    @XmlAttribute(name = "size", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long size;
    @XmlAttribute(name = "firmware_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long firmwareId;
    @XmlAttribute(name = "received_size", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long receivedSize;
    @XmlAttribute(name = "chunk_size", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long chunkSize;

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the firmwareId property.
     * 
     */
    public long getFirmwareId() {
        return firmwareId;
    }

    /**
     * Sets the value of the firmwareId property.
     * 
     */
    public void setFirmwareId(long value) {
        this.firmwareId = value;
    }

    /**
     * Gets the value of the receivedSize property.
     * 
     */
    public long getReceivedSize() {
        return receivedSize;
    }

    /**
     * Sets the value of the receivedSize property.
     * 
     */
    public void setReceivedSize(long value) {
        this.receivedSize = value;
    }

    /**
     * Gets the value of the chunkSize property.
     * 
     */
    public long getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets the value of the chunkSize property.
     * 
     */
    public void setChunkSize(long value) {
        this.chunkSize = value;
    }

}
