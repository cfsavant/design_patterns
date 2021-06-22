package org.jsg.creational.factory.improved.factory;

import org.jsg.creational.factory.factory.Airplane;
import org.jsg.creational.factory.factory.Boat;
import org.jsg.creational.factory.factory.Transport;
import org.jsg.creational.factory.factory.TransportEnum;

public class TransportFactory extends org.jsg.creational.factory.improved.factory.AbstractTransportFactory {
    String type;


    public Transport getTransport(TransportEnum transportType) {

        Transport transport;

        switch (transportType) {

            case BOAT:
                    transport = new Boat();
                    break;
            case AIRPLANE:
                    transport = new Airplane();
                    break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        return transport;

    }
}
