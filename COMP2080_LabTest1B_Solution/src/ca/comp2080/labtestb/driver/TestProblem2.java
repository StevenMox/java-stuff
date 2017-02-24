package ca.comp2080.labtestb.driver;

import ca.comp2080.labtestb.stack.DualStack;

public class TestProblem2 {

	public static void main(String[] args) {
	
		/*************************************
		 * LAB TEST 1 B - PROBLEM 2
		 ************************************/
		DualStack stack = new DualStack();		
		stack.pushA("3");
		stack.pushA("5");
		stack.pushB("7");
		stack.pushB("9");
		
		//Test overflow of both stacks
		stack.pushA("11");
		stack.pushB("13");
		
		//Test pop for stack A
		stack.popA();
		stack.pushA("11");
		
		//Test pop for stack B
		stack.popB();
		stack.pushB("13");
				
		
	}
	
	
}
