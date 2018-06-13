//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:31 PM CEST 
//


package com.lemonbeat.lsdl.action;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für invokeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="invokeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="action_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="partner_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invokeType")
public class InvokeType {

    @XmlAttribute(name = "action_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long actionId;
    @XmlAttribute(name = "partner_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long partnerId;

    /**
     * Ruft den Wert der actionId-Eigenschaft ab.
     * 
     */
    public long getActionId() {
        return actionId;
    }

    /**
     * Legt den Wert der actionId-Eigenschaft fest.
     * 
     */
    public void setActionId(long value) {
        this.actionId = value;
    }

    /**
     * Ruft den Wert der partnerId-Eigenschaft ab.
     * 
     */
    public long getPartnerId() {
        return partnerId;
    }

    /**
     * Legt den Wert der partnerId-Eigenschaft fest.
     * 
     */
    public void setPartnerId(long value) {
        this.partnerId = value;
    }

}
