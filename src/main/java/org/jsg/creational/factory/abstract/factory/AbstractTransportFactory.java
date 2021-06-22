package org.jsg.creational.factory.improved.factory;

import org.jsg.creational.factory.factory.Transport;
import org.jsg.creational.factory.factory.TransportEnum;

public abstract class AbstractTransportFactory {
    public abstract Transport getTransport(TransportEnum transportType);
}
