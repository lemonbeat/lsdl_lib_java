
package com.lemonbeat.lsdl.mac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mac_option_fragmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mac_option_fragmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="is_last" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="offset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mac_option_fragmentType")
public class MacOptionFragmentType {

    @XmlAttribute(name = "is_last", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long isLast;
    @XmlAttribute(name = "offset", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long offset;

    /**
     * Gets the value of the isLast property.
     * 
     */
    public long getIsLast() {
        return isLast;
    }

    /**
     * Sets the value of the isLast property.
     * 
     */
    public void setIsLast(long value) {
        this.isLast = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(long value) {
        this.offset = value;
    }

}
