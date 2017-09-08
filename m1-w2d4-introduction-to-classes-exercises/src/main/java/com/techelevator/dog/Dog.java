package com.techelevator.dog;

public class Dog {
	//Instance Variables
		private boolean sleeping = false;
		


	//Constructor
		public Dog(){}
		
	//Getter
		public boolean isSleeping(){
			return sleeping;
		}
		
	//Methods
		public String makeSound(){
			return (sleeping) ? "Zzzzz..." : "Woof!";
		}

		public void sleep(){
			sleeping = true;
		}
		
		public void wakeUp(){
			sleeping = false;
		}





}