
package com.lemonbeat.lsdl.calendar;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the taskId property.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the start property.
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
     * Sets the value of the start property.
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

    /**
     * Gets the value of the end property.
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
     * Sets the value of the end property.
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
     * Gets the value of the repeat property.
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
     * Sets the value of the repeat property.
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
     * Gets the value of the weekdays property.
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
     * Sets the value of the weekdays property.
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
