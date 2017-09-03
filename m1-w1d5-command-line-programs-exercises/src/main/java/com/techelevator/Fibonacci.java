package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the Fibonacci number: ");
		int desiredNum = input.nextInt();
		
		DecimalFormat none = new DecimalFormat("#.#");
		
		if(desiredNum == 0 || desiredNum == 1){
			System.out.print("0");
			return;
		}
		System.out.print("0, 1, 1");
		
		for( double fibNum = 2;  fibNum < desiredNum; fibNum *= 1.61803398875){
			fibNum = Math.round(fibNum);
			System.out.print(", " + none.format(fibNum));
		}
		//Increments using the golden ratio and then rounds and prints it.  Initializes at 2, other cases already covered.
		return;
	}

}
//This one felt really, really good.
