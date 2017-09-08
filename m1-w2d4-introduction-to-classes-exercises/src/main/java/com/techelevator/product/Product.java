package com.techelevator.product;

public class Product {
	//Instance Variables
		private String name = new String();
		private double price = 0.0;
		private double weightInOunces = 0.0;
		
	//Constructor
		public Product(){}

	//Getters and Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getWeightInOunces() {
			return weightInOunces;
		}

		public void setWeightInOunces(double weightInOunces) {
			this.weightInOunces = weightInOunces;
		}
}
