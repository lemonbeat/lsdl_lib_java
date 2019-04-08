package com.lemonbeat.lsdl;

import com.lemonbeat.lsdl.value.Network;
import com.lemonbeat.lsdl.value.ObjectFactory;
import com.lemonbeat.lsdl.value.ValueSetType;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LsDLTest {

    @Test
    public void testUsage() {
        ObjectFactory factory = new ObjectFactory();
        Network network = factory.createNetwork();
        Network.Device device = factory.createNetworkDevice();
        ValueSetType valueSet = factory.createValueSetType();
        valueSet.setValueId(1L);
        valueSet.setNumber(99.9);
        device.getValueGetOrValueReportOrValueSet().add(valueSet);
        network.getDevice().add(device);
        String lsdl = LsDL.write(network);
        System.out.println(lsdl);
    }

    @Test
    public void testAction() {
        testLsdlServiceSampleParsing("action", com.lemonbeat.lsdl.action.Network.class);
    }

    @Test
    public void testCalculation() {
        testLsdlServiceSampleParsing("calculation", com.lemonbeat.lsdl.calculation.Network.class);
    }

    @Test
    public void testCalendar() {
        testLsdlServiceSampleParsing("calendar", com.lemonbeat.lsdl.calendar.Network.class);
    }

    @Test
    public void testConfiguration() {
        testLsdlServiceSampleParsing("configuration", com.lemonbeat.lsdl.configuration.Network.class);
    }

    @Test
    public void testDeviceDescription() {
        testLsdlServiceSampleParsing("device_description", com.lemonbeat.lsdl.device_description.Network.class);
    }

    @Test
    public void testFirmwareUpdate() {
        testLsdlServiceSampleParsing("firmware_update", com.lemonbeat.lsdl.firmware_update.Network.class);
    }

    @Test
    public void testMac() {
        testLsdlServiceSampleParsing("mac", com.lemonbeat.lsdl.mac.Mac.class);
    }

    @Test
    public void testMemoryInformation() {
        testLsdlServiceSampleParsing("memory_information", com.lemonbeat.lsdl.memory_information.Network.class);
    }

    @Test
    public void testNetworkManagement() {
        testLsdlServiceSampleParsing("network_management", com.lemonbeat.lsdl.network_management.Network.class);
    }

    @Test
    public void testPartnerInformation() {
        testLsdlServiceSampleParsing("partner_information", com.lemonbeat.lsdl.partner_information.Network.class);
    }

    @Test
    public void testPartnerLink() {
        testLsdlServiceSampleParsing("partner_link", com.lemonbeat.lsdl.partner_information.Network.class);
    }

    @Test
    public void testPhy() {
        testLsdlServiceSampleParsing("phy", com.lemonbeat.lsdl.phy.Phy.class);
    }

    @Test
    public void testPublicKey() {
        testLsdlServiceSampleParsing("public_key", com.lemonbeat.lsdl.public_key.Network.class);
    }

    @Test
    public void testServiceDescription() {
        testLsdlServiceSampleParsing("service_description", com.lemonbeat.lsdl.service_description.Network.class);
    }

    @Test
    public void testStatemachine() {
        testLsdlServiceSampleParsing("statemachine", com.lemonbeat.lsdl.statemachine.Network.class);
    }

    @Test
    public void testStatus() {
        testLsdlServiceSampleParsing("status", com.lemonbeat.lsdl.status.Network.class);
    }

    @Test
    public void testTimer() {
        testLsdlServiceSampleParsing("timer", com.lemonbeat.lsdl.timer.Network.class);
    }

    @Test
    public void testValue() {
        testLsdlServiceSampleParsing("value", com.lemonbeat.lsdl.value.Network.class);
    }

    @Test
    public void testValueDescription() {
        testLsdlServiceSampleParsing("value_description", com.lemonbeat.lsdl.value_description.Network.class);
    }

    @Test
    public void testParseDeviceDescriptionReport() {
        File file = new File("lsdl_xsd/samples/device_description/2xml_device_description_report_1.xml");
        String xml = readFile(file);
        try {
            List<com.lemonbeat.lsdl.device_description.InfoType> infos = LsDL.parseDeviceDescriptionReport(xml);
            assert infos.size() == 14;
        } catch(JAXBException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testParseValueDescriptionReport(){
        File file = new File("lsdl_xsd/samples/value_description/7xml_value_description_report_3.xml");
        String xml = readFile(file);
        try {
            List<com.lemonbeat.lsdl.value_description.ValueDescriptionType> valueDescriptions = LsDL.parseValueDescriptionReport(xml);
            assert valueDescriptions.size() == 2;
        } catch(JAXBException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testParseValueReport(){
        File file = new File("lsdl_xsd/samples/value/5xml_value_report_3.xml");
        String xml = readFile(file);
        try {
            List<com.lemonbeat.lsdl.value.ValueReportType> valueReportItems = LsDL.parseValueReport(xml);
            assert valueReportItems.size() == 2;
            assert valueReportItems.get(0).getValueId() == 1;
            assert valueReportItems.get(0).getNumber() == 55.0;
            assert valueReportItems.get(1).getValueId() == 2;
            assert valueReportItems.get(1).getString().equals("ON");
        } catch(JAXBException ex){
            ex.printStackTrace();
        }
    }

    private void testLsdlServiceSampleParsing(String lsdlServiceName, Class networkNodeClass) {
        List<File> samples = listSampleFiles(lsdlServiceName);
        for(File f: samples){
            String lsdlXml = readFile(f);
            System.out.println(f);
            System.out.println(lsdlXml);
            try {
                Object lsdlObj = networkNodeClass.cast(LsDL.parse(lsdlXml, networkNodeClass));
                assertNotNull(lsdlObj);
                assertTrue(networkNodeClass.isInstance(lsdlObj));
                System.out.println(LsDL.write(lsdlObj));

            } catch(JAXBException ex){
                ex.printStackTrace();
            }
        }
    }

    private String readFile(File file) {
        try {
            byte[] encoded = Files.readAllBytes(file.toPath());
            return new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private List<File> listSampleFiles(String lsdlService) {
        ArrayList<File> sampleFileList = new ArrayList<>();
        File folder = new File("lsdl_xsd/samples/" + lsdlService);
        if(folder.isDirectory() && folder.canRead()){
            for(File sampleFile : folder.listFiles()){
                if(sampleFile.getName().endsWith(".xml")){
                    sampleFileList.add(sampleFile);
                }
            }
        }
        return sampleFileList;
    }

}