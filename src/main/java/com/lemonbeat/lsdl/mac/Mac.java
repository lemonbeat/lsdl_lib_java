
package com.lemonbeat.lsdl.mac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mac_option_ack_request" type="{urn:macxsd}mac_option_ack_requestType"/>
 *         &lt;element name="mac_option_ack" type="{urn:macxsd}mac_option_ackType"/>
 *         &lt;element name="mac_option_fragment" type="{urn:macxsd}mac_option_fragmentType" minOccurs="0"/>
 *         &lt;element name="mac_option_channel_map" type="{urn:macxsd}mac_option_channel_mapType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mac_option_wake_on_radio" type="{urn:macxsd}mac_option_wake_on_radioType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mac_layer_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="frame_nonce" use="required" type="{urn:macxsd}frame_nonceType" />
 *       &lt;attribute name="mac_source_address" use="required" type="{urn:macxsd}mac_source_addressType" />
 *       &lt;attribute name="frame_integrity_code" use="required" type="{urn:macxsd}frame_integrity_codeType" />
 *       &lt;attribute name="mac_destination_adress" use="required" type="{urn:macxsd}mac_destination_adressType" />
 *       &lt;attribute name="content_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "macOptionAckRequest",
    "macOptionAck",
    "macOptionFragment",
    "macOptionChannelMap",
    "macOptionWakeOnRadio"
})
@XmlRootElement(name = "mac")
public class Mac {

    @XmlElement(name = "mac_option_ack_request", required = true)
    protected MacOptionAckRequestType macOptionAckRequest;
    @XmlElement(name = "mac_option_ack", required = true)
    protected MacOptionAckType macOptionAck;
    @XmlElement(name = "mac_option_fragment")
    protected MacOptionFragmentType macOptionFragment;
    @XmlElement(name = "mac_option_channel_map")
    protected List<MacOptionChannelMapType> macOptionChannelMap;
    @XmlElement(name = "mac_option_wake_on_radio", required = true)
    protected MacOptionWakeOnRadioType macOptionWakeOnRadio;
    @XmlAttribute(name = "mac_layer_version", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long macLayerVersion;
    @XmlAttribute(name = "frame_nonce", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] frameNonce;
    @XmlAttribute(name = "mac_source_address", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] macSourceAddress;
    @XmlAttribute(name = "frame_integrity_code", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] frameIntegrityCode;
    @XmlAttribute(name = "mac_destination_adress", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] macDestinationAdress;
    @XmlAttribute(name = "content_type", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long contentType;

    /**
     * Gets the value of the macOptionAckRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MacOptionAckRequestType }
     *     
     */
    public MacOptionAckRequestType getMacOptionAckRequest() {
        return macOptionAckRequest;
    }

    /**
     * Sets the value of the macOptionAckRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacOptionAckRequestType }
     *     
     */
    public void setMacOptionAckRequest(MacOptionAckRequestType value) {
        this.macOptionAckRequest = value;
    }

    /**
     * Gets the value of the macOptionAck property.
     * 
     * @return
     *     possible object is
     *     {@link MacOptionAckType }
     *     
     */
    public MacOptionAckType getMacOptionAck() {
        return macOptionAck;
    }

    /**
     * Sets the value of the macOptionAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacOptionAckType }
     *     
     */
    public void setMacOptionAck(MacOptionAckType value) {
        this.macOptionAck = value;
    }

    /**
     * Gets the value of the macOptionFragment property.
     * 
     * @return
     *     possible object is
     *     {@link MacOptionFragmentType }
     *     
     */
    public MacOptionFragmentType getMacOptionFragment() {
        return macOptionFragment;
    }

    /**
     * Sets the value of the macOptionFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacOptionFragmentType }
     *     
     */
    public void setMacOptionFragment(MacOptionFragmentType value) {
        this.macOptionFragment = value;
    }

    /**
     * Gets the value of the macOptionChannelMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macOptionChannelMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacOptionChannelMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MacOptionChannelMapType }
     * 
     * 
     */
    public List<MacOptionChannelMapType> getMacOptionChannelMap() {
        if (macOptionChannelMap == null) {
            macOptionChannelMap = new ArrayList<MacOptionChannelMapType>();
        }
        return this.macOptionChannelMap;
    }

    /**
     * Gets the value of the macOptionWakeOnRadio property.
     * 
     * @return
     *     possible object is
     *     {@link MacOptionWakeOnRadioType }
     *     
     */
    public MacOptionWakeOnRadioType getMacOptionWakeOnRadio() {
        return macOptionWakeOnRadio;
    }

    /**
     * Sets the value of the macOptionWakeOnRadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacOptionWakeOnRadioType }
     *     
     */
    public void setMacOptionWakeOnRadio(MacOptionWakeOnRadioType value) {
        this.macOptionWakeOnRadio = value;
    }

    /**
     * Gets the value of the macLayerVersion property.
     * 
     */
    public long getMacLayerVersion() {
        return macLayerVersion;
    }

    /**
     * Sets the value of the macLayerVersion property.
     * 
     */
    public void setMacLayerVersion(long value) {
        this.macLayerVersion = value;
    }

    /**
     * Gets the value of the frameNonce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getFrameNonce() {
        return frameNonce;
    }

    /**
     * Sets the value of the frameNonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameNonce(byte[] value) {
        this.frameNonce = value;
    }

    /**
     * Gets the value of the macSourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMacSourceAddress() {
        return macSourceAddress;
    }

    /**
     * Sets the value of the macSourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacSourceAddress(byte[] value) {
        this.macSourceAddress = value;
    }

    /**
     * Gets the value of the frameIntegrityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getFrameIntegrityCode() {
        return frameIntegrityCode;
    }

    /**
     * Sets the value of the frameIntegrityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameIntegrityCode(byte[] value) {
        this.frameIntegrityCode = value;
    }

    /**
     * Gets the value of the macDestinationAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMacDestinationAdress() {
        return macDestinationAdress;
    }

    /**
     * Sets the value of the macDestinationAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacDestinationAdress(byte[] value) {
        this.macDestinationAdress = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     */
    public long getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     */
    public void setContentType(long value) {
        this.contentType = value;
    }

}
