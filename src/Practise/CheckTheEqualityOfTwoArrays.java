package Practise;

public class CheckTheEqualityOfTwoArrays {
	
	public static void checkEquality(int[] arr1, int[] arr2)
	{
		boolean status =true;
		if(arr1.length == arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i]!=arr2[i])
					status =false;
			}
		}
		if(status)
			System.out.println("Arrays are equal.");
		else
			System.out.println("Arrays are not equal.");
	}

	public static void main(String[] args) 
	{
		checkEquality(new int[] {1,2,3,4}, new int[] {1,2,3,4});
	}

}
