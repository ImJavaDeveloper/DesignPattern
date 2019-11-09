package com.java.design.pattern.builder;

public class TestBuilder {
	
	
	public static void main(String[] args) {
		
		User user1=new User.UserBuilder()
				.firstName("Rahat")
				.lastName("Ali")
				.age(31)
				.address("Pune")
				.occupation("Programmer")
				.mobile("8765434567")
				//.maritalStatus("Married")
				.build();
		System.out.println(user1.toString());
		
	}

}
