package Practise;

public class CheckNumberIsAmstrongOrNarcissistic {

	public static boolean isNumberAmstrong(int number) {
		if (number < 0) {
			return false;
		}

		if (number >= 0 && number <= 9) {
			return true;
		}
		int power = powerOfNo(number);
		int copyNo = number;
		int sum = 0;
		while (copyNo != 0) {

			int lastDigit = copyNo % 10;
//			int factor = 1;
//			for(int i=0; i<power;i++)
//			{
//				factor = factor*lastDigit;
//			}
//			sum = sum+factor;

			sum = (int) (sum + Math.pow(lastDigit, powerOfNo(number)));
			copyNo = copyNo / 10;
		}

		if (sum == number)
			return true;
		else
			return false;

	}

	public static int powerOfNo(int number) {
		int n = 0;
		while (number != 0) {
			n++;
			number = number / 10;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(isNumberAmstrong(153));
	}
}
