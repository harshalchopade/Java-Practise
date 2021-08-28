package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElementPresentAtEvenPosition {

	public static Integer[] sortElementsPresentAtEvenPosition(int[] array) {

		List<Integer> listOfArray = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0)
				listOfArray.add(array[i]);
		}
		
		Collections.sort(listOfArray);
		Integer[] intArray = new Integer[listOfArray.size()];
		for(int i=0; i<listOfArray.size();i++)
		{
			intArray[i] = listOfArray.get(i);
		}
		return intArray;
	}

	public static void main(String[] args) {

		Integer[] sorted  = sortElementsPresentAtEvenPosition(new int[] { 1, 9, 5, 7, 8, 4 });
		for (Integer integer : sorted) {
			System.out.println(integer);
		}
	}
}
