package stacks;

public class TestPalindromeChecker {

	public static void main(String[] args) {
		String palindromeOne = new String("tacocat");
		String palindromeTwo = new String("dada");
		
		PalindromeChecker palindromeChecker = 
				new PalindromeChecker(palindromeOne);
		
		PalindromeChecker palindromeChecker2 = 
				new PalindromeChecker(palindromeTwo);
		
		System.out.println(palindromeOne + " is " + palindromeChecker.isPalindrome());
		System.out.println(palindromeTwo + " is " + palindromeChecker2.isPalindrome());
	}

}
