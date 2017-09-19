package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		int numberCorrect = 0;
		int numberOfQuestions = 0;
		try(Scanner fileScanner = new Scanner(inputFileLocation())){
			
			while(fileScanner.hasNextLine()){
				
				String line = fileScanner.nextLine();
				QuizQuestion question = new QuizQuestion(line);
				
				question.printString();
				String quizAnswer = inputQuizAnswer(question);
				
				if(question.getCorrectAnswer().equals(quizAnswer)){
					System.out.println("Correct!");
					numberCorrect ++;
				}
				else{
					System.out.println("Sorry, that isn't correct.");
				}
				numberOfQuestions ++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file has disapeared?");
		}
		System.out.println("You got "+  numberCorrect + " answer(s) correct out of the total " + numberOfQuestions + " questions asked");
	}
	
	
	
	public static String inputQuizAnswer(QuizQuestion question){
		System.out.print("Your Answer: ");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		if (!(Integer.parseInt(inputString) >= 0) || !(Integer.parseInt(inputString) <= question.getNumberOfAnswers())){
			System.out.println("Invalid Answer!");
			inputQuizAnswer(question);
		}
		return inputString;
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
//    /Users/samniehaus/workspace/exercises/m1-w4d2-file-io-part1-exercises/test_quiz.txt
	}
}
