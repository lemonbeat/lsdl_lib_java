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

Make sure you have docker installed and access to the Lemonbeat GitLab instance.
You can then run `make xjc` to regenerate the classes.
