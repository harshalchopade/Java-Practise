package Practise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayUsingInBuiltMethods {
	
	public static void sortUsingInBuilt()
	{
		int[] arr = {1,4,78,96,48,96};
		
		//Approach1
		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		
		//Approach2
		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		
		//Approach3 -- primitve type not supported
//		System.out.println("Arrays before sorting "+Arrays.toString(arr));
//		Arrays.sort(arr, Collections.reverseOrder());
//		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		
	}

}
