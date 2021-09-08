package Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//We can use ArrayList also for holding the elements but there values may get duplicated
//So Hashset is best solution even if there is duplicate values.

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(2, 5));
		s1.retainAll(s2);

		Integer[] result = s1.toArray(new Integer[s1.size()]);

		for (Integer in : result) {
			System.out.println(in);
		}
	}
}
