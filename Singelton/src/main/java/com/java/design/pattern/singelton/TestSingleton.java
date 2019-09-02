package com.java.design.pattern.singelton;

public class TestSingleton {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		EagerInitializationSingelton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializationSingelton.getInstance();
		LazyInitializationSingelton.getInstance();
	}

}
