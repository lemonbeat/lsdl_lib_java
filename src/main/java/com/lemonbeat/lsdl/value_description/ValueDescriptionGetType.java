
package com.lemonbeat.lsdl.value_description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueDescriptionGetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueDescriptionGetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value_description_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueDescriptionGetType")
public class ValueDescriptionGetType {

    @XmlAttribute(name = "value_description_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long valueDescriptionId;

    /**
     * Gets the value of the valueDescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueDescriptionId() {
        return valueDescriptionId;
    }

    /**
     * Sets the value of the valueDescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueDescriptionId(Long value) {
        this.valueDescriptionId = value;
    }

}
