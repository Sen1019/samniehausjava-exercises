package com.techelevator.model;

public class xOrderedName {
	
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String order;
	
	
	public xOrderedName(String firstName, String lastName, String middleInitial, String order){
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.order = order;
	}

	
	public String getFullName(){
		if(order.equals("fml")){
				return firstName + " " + middleInitial + " " + lastName;
		}else if(order.equals("fl")){
			return firstName + " " + lastName;
		}else if(order.equals("lfm")){
			return lastName + ", " + firstName + " " + middleInitial;
		}else {
			return lastName + ", " + firstName;
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


	public String getMiddleInitial() {
		return middleInitial;
	}


	public void setMiddleInitial(String middleName) {
		this.middleInitial = middleName;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}

	
}
