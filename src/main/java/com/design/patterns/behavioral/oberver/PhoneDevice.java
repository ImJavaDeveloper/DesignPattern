package com.design.patterns.behavioral.oberver;

public class PhoneDevice implements Device{
    @Override
    public void updateMessage(String message) {
        System.out.println("Getting Message on Phone:"+message);
    }
}
