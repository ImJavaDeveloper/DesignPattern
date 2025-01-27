package com.design.patterns.creational.factory;

public class BMW implements Car{
    @Override
    public void startEngine() {
        System.out.println("Starting BMW");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping BMW");
    }
}
