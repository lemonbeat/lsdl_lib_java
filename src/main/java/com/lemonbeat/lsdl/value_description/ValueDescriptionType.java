//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:38 PM CEST 
//


package com.lemonbeat.lsdl.value_description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für valueDescriptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="valueDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="number_format" type="{urn:value_descriptionxsd}numberFormatType"/>
 *         &lt;element name="string_format" type="{urn:value_descriptionxsd}stringFormatType"/>
 *         &lt;element name="hexBinary_format" type="{urn:value_descriptionxsd}hexBinaryFormatType"/>
 *       &lt;/choice>
 *       &lt;attribute name="value_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="type_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="persistent" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min_log_interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="max_log_values" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="virtual" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueDescriptionType", propOrder = {
    "numberFormat",
    "stringFormat",
    "hexBinaryFormat"
})
public class ValueDescriptionType {

    @XmlElement(name = "number_format")
    protected NumberFormatType numberFormat;
    @XmlElement(name = "string_format")
    protected StringFormatType stringFormat;
    @XmlElement(name = "hexBinary_format")
    protected HexBinaryFormatType hexBinaryFormat;
    @XmlAttribute(name = "value_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long valueId;
    @XmlAttribute(name = "type_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long typeId;
    @XmlAttribute(name = "mode", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long mode;
    @XmlAttribute(name = "persistent", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long persistent;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "min_log_interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minLogInterval;
    @XmlAttribute(name = "max_log_values")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxLogValues;
    @XmlAttribute(name = "virtual")
    @XmlSchemaType(name = "unsignedInt")
    protected Long virtual;

    /**
     * Ruft den Wert der numberFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumberFormatType }
     *     
     */
    public NumberFormatType getNumberFormat() {
        return numberFormat;
    }

    /**
     * Legt den Wert der numberFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberFormatType }
     *     
     */
    public void setNumberFormat(NumberFormatType value) {
        this.numberFormat = value;
    }

    /**
     * Ruft den Wert der stringFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringFormatType }
     *     
     */
    public StringFormatType getStringFormat() {
        return stringFormat;
    }

    /**
     * Legt den Wert der stringFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringFormatType }
     *     
     */
    public void setStringFormat(StringFormatType value) {
        this.stringFormat = value;
    }

    /**
     * Ruft den Wert der hexBinaryFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryFormatType }
     *     
     */
    public HexBinaryFormatType getHexBinaryFormat() {
        return hexBinaryFormat;
    }

    /**
     * Legt den Wert der hexBinaryFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryFormatType }
     *     
     */
    public void setHexBinaryFormat(HexBinaryFormatType value) {
        this.hexBinaryFormat = value;
    }

    /**
     * Ruft den Wert der valueId-Eigenschaft ab.
     * 
     */
    public long getValueId() {
        return valueId;
    }

    /**
     * Legt den Wert der valueId-Eigenschaft fest.
     * 
     */
    public void setValueId(long value) {
        this.valueId = value;
    }

    /**
     * Ruft den Wert der typeId-Eigenschaft ab.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Legt den Wert der typeId-Eigenschaft fest.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     */
    public long getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     */
    public void setMode(long value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der persistent-Eigenschaft ab.
     * 
     */
    public long getPersistent() {
        return persistent;
    }

    /**
     * Legt den Wert der persistent-Eigenschaft fest.
     * 
     */
    public void setPersistent(long value) {
        this.persistent = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der minLogInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinLogInterval() {
        return minLogInterval;
    }

    /**
     * Legt den Wert der minLogInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinLogInterval(Long value) {
        this.minLogInterval = value;
    }

    /**
     * Ruft den Wert der maxLogValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLogValues() {
        return maxLogValues;
    }

    /**
     * Legt den Wert der maxLogValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLogValues(Long value) {
        this.maxLogValues = value;
    }

    /**
     * Ruft den Wert der virtual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVirtual() {
        return virtual;
    }

    /**
     * Legt den Wert der virtual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVirtual(Long value) {
        this.virtual = value;
    }

}
