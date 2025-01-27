package com.design.patterns.creational.singleton;

public class SingletonExampleTest {

    public static void main(String[] args) {
        SingletonExample example1=SingletonExample.getInstance();
        SingletonExample example2=SingletonExample.getInstance();
        System.out.println("example2 will not cause creation of Singleton object again");
    }
}
