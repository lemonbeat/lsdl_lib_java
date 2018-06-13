//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:39 PM CEST 
//


package com.lemonbeat.lsdl.calculation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für calSubType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
     * Ruft den Wert der valueId-Eigenschaft ab.
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
     * Legt den Wert der valueId-Eigenschaft fest.
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
     * Ruft den Wert der calculationId-Eigenschaft ab.
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
     * Legt den Wert der calculationId-Eigenschaft fest.
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
     * Ruft den Wert der partnerId-Eigenschaft ab.
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
     * Legt den Wert der partnerId-Eigenschaft fest.
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
     * Ruft den Wert der statemachineId-Eigenschaft ab.
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
     * Legt den Wert der statemachineId-Eigenschaft fest.
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
     * Ruft den Wert der timerId-Eigenschaft ab.
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
     * Legt den Wert der timerId-Eigenschaft fest.
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
     * Ruft den Wert der calendarId-Eigenschaft ab.
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
     * Legt den Wert der calendarId-Eigenschaft fest.
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
     * Ruft den Wert der isUpdated-Eigenschaft ab.
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
     * Legt den Wert der isUpdated-Eigenschaft fest.
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
     * Ruft den Wert der constantNumber-Eigenschaft ab.
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
     * Legt den Wert der constantNumber-Eigenschaft fest.
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
     * Ruft den Wert der constantString-Eigenschaft ab.
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
     * Legt den Wert der constantString-Eigenschaft fest.
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
     * Ruft den Wert der constantHexBinary-Eigenschaft ab.
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
     * Legt den Wert der constantHexBinary-Eigenschaft fest.
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
