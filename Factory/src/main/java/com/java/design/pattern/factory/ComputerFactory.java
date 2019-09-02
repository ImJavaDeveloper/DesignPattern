package com.java.design.pattern.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String compType, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(compType)) 
			return new PC(compType,ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(compType)) 
			return new Server(compType,ram, hdd, cpu);
		
		return null;
	}

}
