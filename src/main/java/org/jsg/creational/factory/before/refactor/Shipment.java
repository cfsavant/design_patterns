package org.jsg.creational.factory.before.refactor;

import lombok.Data;

@Data
public class Shipment {
    Truck   truck = new Truck(10);

    public Shipment() {

    }

}
