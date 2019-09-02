package com.java.design.pattern.factory;

public abstract class Computer {
	
	public abstract String getComputerType();
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString()
	{
		return "Computer Type:"+this.getComputerType()+",RAM:"+this.getRAM()+",HDD:"+this.getHDD()+",CPU:"+this.getCPU();
		
	}
	

}
