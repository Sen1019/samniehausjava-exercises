package com.techelevator;

public class Elevator {
	
	//Instance Variables
		private int currentFloor;
		private int numberOfFloors;
		private boolean doorOpen;
		
	//Constructor
		public Elevator(int totalNumberOfFloors){
			numberOfFloors = totalNumberOfFloors;
			currentFloor = 1;
		}
	
	//Methods
		public void openDoor(){
			doorOpen = true;
		}
		public void closeDoor(){
			doorOpen = false;
		}
		
		public void goUp(int desiredFloor){
			if(!doorOpen && desiredFloor > currentFloor && desiredFloor <= numberOfFloors){
				currentFloor = desiredFloor;
			}
		}
		
		public void goDown(int desiredFloor){
			if(!doorOpen && desiredFloor < currentFloor && desiredFloor >= 1){
				currentFloor = desiredFloor;
			}
		}

	//Getters
		public int getCurrentFloor() {
			return currentFloor;
		}

		public int getNumberOfFloors() {
			return numberOfFloors;
		}

		public boolean isDoorOpen() {
			return doorOpen;
		}
}
