package com.company.patterns.factory;

public abstract class Factory {
    public void deliver() {
        Transport transport = this.create();
        transport.deliver();
    }

    public abstract Transport create();
}
