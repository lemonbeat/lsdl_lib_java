
package com.lemonbeat.lsdl.value_description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numberFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="max" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="step" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberFormatType")
public class NumberFormatType {

    @XmlAttribute(name = "unit", required = true)
    protected String unit;
    @XmlAttribute(name = "min", required = true)
    protected double min;
    @XmlAttribute(name = "max", required = true)
    protected double max;
    @XmlAttribute(name = "step", required = true)
    protected double step;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the min property.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    /**
     * Gets the value of the step property.
     * 
     */
    public double getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     */
    public void setStep(double value) {
        this.step = value;
    }

}
