
package com.lemonbeat.lsdl.calculation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for calSubType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calSubType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="calculation_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="partner_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="statemachine_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="timer_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="calendar_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="is_updated" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="constant_number" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="constant_string" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="constant_hexBinary" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calSubType")
public class CalSubType {

    @XmlAttribute(name = "value_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long valueId;
    @XmlAttribute(name = "calculation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long calculationId;
    @XmlAttribute(name = "partner_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long partnerId;
    @XmlAttribute(name = "statemachine_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long statemachineId;
    @XmlAttribute(name = "timer_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long timerId;
    @XmlAttribute(name = "calendar_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long calendarId;
    @XmlAttribute(name = "is_updated")
    @XmlSchemaType(name = "unsignedByte")
    protected Short isUpdated;
    @XmlAttribute(name = "constant_number")
    protected Double constantNumber;
    @XmlAttribute(name = "constant_string")
    protected String constantString;
    @XmlAttribute(name = "constant_hexBinary")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] constantHexBinary;

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueId(Long value) {
        this.valueId = value;
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
     * Gets the value of the statemachineId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatemachineId() {
        return statemachineId;
    }

    /**
     * Sets the value of the statemachineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatemachineId(Long value) {
        this.statemachineId = value;
    }

    /**
     * Gets the value of the timerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimerId() {
        return timerId;
    }

    /**
     * Sets the value of the timerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimerId(Long value) {
        this.timerId = value;
    }

    /**
     * Gets the value of the calendarId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCalendarId() {
        return calendarId;
    }

    /**
     * Sets the value of the calendarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCalendarId(Long value) {
        this.calendarId = value;
    }

    /**
     * Gets the value of the isUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsUpdated() {
        return isUpdated;
    }

    /**
     * Sets the value of the isUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsUpdated(Short value) {
        this.isUpdated = value;
    }

    /**
     * Gets the value of the constantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConstantNumber() {
        return constantNumber;
    }

    /**
     * Sets the value of the constantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConstantNumber(Double value) {
        this.constantNumber = value;
    }

    /**
     * Gets the value of the constantString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstantString() {
        return constantString;
    }

    /**
     * Sets the value of the constantString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstantString(String value) {
        this.constantString = value;
    }

    /**
     * Gets the value of the constantHexBinary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getConstantHexBinary() {
        return constantHexBinary;
    }

    /**
     * Sets the value of the constantHexBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstantHexBinary(byte[] value) {
        this.constantHexBinary = value;
    }

}
