//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:32 PM CEST 
//


package com.lemonbeat.lsdl.partner_information;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r partnerInformationReportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="partnerInformationReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element name="partner" type="{urn:partner_informationxsd}partnerType"/>
 *             &lt;element name="group" type="{urn:partner_informationxsd}groupType"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerInformationReportType", propOrder = {
    "partnerOrGroup"
})
public class PartnerInformationReportType {

    @XmlElements({
        @XmlElement(name = "partner", type = PartnerType.class),
        @XmlElement(name = "group", type = GroupType.class)
    })
    protected List<Object> partnerOrGroup;

    /**
     * Gets the value of the partnerOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerType }
     * {@link GroupType }
     * 
     * 
     */
    public List<Object> getPartnerOrGroup() {
        if (partnerOrGroup == null) {
            partnerOrGroup = new ArrayList<Object>();
        }
        return this.partnerOrGroup;
    }

}
