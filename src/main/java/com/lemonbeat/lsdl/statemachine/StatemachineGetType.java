
package com.lemonbeat.lsdl.statemachine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statemachineGetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statemachineGetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="statemachine_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="state_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statemachineGetType")
public class StatemachineGetType {

    @XmlAttribute(name = "statemachine_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long statemachineId;
    @XmlAttribute(name = "state_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stateId;

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
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateId(Long value) {
        this.stateId = value;
    }

}
