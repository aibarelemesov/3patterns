package com.company.patterns.factory;

public class TruckF extends Factory{
    @Override
    public Transport create() {
        return new TruckTransport();
    }
}
