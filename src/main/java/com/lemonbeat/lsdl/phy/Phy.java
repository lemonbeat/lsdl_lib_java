//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:33 PM CEST 
//


package com.lemonbeat.lsdl.phy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="payload" use="required" type="{urn:phyxsd}payloadType" />
 *       &lt;attribute name="phy_layer_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="security" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="foward_error_correction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="foward_error_correction_length" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "phy")
public class Phy {

    @XmlAttribute(name = "payload", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] payload;
    @XmlAttribute(name = "phy_layer_version", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long phyLayerVersion;
    @XmlAttribute(name = "security", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long security;
    @XmlAttribute(name = "foward_error_correction", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long fowardErrorCorrection;
    @XmlAttribute(name = "foward_error_correction_length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long fowardErrorCorrectionLength;

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(byte[] value) {
        this.payload = value;
    }

    /**
     * Ruft den Wert der phyLayerVersion-Eigenschaft ab.
     * 
     */
    public long getPhyLayerVersion() {
        return phyLayerVersion;
    }

    /**
     * Legt den Wert der phyLayerVersion-Eigenschaft fest.
     * 
     */
    public void setPhyLayerVersion(long value) {
        this.phyLayerVersion = value;
    }

    /**
     * Ruft den Wert der security-Eigenschaft ab.
     * 
     */
    public long getSecurity() {
        return security;
    }

    /**
     * Legt den Wert der security-Eigenschaft fest.
     * 
     */
    public void setSecurity(long value) {
        this.security = value;
    }

    /**
     * Ruft den Wert der fowardErrorCorrection-Eigenschaft ab.
     * 
     */
    public long getFowardErrorCorrection() {
        return fowardErrorCorrection;
    }

    /**
     * Legt den Wert der fowardErrorCorrection-Eigenschaft fest.
     * 
     */
    public void setFowardErrorCorrection(long value) {
        this.fowardErrorCorrection = value;
    }

    /**
     * Ruft den Wert der fowardErrorCorrectionLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFowardErrorCorrectionLength() {
        return fowardErrorCorrectionLength;
    }

    /**
     * Legt den Wert der fowardErrorCorrectionLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFowardErrorCorrectionLength(Long value) {
        this.fowardErrorCorrectionLength = value;
    }

}
