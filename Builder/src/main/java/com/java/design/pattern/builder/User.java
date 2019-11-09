package com.java.design.pattern.builder;

/*To build the builder, we must have all attributes should be private
There must be inner static class
constructer of outer class which accept the instance of inner class.
*/
public class User {
	
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private String mobile;
	private String maritalStatus;
	private String occupation;

	
	
	
	private User(UserBuilder userBuilder)
	{
		this.firstName=userBuilder.fname;
		this.lastName=userBuilder.lname;
		this.address=userBuilder.address;
		this.age=userBuilder.age;
		this.mobile=userBuilder.mobile;
		this.maritalStatus=userBuilder.maritalStatus;
		this.occupation=userBuilder.occupation;
	}
	
	
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", age=" + age
				+ ", mobile=" + mobile + ", maritalStatus=" + maritalStatus + ", occupation=" + occupation + "]";
	}



	public static class UserBuilder
	{
		private String fname;
		private String lname;
		private String address;
		private int age;
		private String mobile;
		private String maritalStatus;
		private String occupation;
		
		public UserBuilder firstName(String lastName)
		{
			this.fname=lastName;
			return this;
		}
		
		public UserBuilder lastName(String lastName)
		{
			this.lname=lastName;
			return this;
		}
		public UserBuilder address(String address)
		{
			this.address=address;
			return this;
		}
		public UserBuilder age(int age)
		{
			this.age=age;
			return this;
		}
		public UserBuilder mobile(String mobile)
		{
			this.mobile=mobile;
			return this;
		}
		public UserBuilder maritalStatus(String maritalStatus)
		{
			this.maritalStatus=maritalStatus;
			return this;
		}
		
		public UserBuilder occupation(String occupation)
		{
			this.occupation=occupation;
			return this;
		}
		
		public User build() {
			User user=new User(this);
			//validateUserObject(user);
			return user;
		}
		
		private void validateUserObject(User user) {
            //Do some basic validations to check 
            //if user object does not break any assumption of system
        }
		
	}

}
