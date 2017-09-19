package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestion {
	
//Instance Variables	
	private String question;
	private List<String> answers = new ArrayList<>();
	private String correctAnswer;

//Constructor
	public QuizQuestion(String input){
		String[] splits = input.split("\\|");
		question =  splits[0];
		for(int i = 1; i < splits.length; i++ ){
			if(splits[i].endsWith("*")){
				correctAnswer = "" + (i-1);
				splits[i] = splits[i].substring(0, splits[i].length()-1);
			}
			answers.add(splits[i]);
		}
	}
	
	
//Method
	
	public void printString(){
		System.out.println(question);
		for(int i = 0; i < answers.size(); i++){
			System.out.println(i + ") " + answers.get(i));
		}
		return;
	}
	
//Getters	
	public String getQuestion() {
		return question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public int getNumberOfAnswers(){
		return answers.size();
	}
}
