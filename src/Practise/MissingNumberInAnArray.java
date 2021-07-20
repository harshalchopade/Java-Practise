package Practise;

public class MissingNumberInAnArray {
	
	public static void findMissingNumber()
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,4,5};
		int sum1 =0;
		int sum2 =0;
		for(int a : arr1)
		{
			sum1 = sum1 + a;
		}
		
		for(int b : arr2)
		{
			sum2 = sum2 + b;
		}
		
		int missingNo = sum1-sum2;
		System.out.println(missingNo);
	}

	public static void main(String[] args) 
	{
		findMissingNumber();

	}

}
