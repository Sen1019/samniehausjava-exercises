package com.techelevator;

public class Airplane {
	//Instance Variables
		private String planeNumber;
		private int bookedFirstClassSeats;
		private int totalFirstClassSeats;
		private int bookedCoachSeats;
		private int totalCoachSeats;
		
	//Constructor
		public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
			this.planeNumber = planeNumber;
			this.totalFirstClassSeats = totalFirstClassSeats;
			this.totalCoachSeats = totalCoachSeats;
			
		}
	
	//Methods
		public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats){
			if (forFirstClass){
				if(totalNumberOfSeats <= totalFirstClassSeats - bookedFirstClassSeats){
					bookedFirstClassSeats += totalNumberOfSeats;
					return true;
				}
				else{
					return false;
				}
			}
			else{
				if(totalNumberOfSeats <= totalCoachSeats - bookedCoachSeats){
					bookedCoachSeats += totalNumberOfSeats;
					return true;
				}
				else{
					return false;
				}
			}
		}
	//Getters and Setters
		public int  getAvailableFirstClassSeats(){
			return totalFirstClassSeats - bookedFirstClassSeats;
		}
		
		public int getAvailableCoachSeats(){
			return totalCoachSeats - bookedCoachSeats;
		}
		
		public String getPlaneNumber() {
			return planeNumber;
		}

		public int getBookedFirstClassSeats() {
			return bookedFirstClassSeats;
		}

		public int getTotalFirstClassSeats() {
			return totalFirstClassSeats;
		}

		public int getBookedCoachSeats() {
			return bookedCoachSeats;
		}

		public int getTotalCoachSeats() {
			return totalCoachSeats;
		}
}