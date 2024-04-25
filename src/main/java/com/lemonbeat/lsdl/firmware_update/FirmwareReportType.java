
package com.lemonbeat.lsdl.firmware_update;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firmwareReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firmwareReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="expected_offset" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firmwareReportType")
public class FirmwareReportType {

    @XmlAttribute(name = "status", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long status;
    @XmlAttribute(name = "expected_offset")
    @XmlSchemaType(name = "unsignedInt")
    protected Long expectedOffset;

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
     * Gets the value of the expectedOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpectedOffset() {
        return expectedOffset;
    }

    /**
     * Sets the value of the expectedOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpectedOffset(Long value) {
        this.expectedOffset = value;
    }

}
