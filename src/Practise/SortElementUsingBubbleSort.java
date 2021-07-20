package Practise;

import java.util.Arrays;

public class SortElementUsingBubbleSort {

	public static void sortArray()
	{
		int[] a = {2,1,4,6,5};
		
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array "+Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		sortArray();

	}

}
