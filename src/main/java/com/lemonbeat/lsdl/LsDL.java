package com.lemonbeat.lsdl;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;

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

}
