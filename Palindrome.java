package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String name = "Madam";
		int len = name.length();
		String name2 = "";
		
		for (int i=len-1 ;i>=0; i--)
		{
			name2 = name2 + name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(name2))
			System.out.println("Given String is a Palindrome");
		else
			System.out.println("Given String is not a Palindrome");

	}

}
