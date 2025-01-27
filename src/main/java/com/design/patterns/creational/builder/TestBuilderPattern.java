package com.design.patterns.creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {

        Computer computer =new Computer.ComputerBuilder()
                .companyName("DELL")
                .machineType("Laptop")
                .RAM("4GB")
                .storage("250GB")
                .CPU("2-core")
                .build();

        System.out.println(computer.toString());
    }
}
