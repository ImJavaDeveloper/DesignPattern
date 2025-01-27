package com.design.patterns.behavioral.oberver;

public class ObserverPatternTest {

    public static void main(String[] args) {

        WeatherUpdate weatherUpdate=new WeatherUpdate();
        PhoneDevice phoneDevice=new PhoneDevice();
        WatchDevice watchDevice=new WatchDevice();
        weatherUpdate.addDevice(phoneDevice);
        weatherUpdate.addDevice(watchDevice);
        weatherUpdate.updateWeather("Cloudy");

        weatherUpdate.removeDevice(watchDevice);
        weatherUpdate.updateWeather("Rainy");

    }
}
