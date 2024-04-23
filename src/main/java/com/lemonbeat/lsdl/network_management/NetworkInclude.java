
package com.lemonbeat.lsdl.network_management;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for network_include complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="network_include">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>hexBinary">
 *       &lt;attribute name="address_size" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="inclusion_count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "network_include", propOrder = {
    "value"
})
public class NetworkInclude {

    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] value;
    @XmlAttribute(name = "address_size")
    @XmlSchemaType(name = "unsignedByte")
    protected Short addressSize;
    @XmlAttribute(name = "inclusion_count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long inclusionCount;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the addressSize property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAddressSize() {
        return addressSize;
    }

    /**
     * Sets the value of the addressSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAddressSize(Short value) {
        this.addressSize = value;
    }

    /**
     * Gets the value of the inclusionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInclusionCount() {
        return inclusionCount;
    }

    /**
     * Sets the value of the inclusionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInclusionCount(Long value) {
        this.inclusionCount = value;
    }

}
