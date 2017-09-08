package com.techelevator.shoppingcart;

public class ShoppingCart {
	//Instance Variables
		private int totalNumberOfItems = 0;
		private double totalAmountOwed = 0.0;
	
	//Constructor
		public ShoppingCart(){}


	//Getters and Setters
		public int getTotalNumberOfItems() {
			return totalNumberOfItems;
		}

		public void setTotalNumberOfItems(int totalNumberOfItems) {
			this.totalNumberOfItems = totalNumberOfItems;
		}

		public double getTotalAmountOwed() {
			return totalAmountOwed;
		}

		public void setTotalAmountOwed(double totalAmmountOwed) {
			this.totalAmountOwed = totalAmmountOwed;
		}
	
	//Methods
		public double getAveragePricePerItem(){
			if(totalAmountOwed == 0.0 && totalNumberOfItems == 0){
				return 0;
			}
			return totalAmountOwed/totalNumberOfItems;
		}
		public void addItems(int numberOfItems, double pricePerItem){
			totalNumberOfItems += numberOfItems;
			totalAmountOwed += pricePerItem * numberOfItems;
			return;
		}
		public void empty(){
			totalNumberOfItems = 0;
			totalAmountOwed = 0.0;
			return;
		}

}
