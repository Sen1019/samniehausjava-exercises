package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		
		int lineCount = 1;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the word for which to search:");
		String wordToSearch =  userInput.nextLine();
		File inputFile = inputFileLocation();
		System.out.println("Search case insentive? (Y or N)");
		String caseInsensitive =  userInput.nextLine();
		caseInsensitive = caseInsensitive.toLowerCase();
		
		
		if(caseInsensitive.equals("y")){
			try(Scanner fileScanner = new Scanner(inputFile)){
				while(fileScanner.hasNextLine()){
					String line = fileScanner.nextLine();
					line = line.toLowerCase();
					wordToSearch = wordToSearch.toLowerCase();
					if(line.contains(wordToSearch)){
						System.out.println(lineCount + ") " + line);
					}
					lineCount++;
				}
			} catch (FileNotFoundException e) {
				System.out.println("There is no file anymore?");
			}
		}
		else{
			try(Scanner fileScanner = new Scanner(inputFile)){
				while(fileScanner.hasNextLine()){
					String line = fileScanner.nextLine();
					if(line.contains(wordToSearch)){
						System.out.println(lineCount + ") " + line);
					}
					lineCount++;
				}
			} catch (FileNotFoundException e) {
				System.out.println("There is no file anymore?");
				return;
			}
		}
		return;
	}
	
	
	public static File inputFileLocation(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the file location: ");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		
		if(!inputFile.exists()){
			System.out.println("Where my file at?!?");
			inputFileLocation();
		}
		return inputFile;
	}
//     /Users/samniehaus/workspace/exercises/m1-w4d2-file-io-part1-exercises/alices_adventures_in_wonderland.txt
}
