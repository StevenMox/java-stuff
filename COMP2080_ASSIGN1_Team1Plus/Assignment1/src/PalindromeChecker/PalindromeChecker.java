package PalindromeChecker;

//****************************************************************************************************
//* Project: Java Project
//* Assignment: Assignment 1
//* Author(s)- Student Numbers:  
//               Harsha Sharma - 101039753,
//               Steven Moxley - 101049722,
//               Maksym Bardus - 100953577,
//               Roman Kovalchyk - 101041366,
//               Osman Mammadli - 100896285,
//               Anton Zhelnerovich - 100961892
//* Date: 10 Feb, 2017
//* Description: class that creates a PalindromeChecker object
//****************************************************************************************************

public class PalindromeChecker {

	
		//private instance variables
		private int length = 0;
		private String palindrome;
		private MyStack palindromeStack;
		private Boolean isPalindrome = true;
		
		//constructor: takes in a length and a string, which are used
		//to construct a MyStack object
		public PalindromeChecker(int l, String drome){
			length = l;
			palindrome = drome;
			palindromeStack = new MyStack(length/2);
		}
		
		//if the string length is even
		public Boolean checkEven(){
			
			//pushes half of the string onto the stack
			
			for(int i = 0; i<length/2; i++){
				palindromeStack.push(palindrome.charAt(i));
			}
			
			//pops each element in the stack and compares it with
			//the second half of the string
			
			for(int j = length/2; j<length; j++){
				if(palindrome.charAt(j) != (Character) palindromeStack.pop()){
					isPalindrome = false;
				}
			}
			return isPalindrome;
		}
		
		//if the string length is odd
		public Boolean checkOdd(){
			
			//pushes half of the string onto the stack, excepting the middle
			//element
		
			for(int i = 0; i<length/2; i++){	
				palindromeStack.push(palindrome.charAt(i));
			}
					
			//pops each element in the stack and compares it with
			//the second half of the string, excepting the middle element
			
			for(int j = length/2 + 1; j<length; j++){
				if(palindrome.charAt(j) != (Character) palindromeStack.pop()){
					isPalindrome = false;
				}
			}
					
			return isPalindrome;
		}
	
}
