package Practise;

public class LinearSearch {
	
	public static void searchElementUsingLinear()
	{
		int[] arr = {1,2,3,4,5,6};
		int searchNo = 10;
		boolean status= false;
		for(int i=0;i<arr.length;i++)
		{
			if(searchNo == arr[i])
			{
				System.out.println("Element found at "+i);
				status = true;
				break;
			}
		}
		if(status ==false)
			System.out.println("Element not found.");
	}

	public static void main(String[] args) {
		searchElementUsingLinear();

	}

}
