package com.lemonbeat.lsdl;

import javax.xml.bind.*;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides some convenience methods for writing and parsing of common LsDL messages.
 *
 * @version 1.13.0
 */
public class LsDL {

    /**
     * This method converts LsDL XML into an object.
     *
     * Examples:
     *
     * LsDL.parse(device_description_report_xml, com.lemonbeat.lsdl.device_description.Network.class);
     * LsDL.parse(value_report_xml, com.lemonbeat.lsdl.value.Network.class);
     *
     * @param xml String with the raw LsDL.
     * @param lsdlClass Class that indicates from which XSD the xml is.
     * @return Casted Lsdl object
     * @throws JAXBException
     */
    public static Object parse(String xml, Class lsdlClass) throws JAXBException {
        ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(LsDL.autoRemoveBom(xml).getBytes());
        JAXBContext context = JAXBContext.newInstance(lsdlClass);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return lsdlClass.cast(unmarshaller.unmarshal(xmlContentBytes));
    }

    /**
     * Returns the LsDL XML as string.
     * @param lsdl Lsdl object
     * @return Lsdl XML as string
     */
    public static String write(Object lsdl) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(lsdl, sw);
        return sw.toString();
    }


    /**
     * Parse a LsDL device_description_report and return the info items as a list.
     * See specification (Version 1.13) - 2.2.6.2
     *
     * @param xml device_description_report as XML string
     * @return List of info types
     * @throws JAXBException
     */
    public static List<com.lemonbeat.lsdl.device_description.InfoType> parseDeviceDescriptionReport(String xml) throws JAXBException {
        Object obj = parse(xml, com.lemonbeat.lsdl.device_description.Network.class);
        com.lemonbeat.lsdl.device_description.Network deviceDescription = (com.lemonbeat.lsdl.device_description.Network) obj;
        com.lemonbeat.lsdl.device_description.Network.Device device = deviceDescription.getDevice().get(0);
        com.lemonbeat.lsdl.device_description.DeviceDescriptionType deviceDescriptionReport
                = (com.lemonbeat.lsdl.device_description.DeviceDescriptionType) device.getDeviceDescriptionGetOrDeviceDescriptionReportOrDeviceDescriptionSet().get(0).getValue();
        return deviceDescriptionReport.getInfo();
    }

    /**
     * Parse a LsDL value_description_report and return the types as a list.
     * See specification (Version 1.13) - 2.2.7
     *
     * @param xml value_description_report as XML string
     * @return List of value description items
     * @throws JAXBException
     */
    public static List<com.lemonbeat.lsdl.value_description.ValueDescriptionType> parseValueDescriptionReport(String xml) throws JAXBException {
        Object obj = parse(xml, com.lemonbeat.lsdl.value_description.Network.class);
        com.lemonbeat.lsdl.value_description.Network valueDescription = (com.lemonbeat.lsdl.value_description.Network) obj;
        com.lemonbeat.lsdl.value_description.Network.Device device = valueDescription.getDevice().get(0);
        com.lemonbeat.lsdl.value_description.ValueDescriptionReportType valueDescriptionReport
                = (com.lemonbeat.lsdl.value_description.ValueDescriptionReportType) device.getValueDescriptionGetOrValueDescriptionReportOrValueDescriptionAdd().get(0);
        return valueDescriptionReport.getValueDescription();
    }

    /**
     * Parse a LsDL value_report and return the values as a list.
     * See specification (Version 1.13) - 2.2.8
     *
     * @param xml value_report as XML string
     * @return List of value items
     * @throws JAXBException
     */
    public static List<com.lemonbeat.lsdl.value.ValueReportType> parseValueReport(String xml) throws JAXBException {
        Object obj = parse(xml, com.lemonbeat.lsdl.value.Network.class);
        com.lemonbeat.lsdl.value.Network value = (com.lemonbeat.lsdl.value.Network) obj;
        com.lemonbeat.lsdl.value.Network.Device device = value.getDevice().get(0);

        ArrayList<com.lemonbeat.lsdl.value.ValueReportType> valueReportItems = new ArrayList<>();
        List<Object> items = device.getValueGetOrValueReportOrValueSet();
        for(Object i : items) {
            com.lemonbeat.lsdl.value.ValueReportType v = (com.lemonbeat.lsdl.value.ValueReportType) i;
            valueReportItems.add(v);
        }
        return valueReportItems;
    }

    /**
     * Create a LsDL value_set XML from the given list.
     * @param items List of value_set items.
     * @return value_set as Lsdl Object.
     */
    public static com.lemonbeat.lsdl.value.Network createValueSet(List<com.lemonbeat.lsdl.value.ValueSetType> items) {
        com.lemonbeat.lsdl.value.ObjectFactory factory = new com.lemonbeat.lsdl.value.ObjectFactory();
        com.lemonbeat.lsdl.value.Network network = factory.createNetwork();
        com.lemonbeat.lsdl.value.Network.Device device = factory.createNetworkDevice();
        device.setVersion(1);
        device.getValueGetOrValueReportOrValueSet().addAll(items);
        network.getDevice().add(device);
        network.setVersion(1);
        return network;
    }

    private static String autoRemoveBom(String s){
        String UTF8_BOM = "\uFEFF";
        if(s.startsWith(UTF8_BOM)){
            s = s.substring(1);
        }
        return s;
    }

}
