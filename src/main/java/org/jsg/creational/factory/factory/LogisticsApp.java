package org.jsg.creational.factory.factory;

/*

Factory [Method] Pattern Example
    Facilitates various Types of transport mechanisms to ship goods

    Loose-coupling between concrete classes and client via use of an interface [Transport]
        Boat, Airplane implement the Transport inteface

    TransportFactory
        creation factory that determines which transport type to generate

    Flexibility to add additional transportation mechanisms

 */

public class LogisticsApp {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport t = transportFactory.getTransport(TransportEnum.BOAT);
        t.transport();

        Transport airplane = transportFactory.getTransport(TransportEnum.AIRPLANE);
        airplane.transport();

        // now you can build shipments with various transportation types.
    }
}

