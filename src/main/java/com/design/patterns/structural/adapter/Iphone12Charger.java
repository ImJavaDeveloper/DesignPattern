package com.design.patterns.structural.adapter;

public class Iphone12Charger implements Charger{

    @Override
    public void charge() {
        System.out.println("Iphone12 Charging");
    }
}
