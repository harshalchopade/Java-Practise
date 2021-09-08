package Practise;

public class FindAllTheLeadersInAnIntegerArray {
	
	/*Leader No
	 * Last no in array is always a leader number
	 * Right element always should be lesser than left element
	 * 
	 * */

	
	public static void findLeaders(int[] num)
	{
		if(num.length==1)
		{
			System.out.println(num[0]);
			return;
		}
		
		int max = num[num.length - 1];
		System.out.print(max + " ");
		for(int i = num.length - 2; i>=0; i--)
		{
			if(num[i]> max)
			{
				System.out.print(num[i] + " ");
				max = num[i];
			}	
		}	
	}
	
	public static void main(String[] args) {
		
		int[] array1 = {92, 7, 12, 9, 8, 3};
		findLeaders(array1);
		
		int[] array2 = {92, 11, 10, 9, 8, 14};
		findLeaders(array2);
		
		int[] array3 = {92, 11, 10, 9, 8, 14, 3, 3};
		findLeaders(array3);
	}

}
