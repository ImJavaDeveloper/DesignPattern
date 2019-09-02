package com.java.design.pattern.singelton;

import java.io.IOException;

/*In eager initialization, the instance of Singleton Class is created at the time of class loading, 
this is the easiest method to create a singleton class but it has a drawback that instance is created
even though client application might not be using it*/

/*
 * We should avoid the instantiation until unless client calls the getInstance method. 
 * Also, this method doesn’t provide any options for exception handling.
 */

public class EagerInitializationSingelton {
	
	private static final EagerInitializationSingelton eagerInitializationSingelton=new EagerInitializationSingelton();
	
	private EagerInitializationSingelton()
	{
		
	}
 
	public static EagerInitializationSingelton getInstance() {
		System.out.println("Getting Instance Of EagerInitializationSingelton..."+eagerInitializationSingelton);
	    return eagerInitializationSingelton;
	 
    }
}
