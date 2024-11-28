package org.practice2.task2;

public class TransportBuilder {
    protected Transport transport;

    public TransportBuilder() {
        transport = new Transport(null, (short) 0, null, null, null, null, false, null);
    }

    public TransportBuilder setBaseParams(String name, short year, String routeNumber) {
        transport.setName(name);
        transport.setYear(year);
        transport.setRouteNumber(routeNumber);
        return this;
    }

    public TransportBuilder setSizeParams(Size size) {
        transport.setSize(size);
        return this;
    }

    public TransportBuilder setEcoParams(boolean isEcoFriendly, String systemType) {
        transport.setEcoFriendly(isEcoFriendly);
        transport.setSystemType(systemType);
        return this;
    }

    public TransportBuilder setTypeParams(String type, String[] supportedCities) {
        transport.setType(type);
        transport.setSupportedCities(supportedCities);
        return this;
    }

    public Transport build() {
        return transport;
    }
}