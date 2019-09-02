package com.java.design.pattern.factory;

public class PC extends Computer {
 
	private String Comptype;
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String compType,String RAM,String HDD,String CPU)
	{
		this.Comptype=compType;
		this.RAM=RAM;
		this.HDD=HDD;
		this.CPU=CPU;
		
	}
	
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}

	@Override
	public String getComputerType() {
		// TODO Auto-generated method stub
		return Comptype;
	}

}
