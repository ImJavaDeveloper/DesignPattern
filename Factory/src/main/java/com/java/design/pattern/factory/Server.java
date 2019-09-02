package com.java.design.pattern.factory;

public class Server extends Computer {
	
	private String Comptype;
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String compType,String ram, String hdd, String cpu){
		this.Comptype=compType;
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
	@Override
	public String getComputerType() {
		// TODO Auto-generated method stub
		return Comptype;
	}

}
