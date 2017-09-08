package com.techelevator.person;

public class Person {
	//Instance Variables
		private String firstName = new String();
		private String lastName = new String();
		private int age = 0;
		
	//Constructor
		public Person(){}
		
	//Getters and Setters
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
				this.age = age;
		}
	
	//Methods
		public String getFullName(){
			return lastName + ", " + firstName;
		}
		
		public boolean isAdult(){
			return age>=18;
		}
	
}
