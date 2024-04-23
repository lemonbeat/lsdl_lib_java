
package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mac_option_ackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mac_option_ackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rssi" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mac_option_ackType")
public class MacOptionAckType {

    @XmlAttribute(name = "rssi", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long rssi;

    /**
     * Gets the value of the rssi property.
     * 
     */
    public long getRssi() {
        return rssi;
    }

    /**
     * Sets the value of the rssi property.
     * 
     */
    public void setRssi(long value) {
        this.rssi = value;
    }

}
