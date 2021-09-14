package Practise;
import java.util.*;
import java.util.Map.Entry;

public class HighestPercentageOccurenceOfCharacter {

	public static void occurenceOfNumber(int[] int_array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int each : int_array) {
			if (map.containsKey(each))
				map.put(each, map.get(each) + 1);
			else
				map.put(each, 1);
		}

		// System.out.println(map);
		int count = 0;
		int temp1 = 0;
		for (Entry<Integer, Integer> val : map.entrySet()) {

			if (val.getValue() > count) {
				count = val.getValue();
			}
			// System.out.println(val.getValue());
			// System.out.println(count);

			// System.out.println(val.getKey() + " "+ val.getValue());

			if (count == val.getValue() && val.getKey() > temp1)
				temp1 = val.getKey();

		}
		System.out.println(temp1);
	}

	public static void main(String args[]) {

		occurenceOfNumber(new int[] { 1, 1, 2, 3, 5, 6, 4, 4, 7, 4, 5, 2, 2, 4, 3, 7, 6, 6, 6, 7, 7 });
		// [1,1,2,3,5,6,4,4,7,4,5,2,2,4,3,7,6,6,6]
	}
}
