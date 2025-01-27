package com.design.patterns.creational.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample=null;

    private SingletonExample()
    {

    }
    public static SingletonExample getInstance()
    {
    if(singletonExample == null) {
        System.out.println("Creating Instance of Singleton");
        singletonExample = new SingletonExample();
    }
    return singletonExample;
    }
}
