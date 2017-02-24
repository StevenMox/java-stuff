package PalindromeChecker;

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
//* Description: class that creates a stack
//****************************************************************************************************

public class MyStack {

	
		//instance variables
		private int topOfStack;
		Object[] stackArray;
		
		//constructor which uses an array
		public MyStack(int size){
			stackArray = new Object[size];
			topOfStack = -1;
		}
		
		//push method
		public void push(Object newData){
			topOfStack++;
			stackArray[topOfStack] = newData;
		}
		
		//pop method. uses "last" to avoid unreachable code.
		public Object pop(){
			if(topOfStack == -1){return null;}
			else{
				Object last = stackArray[topOfStack];
				topOfStack = topOfStack - 1;
				return last;
			}
		}
		
		//peek method.
		public Object peek(){
			if(topOfStack == -1){return null;}
			else{return stackArray[topOfStack];
			}
		}
		
		//checks whether the stack is empty
		public Boolean isEmpty(){
			if(topOfStack == -1)
			{
				return true;
				}
			else
			{
				return false;
				}
		}
	
}
