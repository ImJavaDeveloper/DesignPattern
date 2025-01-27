package com.design.patterns.behavioral.oberver;

import java.util.ArrayList;
import java.util.List;

public class WeatherUpdate implements Weather{

    List<Device> devices;
    public WeatherUpdate()
    {
        this.devices=new ArrayList<>();
    }

    public void addDevice(Device device)
    {
        this.devices.add(device);
    }

    public void removeDevice(Device device)
    {
        System.out.println("Removing Device:"+device);
        this.devices.remove(device);
    }

    @Override
    public void updateWeather(String message) {
    for(Device device:devices)
    {
        device.updateMessage(message);
    }
    }
}
