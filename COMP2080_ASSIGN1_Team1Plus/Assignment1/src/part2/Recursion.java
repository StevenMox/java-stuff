
package part2;
import part2.InputException;
public class Recursion {
	
	
			
		public static void addSpace(String word)
		{
			
			if (word.length()==0)
			{
				System.out.println();
			}
			
			else
			{	
				
				System.out.print((word.charAt(0) + " "));
				
				word=word.substring(1);
				
				addSpace(word);
			}
		
		
	}
		
		
		public static String combWeva(String first, String second) throws InputException
		{
			
			if(first==null || second==null)
			{		
				throw new InputException("the wave cannot be null!");
			}
			
			else if (first.length()==0 || second.length()==0)
			{
				return first += second;
			}
			
			else if (first.length()==0 && second.length()==0)
			{
				throw new InputException("cannot perform a weave! plases input strings!");
			}
			
			else
			{
				return "" + first.charAt(0) + second.charAt(0) + combWeva(first.substring(1), second.substring(1));
			}
		}
		
		
		
		public static int lastIndex(char characterVal, String anyString)
		{
			
			if (anyString=="" || anyString==null)
				return -1;
			
			else if (anyString.charAt(anyString.length()-1)==characterVal)
				return (anyString.length()-1);
			else 
			{ 
				
				anyString = anyString.substring(0, anyString.length()-1);
				if (anyString.length()!=0)
					
					return lastIndex(characterVal, anyString);
				
				else return -1;
			}
		}

}

