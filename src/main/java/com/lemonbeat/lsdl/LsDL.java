package com.lemonbeat.lsdl;

import javax.xml.bind.*;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class LsDL {

    public static Object parse(String xml, Class lsdlClass) throws JAXBException {
        ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(xml.getBytes());
        JAXBContext context = JAXBContext.newInstance(lsdlClass);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return lsdlClass.cast(unmarshaller.unmarshal(xmlContentBytes));
    }

    public static String write(Object lsdl) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(lsdl, sw);
        return sw.toString();
    }

    public static List<com.lemonbeat.lsdl.device_description.InfoType> parseDeviceDescriptionReport(String xml) throws JAXBException {
        Object obj = parse(xml, com.lemonbeat.lsdl.device_description.Network.class);
        com.lemonbeat.lsdl.device_description.Network deviceDescription = (com.lemonbeat.lsdl.device_description.Network) obj;
        com.lemonbeat.lsdl.device_description.Network.Device device = deviceDescription.getDevice().get(0);
        com.lemonbeat.lsdl.device_description.DeviceDescriptionType deviceDescriptionReport
                = (com.lemonbeat.lsdl.device_description.DeviceDescriptionType) device.getDeviceDescriptionGetOrDeviceDescriptionReportOrDeviceDescriptionSet().get(0).getValue();
        return deviceDescriptionReport.getInfo();
    }

    public static List<com.lemonbeat.lsdl.value_description.ValueDescriptionType> parseValueDescriptionReport(String xml) throws JAXBException {
        Object obj = parse(xml, com.lemonbeat.lsdl.value_description.Network.class);
        com.lemonbeat.lsdl.value_description.Network valueDescription = (com.lemonbeat.lsdl.value_description.Network) obj;
        com.lemonbeat.lsdl.value_description.Network.Device device = valueDescription.getDevice().get(0);
        com.lemonbeat.lsdl.value_description.ValueDescriptionReportType valueDescriptionReport
                = (com.lemonbeat.lsdl.value_description.ValueDescriptionReportType) device.getValueDescriptionGetOrValueDescriptionReportOrValueDescriptionAdd().get(0);
        return valueDescriptionReport.getValueDescription();
    }

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

}
