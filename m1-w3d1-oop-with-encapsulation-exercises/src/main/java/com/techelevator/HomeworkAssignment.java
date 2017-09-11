package com.techelevator;

public class HomeworkAssignment {

	//Instance Variables
		private int totalMarks;
		private int possibleMarks;
		private String submitterName = new String();
		
	//Constructor
		public HomeworkAssignment(int possibleMarks){
			this.possibleMarks = possibleMarks;
		}
		
	//Getters and Setters
		public int getTotalMarks() {
			return totalMarks;
		}
		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		public int getPossibleMarks() {
			return possibleMarks;
		}
		public String getSubmitterName() {
			return submitterName;
		}
		public void setSubmitterName(String submitterName) {
			this.submitterName = submitterName;
		}

	//Methods
		public String getLetterGrade(){
			return (1.0 * possibleMarks * totalMarks >= possibleMarks * possibleMarks * 0.9) ? "A":
						(1.0 * possibleMarks * totalMarks >= possibleMarks * possibleMarks * 0.8) ? "B":
							(1.0 * possibleMarks * totalMarks >= possibleMarks * possibleMarks * 0.7) ? "C":
								(1.0 * possibleMarks * totalMarks >= possibleMarks * possibleMarks * 0.6) ? "D" : "F";
		}			
		
}
