//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:48 PM CEST 
//


package com.lemonbeat.lsdl.memory_information;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r memoryInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="memoryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="memory_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="free_count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memoryInformationType")
public class MemoryInformationType {

    @XmlAttribute(name = "memory_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long memoryId;
    @XmlAttribute(name = "count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long count;
    @XmlAttribute(name = "free_count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long freeCount;

    /**
     * Ruft den Wert der memoryId-Eigenschaft ab.
     * 
     */
    public long getMemoryId() {
        return memoryId;
    }

    /**
     * Legt den Wert der memoryId-Eigenschaft fest.
     * 
     */
    public void setMemoryId(long value) {
        this.memoryId = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der freeCount-Eigenschaft ab.
     * 
     */
    public long getFreeCount() {
        return freeCount;
    }

    /**
     * Legt den Wert der freeCount-Eigenschaft fest.
     * 
     */
    public void setFreeCount(long value) {
        this.freeCount = value;
    }

}
