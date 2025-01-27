package com.design.patterns.behavioral.oberver;

public class WatchDevice implements Device{
    @Override
    public void updateMessage(String message) {
        System.out.println("Getting message on Watch:"+message);
    }
}
