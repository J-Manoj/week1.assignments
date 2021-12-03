package week1.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					
					// convert the string into char array
						
					//get the length of the array
						
					// traverse from 0 till the array length 
						
						// Check the char array has the particular char in it 
					
						// if is has increment the count
							 
						
						// print the count out of the loop
					
		int count = 0;
		
		//char[] array = str.toCharArray();  ---> This method is not covered in the session.
		
		char[] array = new char[str.length()];
		for(int j=0; j<str.length();j++)
		{
			array[j] = str.charAt(j);
		}
		
		
		int len = array.length;
		
		for (int i=0; i<len;i++)
		{
			if(array[i]=='e')
				count++;
		}
		
		System.out.println("Number of occurences of e: "+count);
		

	}

}
