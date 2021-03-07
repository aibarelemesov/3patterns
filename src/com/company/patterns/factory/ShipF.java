package com.company.patterns.factory;

public class ShipF extends Factory{
    @Override
    public Transport create() {
        return new ShipTransport();
    }
}
