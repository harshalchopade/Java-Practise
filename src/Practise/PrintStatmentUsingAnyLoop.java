package Practise;

public class PrintStatmentUsingAnyLoop {

	public static void main(String[] args) {
		String name = "Harshal";
		String s = "i";
		s = s.replaceAll("i", "iiiiiiiiii"); //10
		s = s.replaceAll("i", "iiiiiiiiii");//100
		s = s.replaceAll("i", "iiiiiiiiii"); //1000
		
		s= s.replaceAll("i", name + "\n");
		System.out.println(s);

	}

}
