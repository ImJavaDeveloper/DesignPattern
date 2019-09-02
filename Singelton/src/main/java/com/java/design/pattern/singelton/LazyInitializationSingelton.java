package com.java.design.pattern.singelton;

/*Lazy initialization method to implement Singleton pattern creates the instance in the global access method.abstract
implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, 
it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton 
pattern and both threads will get the different instances of the singleton class.*/

public class LazyInitializationSingelton {
	
	private static LazyInitializationSingelton lazyInitializationSingelton=null;
	private LazyInitializationSingelton()
	{
		
	}
	
	public static LazyInitializationSingelton getInstance()
	{
		if(lazyInitializationSingelton==null) {
			System.out.println("Getting Singleton Instance First Time....");
			lazyInitializationSingelton=new LazyInitializationSingelton();
		}
		System.out.println("Getting Singleton Instance ...");
		return lazyInitializationSingelton;
		
	}

}
