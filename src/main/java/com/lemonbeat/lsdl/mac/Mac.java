//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:47 PM CEST 
//


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
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
     * Ruft den Wert der macOptionAckRequest-Eigenschaft ab.
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
     * Legt den Wert der macOptionAckRequest-Eigenschaft fest.
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
     * Ruft den Wert der macOptionAck-Eigenschaft ab.
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
     * Legt den Wert der macOptionAck-Eigenschaft fest.
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
     * Ruft den Wert der macOptionFragment-Eigenschaft ab.
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
     * Legt den Wert der macOptionFragment-Eigenschaft fest.
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
     * Ruft den Wert der macOptionWakeOnRadio-Eigenschaft ab.
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
     * Legt den Wert der macOptionWakeOnRadio-Eigenschaft fest.
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
     * Ruft den Wert der macLayerVersion-Eigenschaft ab.
     * 
     */
    public long getMacLayerVersion() {
        return macLayerVersion;
    }

    /**
     * Legt den Wert der macLayerVersion-Eigenschaft fest.
     * 
     */
    public void setMacLayerVersion(long value) {
        this.macLayerVersion = value;
    }

    /**
     * Ruft den Wert der frameNonce-Eigenschaft ab.
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
     * Legt den Wert der frameNonce-Eigenschaft fest.
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
     * Ruft den Wert der macSourceAddress-Eigenschaft ab.
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
     * Legt den Wert der macSourceAddress-Eigenschaft fest.
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
     * Ruft den Wert der frameIntegrityCode-Eigenschaft ab.
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
     * Legt den Wert der frameIntegrityCode-Eigenschaft fest.
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
     * Ruft den Wert der macDestinationAdress-Eigenschaft ab.
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
     * Legt den Wert der macDestinationAdress-Eigenschaft fest.
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
     * Ruft den Wert der contentType-Eigenschaft ab.
     * 
     */
    public long getContentType() {
        return contentType;
    }

    /**
     * Legt den Wert der contentType-Eigenschaft fest.
     * 
     */
    public void setContentType(long value) {
        this.contentType = value;
    }

}
