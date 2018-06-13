//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:44 PM CEST 
//


package com.lemonbeat.lsdl.firmware_update;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für firmwareInformationReportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der firmwareId-Eigenschaft ab.
     * 
     */
    public long getFirmwareId() {
        return firmwareId;
    }

    /**
     * Legt den Wert der firmwareId-Eigenschaft fest.
     * 
     */
    public void setFirmwareId(long value) {
        this.firmwareId = value;
    }

    /**
     * Ruft den Wert der receivedSize-Eigenschaft ab.
     * 
     */
    public long getReceivedSize() {
        return receivedSize;
    }

    /**
     * Legt den Wert der receivedSize-Eigenschaft fest.
     * 
     */
    public void setReceivedSize(long value) {
        this.receivedSize = value;
    }

    /**
     * Ruft den Wert der chunkSize-Eigenschaft ab.
     * 
     */
    public long getChunkSize() {
        return chunkSize;
    }

    /**
     * Legt den Wert der chunkSize-Eigenschaft fest.
     * 
     */
    public void setChunkSize(long value) {
        this.chunkSize = value;
    }

}
