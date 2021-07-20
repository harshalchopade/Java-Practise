package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {

	public static void removeDuplicates() {
		
		Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
		 
		List<Integer> listWithoutDuplicates = Arrays.asList(origArray)
		                        .stream()
		                .distinct()
		                .collect(Collectors.toList());
		  
		System.out.println(listWithoutDuplicates);
		
	}
	public static void main(String[] args) {
		removeDuplicates();
	}

}
