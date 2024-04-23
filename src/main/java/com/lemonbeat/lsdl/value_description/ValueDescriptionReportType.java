
package com.lemonbeat.lsdl.value_description;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueDescriptionReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueDescriptionReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value_description" type="{urn:value_descriptionxsd}valueDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueDescriptionReportType", propOrder = {
    "valueDescription"
})
public class ValueDescriptionReportType {

    @XmlElement(name = "value_description")
    protected List<ValueDescriptionType> valueDescription;

    /**
     * Gets the value of the valueDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueDescriptionType }
     * 
     * 
     */
    public List<ValueDescriptionType> getValueDescription() {
        if (valueDescription == null) {
            valueDescription = new ArrayList<ValueDescriptionType>();
        }
        return this.valueDescription;
    }

}
