package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class FizzWriter {

	public static void main(String[] args) {
		try(PrintWriter writer = new PrintWriter(new File("./FizzBuzz.txt"))){
			for(int i = 1; i <= 300; i++){
				if (i % 3 == 0){
					if(i % 5 == 0){
						writer.println("FizzBuzz");
					}else{
						writer.println("Fizz");
					}
				}else if(i % 5 == 0){
					writer.println("Buzz");
				}else{
					writer.println(i);
				}
			}
		} catch (FileNotFoundException e) {
			e.getMessage();
			System.exit(1);
		}
	}
}
