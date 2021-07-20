package Practise;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoop {
	
	public static void printNumbers(int start, int end) {
		if(start<=end)
		{
			System.out.println(start);
			start++;
			printNumbers(start, end);
		}
		
		//UsingLambda
		IntStream.range(1, 101).forEach(e->System.out.println(e));
	}

	public static void main(String[] args) {
		printNumbers(1, 100);
	}

}
