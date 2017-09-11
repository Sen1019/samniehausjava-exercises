package com.techelevator;

public class FruitTree {

	//Instance Variables
		String typeOfFruit = new String();
		int piecesOfFruitLeft;
	
	//Constructor
		public FruitTree(String typeOfFruit, int piecesOfFruit){
			this.typeOfFruit = typeOfFruit;
			this.piecesOfFruitLeft = piecesOfFruit;
		}
		
	//Methods
		public boolean pickFruit(int numberOfPiecesToRemove){
			if(piecesOfFruitLeft >= numberOfPiecesToRemove){
				piecesOfFruitLeft -= numberOfPiecesToRemove;
				return true;
			}
			return false;
		}
		
	//Getters and Setters
		public String getTypeOfFruit() {
			return typeOfFruit;
		}
		public int getPiecesOfFruitLeft() {
			return piecesOfFruitLeft;
		}
		
	
}
