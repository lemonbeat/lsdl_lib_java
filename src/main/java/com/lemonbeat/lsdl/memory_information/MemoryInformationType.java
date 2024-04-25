
package com.lemonbeat.lsdl.memory_information;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memoryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="memory_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="free_count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memoryInformationType")
public class MemoryInformationType {

    @XmlAttribute(name = "memory_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long memoryId;
    @XmlAttribute(name = "count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long count;
    @XmlAttribute(name = "free_count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long freeCount;

    /**
     * Gets the value of the memoryId property.
     * 
     */
    public long getMemoryId() {
        return memoryId;
    }

    /**
     * Sets the value of the memoryId property.
     * 
     */
    public void setMemoryId(long value) {
        this.memoryId = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the freeCount property.
     * 
     */
    public long getFreeCount() {
        return freeCount;
    }

    /**
     * Sets the value of the freeCount property.
     * 
     */
    public void setFreeCount(long value) {
        this.freeCount = value;
    }

}
