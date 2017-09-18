package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int num){
		
		if(num > 100 || num < 1){
			return "";
		}
		
		if (num % 3 == 0){
			if (num % 5 == 0){
				return "FizzBuzz";
			}
			return "Fizz";
		}
		if (num % 5 == 0){
			return "Buzz";
		}
		return Integer.toString(num);
	}

}
