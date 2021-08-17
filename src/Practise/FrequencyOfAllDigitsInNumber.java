package Practise;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfAllDigitsInNumber {

	public static void frequencyOfNumber(long number) {

		if(String.valueOf(number).length()==1)
		{
			System.out.println(number +" : "+1);
			return;
		}
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();

		while (number != 0) {
			long lastDigit = number % 10;
			if (map.containsKey(lastDigit)) {
				map.put(lastDigit, map.get(lastDigit) + 1);
			} else {
				map.put(lastDigit, 1);
			}
			number = number / 10;
		}

		Set<Long> keys = map.keySet();
		for (Long eachKey : keys)
			System.out.println("Key " + eachKey + " occured " + map.get(eachKey));
	}

	public static void main(String[] args) {
		frequencyOfNumber(88888888);
	}
}
