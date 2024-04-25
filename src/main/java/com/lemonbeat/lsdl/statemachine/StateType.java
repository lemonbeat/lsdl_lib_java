
package com.lemonbeat.lsdl.statemachine;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaction" type="{urn:statemachinexsd}transactionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stateType", propOrder = {
    "transaction"
})
public class StateType {

    @XmlElement(required = true)
    protected List<TransactionType> transaction;
    @XmlAttribute(name = "state_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long stateId;

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionType }
     * 
     * 
     */
    public List<TransactionType> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<TransactionType>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the stateId property.
     * 
     */
    public long getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     */
    public void setStateId(long value) {
        this.stateId = value;
    }

}
