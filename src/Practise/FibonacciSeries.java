package Practise;

public class FibonacciSeries {
	
	public static void generateFibSeries(int num)
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2; i<=num ; i++)
		{
			sum = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}

	public static void main(String[] args) {
		generateFibSeries(5);
	}

}
