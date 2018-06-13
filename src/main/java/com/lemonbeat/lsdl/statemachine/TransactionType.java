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


/**
 * <p>Java-Klasse für transactionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="transactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="calculation_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="action_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="goto_state_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionType")
public class TransactionType {

    @XmlAttribute(name = "calculation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long calculationId;
    @XmlAttribute(name = "action_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long actionId;
    @XmlAttribute(name = "goto_state_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long gotoStateId;

    /**
     * Ruft den Wert der calculationId-Eigenschaft ab.
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
     * Legt den Wert der calculationId-Eigenschaft fest.
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
     * Ruft den Wert der actionId-Eigenschaft ab.
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
     * Legt den Wert der actionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActionId(Long value) {
        this.actionId = value;
    }

    /**
     * Ruft den Wert der gotoStateId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGotoStateId() {
        return gotoStateId;
    }

    /**
     * Legt den Wert der gotoStateId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGotoStateId(Long value) {
        this.gotoStateId = value;
    }

}
