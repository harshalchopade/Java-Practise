package Practise;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculateAverageOfArrayElement {

	public static void main(String[] args) 
	{
		//Normal Method
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12};
		int total=0;
		for(int i : num)
			total+=i;
		
		System.out.println(total/num.length);
		
		//Using Java8
		OptionalDouble  avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
	}

}
