package org.jsg.creational.factory.factory;

import static org.jsg.creational.factory.factory.TransportEnum.*;

public class TransportFactory {


    public Transport getTransport(TransportEnum transportTypeInput) {

        Transport transportType;

        switch (transportTypeInput) {

            case BOAT:
                    transportType = new Boat();
                    break;
            case AIRPLANE:
                    transportType = new Airplane();
                    break;
            default:
                throw new IllegalStateException("Unexpected value: " + transportTypeInput);
        }

        return transportType;

    }
}
