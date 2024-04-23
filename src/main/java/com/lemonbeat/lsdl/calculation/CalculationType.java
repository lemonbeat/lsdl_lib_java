
package com.lemonbeat.lsdl.calculation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the left property.
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
     * Sets the value of the left property.
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
     * Gets the value of the right property.
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
     * Sets the value of the right property.
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
     * Gets the value of the calculationId property.
     * 
     */
    public long getCalculationId() {
        return calculationId;
    }

    /**
     * Sets the value of the calculationId property.
     * 
     */
    public void setCalculationId(long value) {
        this.calculationId = value;
    }

    /**
     * Gets the value of the methodId property.
     * 
     */
    public long getMethodId() {
        return methodId;
    }

    /**
     * Sets the value of the methodId property.
     * 
     */
    public void setMethodId(long value) {
        this.methodId = value;
    }

}
