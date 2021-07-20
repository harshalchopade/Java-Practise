package Practise;

public class FindSumOfElementInArray {

	public static void sumOfElementInArray(int[] numberArray)
	{
		int sum =0;
		for(int a: numberArray)
		{
			sum = sum+a;
			
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args)
	{
		
		sumOfElementInArray(new int[] {1,2,3,4,5,6});
	}

}
