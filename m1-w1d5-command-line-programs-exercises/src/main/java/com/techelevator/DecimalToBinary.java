package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String desiredNumsString = input.nextLine();
		String[] desiredNumsStringArray = desiredNumsString.split(" ");
		int[] desiredNumsArray = new int[desiredNumsStringArray.length];
		
		for(int i =0; i < desiredNumsArray.length; i ++){
			desiredNumsArray[i] = Integer.parseInt(desiredNumsStringArray[i]);
		}
		
		/*  For testing the proper input of the parse
		for(int i = 0; i < desiredNumsArray.length; i ++){
			System.out.print(desiredNumsArray[i]);
		}
		return;
		*/
		
		// System.out.print((int)(Math.log(desiredNumsArray[0])/Math.log(2)));
		//For testing that I got the log right
		
		for (int x = 0; x < desiredNumsArray.length; x++){
			System.out.print (desiredNumsArray[x] + " ");
			int[] binaryNum = new int[(int)(Math.log(desiredNumsArray[x])/Math.log(2)+1)];
			//Used a log base 2 to determine the size of the array, adding one for the first slot (the zeroth power)
			
			for (int i = 0, j = ((int)(Math.log(desiredNumsArray[x])/Math.log(2))); i < binaryNum.length; i++, j--){
				if(desiredNumsArray[x] >= Math.pow(2, j)){
					binaryNum[i]++;
					desiredNumsArray[x] -= Math.pow(2, j);
				}	
			}
			//Checks if the desired number is greater or equal to two to the power of the highest to lowest index
			
			System.out.print("in binary is ");
			for (int i = 0; i < binaryNum.length; i++){
				System.out.print(binaryNum[i]);
			}
			System.out.println();
		}
		return;
	}
}
