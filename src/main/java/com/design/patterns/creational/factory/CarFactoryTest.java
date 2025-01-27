package com.design.patterns.creational.factory;

public class CarFactoryTest {

    public static void main(String[] args) {

        Mercedes mercedes= (Mercedes) new CarFactory().createCar("MERCEDES");
        BMW bmw= (BMW) new CarFactory().createCar("BMW");

        mercedes.startEngine();
        mercedes.stopEngine();
        bmw.startEngine();
        bmw.stopEngine();

    }
}
