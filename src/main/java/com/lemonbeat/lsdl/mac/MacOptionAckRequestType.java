
package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mac_option_ack_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mac_option_ack_requestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nr_retries" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mac_option_ack_requestType")
public class MacOptionAckRequestType {

    @XmlAttribute(name = "nr_retries", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long nrRetries;

    /**
     * Gets the value of the nrRetries property.
     * 
     */
    public long getNrRetries() {
        return nrRetries;
    }

    /**
     * Sets the value of the nrRetries property.
     * 
     */
    public void setNrRetries(long value) {
        this.nrRetries = value;
    }

}
