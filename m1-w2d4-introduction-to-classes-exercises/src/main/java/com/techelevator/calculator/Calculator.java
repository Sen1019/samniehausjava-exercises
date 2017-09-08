package com.techelevator.calculator;


public class Calculator {
	//Instance Variable	
		private int currentValue = 0;
		
	//Constructor	
		public Calculator() {}
	
	//Getter	
		public int getCurrentValue(){
			return currentValue;
		}
		
	//Method	
		public void reset(){
			
			currentValue = 0;
			return;
		}
		
		public int add(int add){
			currentValue += add;
			return currentValue;
		}
		public int multiply(int mult){
			currentValue *= mult;
			return currentValue;
		}
		public int subtract(int sub){
			currentValue -= sub;
			return currentValue;
		}
		public int power(int pow){
			currentValue = (int)Math.pow(currentValue, pow);
			return currentValue;
		}
		
}
