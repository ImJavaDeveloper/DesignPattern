package com.design.patterns.structural.adapter;

public class Iphone12 implements Iphone{

  private Iphone12Adapter iphone12Adapter;
    Iphone12 ()
    {
        iphone12Adapter=new Iphone12Adapter();
    }
    @Override
    public void onCharge() {
        iphone12Adapter.charge();
    }
}
