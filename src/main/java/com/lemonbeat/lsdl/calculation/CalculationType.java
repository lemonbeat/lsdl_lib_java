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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calculationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calculationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="left" type="{urn:calculationxsd}calSubType"/>
 *         &lt;element name="right" type="{urn:calculationxsd}calSubType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="calculation_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="method_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculationType", propOrder = {
    "left",
    "right"
})
public class CalculationType {

    @XmlElement(required = true)
    protected CalSubType left;
    @XmlElement(required = true)
    protected CalSubType right;
    @XmlAttribute(name = "calculation_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long calculationId;
    @XmlAttribute(name = "method_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long methodId;

    /**
     * Ruft den Wert der left-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalSubType }
     *     
     */
    public CalSubType getLeft() {
        return left;
    }

    /**
     * Legt den Wert der left-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalSubType }
     *     
     */
    public void setLeft(CalSubType value) {
        this.left = value;
    }

    /**
     * Ruft den Wert der right-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalSubType }
     *     
     */
    public CalSubType getRight() {
        return right;
    }

    /**
     * Legt den Wert der right-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalSubType }
     *     
     */
    public void setRight(CalSubType value) {
        this.right = value;
    }

    /**
     * Ruft den Wert der calculationId-Eigenschaft ab.
     * 
     */
    public long getCalculationId() {
        return calculationId;
    }

    /**
     * Legt den Wert der calculationId-Eigenschaft fest.
     * 
     */
    public void setCalculationId(long value) {
        this.calculationId = value;
    }

    /**
     * Ruft den Wert der methodId-Eigenschaft ab.
     * 
     */
    public long getMethodId() {
        return methodId;
    }

    /**
     * Legt den Wert der methodId-Eigenschaft fest.
     * 
     */
    public void setMethodId(long value) {
        this.methodId = value;
    }

}
