package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KataPotter {
	
	public double getCost(Integer[] books){
		
		Arrays.sort(books, Collections.reverseOrder());
		
		int fives = 0;
		int fours = 0;
		int threes = 0;
		int twos = 0;
		int ones = 0;
		
		while(books[0] > 0){
			if(books[0] > 0 && books[1] > 0 && books[2] > 0 && books[3] > 0 && books[4] > 0){
				fives++;
				books[0]--;
				books[1]--;
				books[2]--;
				books[3]--;
				books[4]--;
			}
			else if(books[0] > 0 && books[1] > 0 && books[2] > 0 && books[3] > 0){
				fours++;
				books[0]--;
				books[1]--;
				books[2]--;
				books[3]--;
			}
			else if(books[0] > 0 && books[1] > 0 && books[2] > 0){
				threes++;
				books[0]--;
				books[1]--;
				books[2]--;
			}
			else if(books[0] > 0 && books[1] > 0){
				twos++;
				books[0]--;
				books[1]--;
			}
			else{
				ones++;
				books[0]--;
			}
		}
		while(fives > 0 && threes > 0){
			fives--;
			threes--;
			fours +=2;
		}
		
		return 8*(3.75*fives + 3.2*fours + 2.7*threes + 1.8*twos + ones);
	}
}
