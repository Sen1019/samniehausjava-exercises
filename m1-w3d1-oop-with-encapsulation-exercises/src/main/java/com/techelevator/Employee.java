package com.techelevator;

public class Employee {

	//Instance Variables
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	//Constructor
		public Employee(int employeeId, String firstName, String lastName, double salary){
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			annualSalary = salary;
		}
	
	//Method
		public String getFullName(){
			return lastName + ", " + firstName;
		}
		public void raiseSalary(double percent){
			annualSalary *= 1.0 + percent/100;
		}
		
	//Getters and Setters
		public int getEmployeeId() {
			return employeeId;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getFirstName() {
			return firstName;
		}
		public double getAnnualSalary() {
			return annualSalary;
		}
	
	
}
