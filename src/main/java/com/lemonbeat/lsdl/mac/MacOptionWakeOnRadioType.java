
package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mac_option_wake_on_radioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the timestamp property.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     */
    public long getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     */
    public void setFraction(long value) {
        this.fraction = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     */
    public long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     */
    public void setInterval(long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     */
    public long getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     */
    public void setChannel(long value) {
        this.channel = value;
    }

}
