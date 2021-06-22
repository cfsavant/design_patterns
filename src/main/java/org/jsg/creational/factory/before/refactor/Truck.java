package org.jsg.creational.factory.before.refactor;

import lombok.Data;

@Data
public class Truck {
    private int size;

    public Truck(int i) {
        size = i;
    }
}
