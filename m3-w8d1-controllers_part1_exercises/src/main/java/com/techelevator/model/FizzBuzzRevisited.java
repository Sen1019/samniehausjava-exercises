package com.techelevator.model;

public class FizzBuzzRevisited {
	
	int div1;
	int div2;
	String fizzAlt;
	String buzzAlt;
	int[] nums;

	public FizzBuzzRevisited(int div1, int div2, String fizzAlt, String buzzAlt, int[] nums){
		this.div1 = div1;
		this.div2 = div2;
		this.fizzAlt = fizzAlt;
		this.buzzAlt = buzzAlt;
		this.nums = nums;
	}

	public String getFizzBuzz(){
		String returnString = "";
		for(int i : nums){
			if (i % (div1 * div2) == 0){
				returnString += i + " " + fizzAlt + buzzAlt + "\n";
			}else if (i % (div1) == 0){
				returnString += i + " " + fizzAlt + "\n";
			}else if (i % (div2) == 0){
				returnString += i + " " + buzzAlt + "\n";
			}else{
				returnString += i + "\n";
			}
		}
		return returnString;
	}
	
	public int getDiv1() {
		return div1;
	}

	public void setDiv1(int div1) {
		this.div1 = div1;
	}

	public int getDiv2() {
		return div2;
	}

	public void setDiv2(int div2) {
		this.div2 = div2;
	}

	public String getFizzAlt() {
		return fizzAlt;
	}

	public void setFizzAlt(String fizzAlt) {
		this.fizzAlt = fizzAlt;
	}

	public String getBuzzAlt() {
		return buzzAlt;
	}

	public void setBuzzAlt(String buzzAlt) {
		this.buzzAlt = buzzAlt;
	}

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}
}
