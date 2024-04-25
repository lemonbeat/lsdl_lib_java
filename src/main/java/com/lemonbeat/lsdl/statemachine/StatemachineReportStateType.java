
package com.lemonbeat.lsdl.statemachine;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statemachineReportStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statemachineReportStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statemachine_state" type="{urn:statemachinexsd}statemachineStateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statemachineReportStateType", propOrder = {
    "statemachineState"
})
public class StatemachineReportStateType {

    @XmlElement(name = "statemachine_state")
    protected List<StatemachineStateType> statemachineState;

    /**
     * Gets the value of the statemachineState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statemachineState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatemachineState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatemachineStateType }
     * 
     * 
     */
    public List<StatemachineStateType> getStatemachineState() {
        if (statemachineState == null) {
            statemachineState = new ArrayList<StatemachineStateType>();
        }
        return this.statemachineState;
    }

}
