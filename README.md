# lsdl_lib

Java library for writing and reading LsDL XMLs using Java.

## Getting started

### Creating a value_set LsDL

```
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
```

### Parsing a value_set LsDL from string

```
Object valueSetLsdl = LsDL.parse(valueSetLsdlXML, com.lemonbeat.lsdl.Network.class)
```


## Regenerate classes using JAXB

```bash
cd lsdl_lib
git clone git@gitlab.lemonbeat.com:common/lsdl_xsd.git
cd lsbl_xsd/xsd
generate.bat
```
