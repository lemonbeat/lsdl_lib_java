
package com.lemonbeat.lsdl.channel_scan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for channelScanReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channelScanReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rssi_values" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="channel_map" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelScanReportType", propOrder = {
    "rssiValues"
})
public class ChannelScanReportType {

    @XmlElement(name = "rssi_values", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] rssiValues;
    @XmlAttribute(name = "channel_map", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] channelMap;

    /**
     * Gets the value of the rssiValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getRssiValues() {
        return rssiValues;
    }

    /**
     * Sets the value of the rssiValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssiValues(byte[] value) {
        this.rssiValues = value;
    }

    /**
     * Gets the value of the channelMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getChannelMap() {
        return channelMap;
    }

    /**
     * Sets the value of the channelMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelMap(byte[] value) {
        this.channelMap = value;
    }

}
