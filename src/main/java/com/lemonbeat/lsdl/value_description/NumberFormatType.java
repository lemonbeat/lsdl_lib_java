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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für numberFormatType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
     * Ruft den Wert der unit-Eigenschaft ab.
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
     * Legt den Wert der unit-Eigenschaft fest.
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
     * Ruft den Wert der min-Eigenschaft ab.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * Legt den Wert der min-Eigenschaft fest.
     * 
     */
    public void setMin(double value) {
        this.min = value;
    }

    /**
     * Ruft den Wert der max-Eigenschaft ab.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * Legt den Wert der max-Eigenschaft fest.
     * 
     */
    public void setMax(double value) {
        this.max = value;
    }

    /**
     * Ruft den Wert der step-Eigenschaft ab.
     * 
     */
    public double getStep() {
        return step;
    }

    /**
     * Legt den Wert der step-Eigenschaft fest.
     * 
     */
    public void setStep(double value) {
        this.step = value;
    }

}
