package com.techelevator.model;

public class LastTwo {

	String[] words;
	
	public LastTwo(){}
	
	public LastTwo(String[] words){
		this.words = words;
	}
	
	
	
//I made both of these because I didn't know which one would be better in the jsp.
	public String[]	getLastTwoReversedWords(){
		String[] reversedWords = new String[words.length];
		for(int i = 0; i < words.length; i++){
			if(words[i].length() <= 1){
				reversedWords[i] = words[i];
			}else{
				reversedWords[i] = words[i].substring(0, words[i].length()-2);
				reversedWords[i] += words[i].substring(words[i].length()-1, words[i].length());
				reversedWords[i] += words[i].substring(words[i].length()-2, words[i].length()-1);
			}
		}
		return reversedWords;
	}
	
	public String getLastTwoReversedWord(int count){
		String reversedWord;
			if(words[count].length() <= 1){
				reversedWord = words[count];
			}else{
				reversedWord = words[count].substring(0, words[count].length()-2);
				reversedWord += words[count].substring(words[count].length()-1, words[count].length());
				reversedWord += words[count].substring(words[count].length()-2, words[count].length()-1);
			}
		return reversedWord;
	}

	
	
	
	
	
	
	
	
	
	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}
	
	
}
