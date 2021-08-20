package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindSecondLargestNumberInArray {

	public static void secondLargestNumberFromDuplicateArray() {
		Integer a[] = { 1, 45, 78, 49, 68, 88, 88, 77, 99, 99 };

		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer integer : a) {

			set.add(integer);
		}

		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		if (list.get(0) > list.get(1))
			System.out.println(list.get(1));
	}

	public static void main(String[] args) {
		secondLargestNumberFromDuplicateArray();
	}
}
