
package com.lemonbeat.lsdl.file;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Confirms a received file chunk.
 * 
 *         Send as response to file_add_data.
 *       
 * 
 * <p>Java class for file_add_data_report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file_add_data_report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="handle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="next_offset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_add_data_report")
public class FileAddDataReport {

    @XmlAttribute(name = "handle", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long handle;
    @XmlAttribute(name = "status", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long status;
    @XmlAttribute(name = "next_offset", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger nextOffset;

    /**
     * Gets the value of the handle property.
     * 
     */
    public long getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     */
    public void setHandle(long value) {
        this.handle = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public long getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(long value) {
        this.status = value;
    }

    /**
     * Gets the value of the nextOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextOffset() {
        return nextOffset;
    }

    /**
     * Sets the value of the nextOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextOffset(BigInteger value) {
        this.nextOffset = value;
    }

}
