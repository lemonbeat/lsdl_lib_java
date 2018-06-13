//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:35 PM CEST 
//


package com.lemonbeat.lsdl.statemachine;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für statemachineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="statemachineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="state" type="{urn:statemachinexsd}stateType"/>
 *       &lt;/choice>
 *       &lt;attribute name="statemachine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statemachineType", propOrder = {
    "state"
})
public class StatemachineType {

    protected List<StateType> state;
    @XmlAttribute(name = "statemachine_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long statemachineId;

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateType }
     * 
     * 
     */
    public List<StateType> getState() {
        if (state == null) {
            state = new ArrayList<StateType>();
        }
        return this.state;
    }

    /**
     * Ruft den Wert der statemachineId-Eigenschaft ab.
     * 
     */
    public long getStatemachineId() {
        return statemachineId;
    }

    /**
     * Legt den Wert der statemachineId-Eigenschaft fest.
     * 
     */
    public void setStatemachineId(long value) {
        this.statemachineId = value;
    }

}
