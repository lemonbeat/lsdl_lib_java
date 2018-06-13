//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:40 PM CEST 
//


package com.lemonbeat.lsdl.calendar;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für taskType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="taskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="task_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="action_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="repeat" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="weekdays" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskType")
public class TaskType {

    @XmlAttribute(name = "task_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long taskId;
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger start;
    @XmlAttribute(name = "action_id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long actionId;
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger end;
    @XmlAttribute(name = "repeat")
    @XmlSchemaType(name = "unsignedInt")
    protected Long repeat;
    @XmlAttribute(name = "weekdays")
    @XmlSchemaType(name = "unsignedByte")
    protected Short weekdays;

    /**
     * Ruft den Wert der taskId-Eigenschaft ab.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Legt den Wert der taskId-Eigenschaft fest.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
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
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnd(BigInteger value) {
        this.end = value;
    }

    /**
     * Ruft den Wert der repeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeat() {
        return repeat;
    }

    /**
     * Legt den Wert der repeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeat(Long value) {
        this.repeat = value;
    }

    /**
     * Ruft den Wert der weekdays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekdays() {
        return weekdays;
    }

    /**
     * Legt den Wert der weekdays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekdays(Short value) {
        this.weekdays = value;
    }

}
