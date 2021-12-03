package week1.assignments;

public class AssignmentOne {
	
	/*
	Problem statement: Convert a negative number to positive number
	---------------------------------------------------------------
	Pseudocode:
	-----------
	1. Initialize an integer with a negative number
	   like, int number = -40;
	2. Check if the number is a negative number 
	   Hint : any number that is lesser than zero is a negative number
	3. If so, convert the number to a positive numer

	4. Print as below
	        "The number -40 is converted to 40"


	Problem statement: Check if the number is positive or negative
	---------------------------------------------------------------
	Pseudocode:
	----------
	 1. Initialize a number, say, int number= 35;
	 2. If a number is positive, print "The number is positive"
	    If a number is negative, print "The number is negative"
	    If it nether negative nor positive, print as "The number is neither positive nor negative" */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = -89;
		
		while(num1<0)
		{
			int num2 = -(num1);
			System.out.println("The number "+num1+" is converted to "+num2);
			break;
		}
		
		int num3 = -35;
		if (num3>0)
		{
			System.out.println("The number is positive");
		}
		else if(num3<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is neither positive nor negative");
		}
	}

}

