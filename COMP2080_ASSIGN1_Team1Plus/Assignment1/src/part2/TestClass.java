
package part2;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("--Task #1--");
		String ask;
	    do {
		
		System.out.print("Enter a word: ");
	     String word = input.nextLine();
	    System.out.print("The word with space is: ");
	    Recursion.addSpace(word);
	    System.out.println("Would you like to repeat task 1? \nIf 'Yes' enter 'y', if no press any other button");
	    
	    ask = input.nextLine();
	    
	    }
	    while (ask.equals("y") || ask.equals("Y"));
	    System.out.println("\n\n\n--Task #2--");
	   
	    
	    do {
	    System.out.print("Enter the first word: ");
	      String first = input.nextLine();
	      System.out.print("Enter the second word: ");
	      String second = input.nextLine();
	      try 
	      {
	    	  System.out.println("Compilation of the weave is: " + Recursion.combWeva(first, second));		
	      } 
	      
	      catch (Exception InputException) 
	      {
			// TODO Auto-generated catch block
			InputException.printStackTrace();		
	      }
	      System.out.println("Would you like to repeat task 2?\nIf 'Yes' enter 'y', if no press any other button");
		    
		    ask = input.nextLine();
	      
	    }
	    while (ask.equals("y") || ask.equals("Y"));
	    System.out.println("\n\n\n--Task #3--");
	    do {
	      System.out.print("Enter the character: "); 
	      String chVal = input.nextLine();
	      char cha = chVal.charAt(0);
	      System.out.print("Enter the word: ");
	      String word = input.nextLine();
	      
	      System.out.println("The last index is: " + Recursion.lastIndex(cha, word));
	      System.out.println("Would you like to repeat task 3?\nIf 'Yes' enter 'y', if no press any other button");
		    
		    ask = input.nextLine();
	      
	    }
	    while (ask.equals("y") || ask.equals("Y"));
	   }

	}


