package Practise;

public class CountNumberOfEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num = 12345;
		int even_count =0;
		int odd_count =0;
		while(num>0)
		{
			if((num%10)%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num =num/10;
		}
		System.out.println("Even Numbers "+even_count);
		System.out.println("Even Numbers "+odd_count);

	}
}
