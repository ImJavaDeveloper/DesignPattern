package com.design.patterns.creational.factory;

public class Mercedes implements Car{
    @Override
    public void startEngine() {
        System.out.println("Starting Mercedes");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Mercedes");
    }
}
