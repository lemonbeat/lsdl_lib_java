
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the payload property.
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
     * Sets the value of the payload property.
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
     * Gets the value of the phyLayerVersion property.
     * 
     */
    public long getPhyLayerVersion() {
        return phyLayerVersion;
    }

    /**
     * Sets the value of the phyLayerVersion property.
     * 
     */
    public void setPhyLayerVersion(long value) {
        this.phyLayerVersion = value;
    }

    /**
     * Gets the value of the security property.
     * 
     */
    public long getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     */
    public void setSecurity(long value) {
        this.security = value;
    }

    /**
     * Gets the value of the fowardErrorCorrection property.
     * 
     */
    public long getFowardErrorCorrection() {
        return fowardErrorCorrection;
    }

    /**
     * Sets the value of the fowardErrorCorrection property.
     * 
     */
    public void setFowardErrorCorrection(long value) {
        this.fowardErrorCorrection = value;
    }

    /**
     * Gets the value of the fowardErrorCorrectionLength property.
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
     * Sets the value of the fowardErrorCorrectionLength property.
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
