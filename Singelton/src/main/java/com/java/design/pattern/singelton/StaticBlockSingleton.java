package com.java.design.pattern.singelton;

public class StaticBlockSingleton {
	
    private static StaticBlockSingleton staticBlockSingleton;
	static
	{
		try {
			
		staticBlockSingleton=new StaticBlockSingleton();
		
		}catch (Exception e)
		{
			throw new RuntimeException("Error While Instantiating the object");
		}
	}
    
    private StaticBlockSingleton()
    {
    	
    }
    
    public static StaticBlockSingleton getInstance()
    {
    	System.out.println("Getting Singleton Instance via StaticBlockSingleton.."+staticBlockSingleton);
    	return staticBlockSingleton;
    	
    }
}
