//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:47 PM CEST 
//


package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für mac_option_fragmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="mac_option_fragmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="is_last" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="offset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mac_option_fragmentType")
public class MacOptionFragmentType {

    @XmlAttribute(name = "is_last", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long isLast;
    @XmlAttribute(name = "offset", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long offset;

    /**
     * Ruft den Wert der isLast-Eigenschaft ab.
     * 
     */
    public long getIsLast() {
        return isLast;
    }

    /**
     * Legt den Wert der isLast-Eigenschaft fest.
     * 
     */
    public void setIsLast(long value) {
        this.isLast = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     */
    public long getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     */
    public void setOffset(long value) {
        this.offset = value;
    }

}
