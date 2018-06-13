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
 * <p>Java-Klasse für mac_option_wake_on_radioType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="mac_option_wake_on_radioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="fraction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="interval" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="channel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mac_option_wake_on_radioType")
public class MacOptionWakeOnRadioType {

    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long timestamp;
    @XmlAttribute(name = "fraction", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long fraction;
    @XmlAttribute(name = "interval", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long interval;
    @XmlAttribute(name = "channel", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long channel;

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der fraction-Eigenschaft ab.
     * 
     */
    public long getFraction() {
        return fraction;
    }

    /**
     * Legt den Wert der fraction-Eigenschaft fest.
     * 
     */
    public void setFraction(long value) {
        this.fraction = value;
    }

    /**
     * Ruft den Wert der interval-Eigenschaft ab.
     * 
     */
    public long getInterval() {
        return interval;
    }

    /**
     * Legt den Wert der interval-Eigenschaft fest.
     * 
     */
    public void setInterval(long value) {
        this.interval = value;
    }

    /**
     * Ruft den Wert der channel-Eigenschaft ab.
     * 
     */
    public long getChannel() {
        return channel;
    }

    /**
     * Legt den Wert der channel-Eigenschaft fest.
     * 
     */
    public void setChannel(long value) {
        this.channel = value;
    }

}
