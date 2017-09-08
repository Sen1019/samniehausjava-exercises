package com.techelevator.company;

public class Company {
	//Instance Variables
		private String name = new String();
		private int numberOfEmployees = 0;
		private double revenue = 0;
		private double expenses = 0;
	
	//Constructor
		public Company(){}
	
	
	//Getters and Setters
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getNumberOfEmployees() {
			return numberOfEmployees;
		}
		
		public void setNumberOfEmployees(int numberOfEmployees) {
			if(numberOfEmployees >= 0){
				this.numberOfEmployees = numberOfEmployees;
			}
		}
		
		public double getRevenue() {
			return revenue;
		}
		
		public void setRevenue(double revenue) {
			if (revenue >= 0){
				this.revenue = revenue;
			}
		}
		
		public double getExpenses() {
			return expenses;
		}
		
		public void setExpenses(double expenses) {
			if (expenses > 0){
				this.expenses = expenses;
			}
		}
	
	//Methods
		public String getCompanySize(){
			return(numberOfEmployees < 51) ? "small" : (numberOfEmployees > 50 && numberOfEmployees < 251) ? "medium" : "large";
		}
		
		public double getProfit(){
			return revenue - expenses;
		}
	
}
