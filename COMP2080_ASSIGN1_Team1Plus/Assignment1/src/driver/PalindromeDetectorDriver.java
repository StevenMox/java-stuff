package driver;

//****************************************************************************************************
//* Project: Java Project
//* Assignment: Assignment 1
//* Author(s)- Student Numbers:  
//             Harsha Sharma - 101039753,
//             Steven Moxley - 101049722,
//             Maksym Bardus - 100953577,
//             Roman Kovalchyk - 101041366,
//             Osman Mammadli - 100896285,
//             Anton Zhelnerovich - 100961892
//* Date: 10 Feb, 2017
//* Description: main method; utilizes MyStack to check palindrome phrases in a file - only print out the palindromes and avoids showing the non-palindromes
//****************************************************************************************************

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import PalindromeChecker.PalindromeChecker;


public class PalindromeDetectorDriver {

	public static void main(String[] args) throws IOException {
		
        
		//creates scanner to read file; other instance variables
		FileInputStream inFile = new FileInputStream("C:/Users/harsh/Documents/palindrome.txt");
		Scanner readFile = new Scanner(inFile);
		int length = 0;
		
		
		while(readFile.hasNextLine()){
			
			//read each line into a string
			String currentPalindrome = readFile.nextLine();
			String updatedCurrent = "";
			
			//remove punctuation and whitespace from the string by creating new
			//string with only the letters present; makes sure all letters are
			//lowercase
			for(int idx = 0; idx < currentPalindrome.length(); idx++){
				char c = currentPalindrome.charAt(idx);
				if (Character.isLetter(c)){
					if(Character.isUpperCase(c)){c = Character.toLowerCase(c);}
					updatedCurrent += c;
				}
			}
					
			//gets length of new string
			length = updatedCurrent.length();
				
			PalindromeChecker newChecker = new PalindromeChecker(length, updatedCurrent);
			
			//if the string has an even length
			if(length%2 == 0){
				if(newChecker.checkEven()){System.out.println(currentPalindrome);}
			}
			
			//if the string has an odd length
			else{
				if(newChecker.checkOdd()){System.out.println(currentPalindrome);}
			}
		
		//resets strings for next use in while loop
		currentPalindrome = "";
		updatedCurrent = "";
		
	}
	readFile.close();
	//only print out the palindromes and avoids showing the non-palindromes
	
}
}
