
package com.lemonbeat.lsdl.timer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="timer_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="after" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="calculation_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="action_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeType")
public class ExecuteType {

    @XmlAttribute(name = "timer_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long timerId;
    @XmlAttribute(name = "after", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long after;
    @XmlAttribute(name = "calculation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long calculationId;
    @XmlAttribute(name = "action_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long actionId;

    /**
     * Gets the value of the timerId property.
     * 
     */
    public long getTimerId() {
        return timerId;
    }

    /**
     * Sets the value of the timerId property.
     * 
     */
    public void setTimerId(long value) {
        this.timerId = value;
    }

    /**
     * Gets the value of the after property.
     * 
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     */
    public void setAfter(long value) {
        this.after = value;
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
     * Gets the value of the actionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActionId(Long value) {
        this.actionId = value;
    }

}
