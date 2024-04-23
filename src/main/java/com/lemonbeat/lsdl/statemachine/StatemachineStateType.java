
package com.lemonbeat.lsdl.statemachine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for statemachineStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statemachineStateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedInt">
 *       &lt;attribute name="statemachine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statemachineStateType", propOrder = {
    "value"
})
public class StatemachineStateType {

    @XmlValue
    @XmlSchemaType(name = "unsignedInt")
    protected long value;
    @XmlAttribute(name = "statemachine_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long statemachineId;

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Gets the value of the statemachineId property.
     * 
     */
    public long getStatemachineId() {
        return statemachineId;
    }

    /**
     * Sets the value of the statemachineId property.
     * 
     */
    public void setStatemachineId(long value) {
        this.statemachineId = value;
    }

}
