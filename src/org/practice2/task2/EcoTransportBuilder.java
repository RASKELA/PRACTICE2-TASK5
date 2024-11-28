package org.practice2.task2;

public class EcoTransportBuilder extends TransportBuilder {
    @Override
    public Transport build() {
        transport.isEcoFriendly = true;
        return transport;
    }
}