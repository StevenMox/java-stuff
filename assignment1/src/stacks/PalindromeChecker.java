package stacks;

import java.util.Stack;

public class PalindromeChecker {
	private String inputString;
	
	private Stack<Character> characterStack = new Stack<Character>();
	
	public PalindromeChecker(String inputString)
	{
		this.inputString = inputString;
		this.fillStack();
	}
	
	private void fillStack(){
		for (int i = 0; i < this.inputString.length(); i++)
			{
			this.characterStack.push(this.inputString.charAt(i));
			}
	}
	
	private String concateReverseInputString()
	{
		StringBuilder reversedInputString  = new StringBuilder();
		while(!this.characterStack.isEmpty())
		{
			reversedInputString.append(this.characterStack.pop());
		}
		return reversedInputString.toString();
	}
	
	public boolean isPalindrome(){
		return this.inputString.equalsIgnoreCase(this.concateReverseInputString());
	}
}