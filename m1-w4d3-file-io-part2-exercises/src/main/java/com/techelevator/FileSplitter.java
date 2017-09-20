package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//   /Users/samniehaus/workspace/exercises/m1-w4d3-file-io-part2-exercises/FizzBuzz.txt

public class FileSplitter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
			
		System.out.println("Please enter the number of lines you want in each .txt file. ");
		int fileSize = 0;
		try{
			fileSize = Integer.parseInt(userInput.nextLine());
			if(fileSize < 1){
				System.out.println("Too small.");
				System.exit(1);
			}
		}catch(NumberFormatException e){
			System.out.println("Your input didn't have an integer.");
			System.exit(2);
		}
		
		System.out.println("Please provide the file path to the source file. ");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		if(!inputFile.exists()){
			System.out.println("Could not locate source file.");
			System.exit(3);
		}
		
		splitFile(path, fileSize);
			
	}
	
	public static void splitFile(String path, int maxLines){
		int delineator = path.lastIndexOf("/");
		String fileName = path.substring(delineator + 1, path.length()-4);
		
		try(Scanner fileReader = new Scanner(new File(path))){
			int i = 0;
			String line = "";
			while(fileReader.hasNextLine()){
				try(PrintWriter fileWriter = new PrintWriter("./" + fileName + "-" + i + ".txt")){
					int j = 0;
					while(j < maxLines && fileReader.hasNextLine()){
						line = fileReader.nextLine();
						if(j == maxLines -1){
							fileWriter.print(line);
						}else{
							fileWriter.println(line);
						}
						j++;
					}
				}
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.print("The file has disappeared.");
			System.exit(4);
		}
		
		

	}

}
