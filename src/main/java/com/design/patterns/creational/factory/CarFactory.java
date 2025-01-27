package com.design.patterns.creational.factory;

public class CarFactory {

    public Car createCar(String carName)
    {
       return switch (carName)
        {
            case "BMW"-> new BMW();
            case "MERCEDES"->new Mercedes();
            default->null;
        };
    }
}
