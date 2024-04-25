
package com.lemonbeat.lsdl.file;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request a chunk of a file.
 * 
 *         Responded by file_get_data_report.
 *       
 * 
 * <p>Java class for file_get_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file_get_data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="handle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="offset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_get_data")
public class FileGetData {

    @XmlAttribute(name = "handle", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long handle;
    @XmlAttribute(name = "offset", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger offset;

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
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

}
