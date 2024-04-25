
package com.lemonbeat.lsdl.action;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for setType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="string" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hexBinary" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="partner_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="calculation_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="transport_mode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setType")
public class SetType {

    @XmlAttribute(name = "value_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long valueId;
    @XmlAttribute(name = "number")
    protected Double number;
    @XmlAttribute(name = "string")
    protected String string;
    @XmlAttribute(name = "hexBinary")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] hexBinary;
    @XmlAttribute(name = "partner_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long partnerId;
    @XmlAttribute(name = "calculation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long calculationId;
    @XmlAttribute(name = "transport_mode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transportMode;

    /**
     * Gets the value of the valueId property.
     * 
     */
    public long getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     */
    public void setValueId(long value) {
        this.valueId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber(Double value) {
        this.number = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the hexBinary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getHexBinary() {
        return hexBinary;
    }

    /**
     * Sets the value of the hexBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexBinary(byte[] value) {
        this.hexBinary = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartnerId(Long value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the calculationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCalculationId() {
        return calculationId;
    }

    /**
     * Sets the value of the calculationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCalculationId(Long value) {
        this.calculationId = value;
    }

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportMode(Long value) {
        this.transportMode = value;
    }

}
