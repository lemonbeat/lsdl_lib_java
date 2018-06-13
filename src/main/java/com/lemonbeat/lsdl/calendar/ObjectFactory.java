//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 11:49:40 PM CEST 
//


package com.lemonbeat.lsdl.calendar;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsdl.calendar package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsdl.calendar
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
     * Create an instance of {@link CalendarTimezoneGetType }
     * 
     */
    public CalendarTimezoneGetType createCalendarTimezoneGetType() {
        return new CalendarTimezoneGetType();
    }

    /**
     * Create an instance of {@link TaskType }
     * 
     */
    public TaskType createTaskType() {
        return new TaskType();
    }

    /**
     * Create an instance of {@link CalendarMemoryGetType }
     * 
     */
    public CalendarMemoryGetType createCalendarMemoryGetType() {
        return new CalendarMemoryGetType();
    }

    /**
     * Create an instance of {@link CalendarDeleteType }
     * 
     */
    public CalendarDeleteType createCalendarDeleteType() {
        return new CalendarDeleteType();
    }

    /**
     * Create an instance of {@link CalendarTimezoneSetType }
     * 
     */
    public CalendarTimezoneSetType createCalendarTimezoneSetType() {
        return new CalendarTimezoneSetType();
    }

    /**
     * Create an instance of {@link CalendarTimezoneReportType }
     * 
     */
    public CalendarTimezoneReportType createCalendarTimezoneReportType() {
        return new CalendarTimezoneReportType();
    }

    /**
     * Create an instance of {@link CalendarReportType }
     * 
     */
    public CalendarReportType createCalendarReportType() {
        return new CalendarReportType();
    }

    /**
     * Create an instance of {@link CalendarGetType }
     * 
     */
    public CalendarGetType createCalendarGetType() {
        return new CalendarGetType();
    }

    /**
     * Create an instance of {@link CalendarSetType }
     * 
     */
    public CalendarSetType createCalendarSetType() {
        return new CalendarSetType();
    }

    /**
     * Create an instance of {@link CalendarMemoryReportType }
     * 
     */
    public CalendarMemoryReportType createCalendarMemoryReportType() {
        return new CalendarMemoryReportType();
    }

}
