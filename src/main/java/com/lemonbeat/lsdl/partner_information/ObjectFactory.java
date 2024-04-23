
package com.lemonbeat.lsdl.partner_information;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.partner_information package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.partner_information
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link Network.Device }
     * 
     */
    public Network.Device createNetworkDevice() {
        return new Network.Device();
    }

    /**
     * Create an instance of {@link PartnerInformationGetType }
     * 
     */
    public PartnerInformationGetType createPartnerInformationGetType() {
        return new PartnerInformationGetType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link PartnerInformationMemoryGetType }
     * 
     */
    public PartnerInformationMemoryGetType createPartnerInformationMemoryGetType() {
        return new PartnerInformationMemoryGetType();
    }

    /**
     * Create an instance of {@link PartnerInformationMemoryReportType }
     * 
     */
    public PartnerInformationMemoryReportType createPartnerInformationMemoryReportType() {
        return new PartnerInformationMemoryReportType();
    }

    /**
     * Create an instance of {@link PartnerInformationReportType }
     * 
     */
    public PartnerInformationReportType createPartnerInformationReportType() {
        return new PartnerInformationReportType();
    }

    /**
     * Create an instance of {@link PartnerType }
     * 
     */
    public PartnerType createPartnerType() {
        return new PartnerType();
    }

    /**
     * Create an instance of {@link GroupPartnerType }
     * 
     */
    public GroupPartnerType createGroupPartnerType() {
        return new GroupPartnerType();
    }

    /**
     * Create an instance of {@link PartnerInformationSetType }
     * 
     */
    public PartnerInformationSetType createPartnerInformationSetType() {
        return new PartnerInformationSetType();
    }

    /**
     * Create an instance of {@link PartnerInformationDeleteType }
     * 
     */
    public PartnerInformationDeleteType createPartnerInformationDeleteType() {
        return new PartnerInformationDeleteType();
    }

}
