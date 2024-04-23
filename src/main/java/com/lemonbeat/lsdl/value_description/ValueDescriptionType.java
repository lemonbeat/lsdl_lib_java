
package com.lemonbeat.lsdl.value_description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the numberFormat property.
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
     * Sets the value of the numberFormat property.
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
     * Gets the value of the stringFormat property.
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
     * Sets the value of the stringFormat property.
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
     * Gets the value of the hexBinaryFormat property.
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
     * Sets the value of the hexBinaryFormat property.
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
     * Gets the value of the typeId property.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     */
    public long getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     */
    public void setMode(long value) {
        this.mode = value;
    }

    /**
     * Gets the value of the persistent property.
     * 
     */
    public long getPersistent() {
        return persistent;
    }

    /**
     * Sets the value of the persistent property.
     * 
     */
    public void setPersistent(long value) {
        this.persistent = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the minLogInterval property.
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
     * Sets the value of the minLogInterval property.
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
     * Gets the value of the maxLogValues property.
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
     * Sets the value of the maxLogValues property.
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
     * Gets the value of the virtual property.
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
     * Sets the value of the virtual property.
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
