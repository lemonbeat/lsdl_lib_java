//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:35 PM CEST 
//


package com.lemonbeat.lsdl.statemachine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für statemachineStateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     */
    public void setValue(long value) {
        this.value = value;
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
