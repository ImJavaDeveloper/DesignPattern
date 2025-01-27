package com.design.patterns.structural.adapter;

public class Iphone12Adapter implements Charger{

    private Iphone12Charger iphone12Charger;
    public Iphone12Adapter ()
    {
        iphone12Charger=new Iphone12Charger();
    }
    @Override
    public void charge() {
        iphone12Charger.charge();
    }
}
