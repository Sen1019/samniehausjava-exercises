package com.techelevator.model;

public class ColorizedName{
	
	String firstName;
	String lastName;
	boolean red;
	boolean green;
	boolean blue;
	
	
	
	public ColorizedName(String firstName, String lastName, String[] colors){
		this.firstName = firstName;
		this.lastName = lastName;
		
		for(String color: colors){
			if(color.contains("r")){
				red = true;
			}
			if(color.contains("g")){
				green = true;
			}
			if(color.contains("b")){
				blue = true;
			}			
		}
	}



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



	public boolean isRed() {
		return red;
	}



	public void setRed(boolean red) {
		this.red = red;
	}



	public boolean isGreen() {
		return green;
	}



	public void setGreen(boolean green) {
		this.green = green;
	}



	public boolean isBlue() {
		return blue;
	}



	public void setBlue(boolean blue) {
		this.blue = blue;
	}
	
	
	
}