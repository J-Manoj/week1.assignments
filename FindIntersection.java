package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] arr = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		System.out.println("First matching array");
		
		for (int i=0;i<arr.length; i++)
		{
			int ans = 0;
			for (int j=0; j<arr2.length;j++)
			{
				while(arr[i]==arr2[j])
				{
					ans = arr[j];
					System.out.println(arr[j]);
					break;
				}
			}
			if(ans > 0)
			{
				break;
			}
			else 
				continue;
		}

	}

}
