package com.java.design.pattern.singelton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton=null;
	
	private ThreadSafeSingleton()
	{
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		
		if(threadSafeSingleton==null)
		{
			//code snippet provides the double-checked locking 
			synchronized (ThreadSafeSingleton.class)
			{
				if(threadSafeSingleton==null)
					threadSafeSingleton=new ThreadSafeSingleton();
			}
		}
		return threadSafeSingleton;
		
	}

}
