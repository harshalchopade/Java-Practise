package Practise;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {

		String[] str1 = {"A", "B", "C", "D"};
		String[] str2 = {"E", "F", "G", "H"};
		
		//Using Java8
		Stream<String> sClass1= Arrays.stream(str1);
		Stream<String> sClass2= Arrays.stream(str2);
		
		String fullArray[] = Stream.concat(sClass1, sClass2).toArray(size -> new String[size]);
		for(String s: fullArray)
			System.out.println(s);
		
		//Google Guava
//		String allTeam[] = ObjectArrays.concat(str1, str2, String.class);
//		for(String s: fullArray)
//			System.out.println(s);
		
		//for primitive type arrays
//		int p1[] = {1,2,3,4,5};
//		int p2[] = {6,7,8,9,10};
//		int p3[] = Ints.concat(p1,p2);
//		
//		for(int i :p3)
//			System.out.println(i);
	}

}
