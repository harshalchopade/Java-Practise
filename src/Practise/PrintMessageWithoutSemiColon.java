package Practise;

public class PrintMessageWithoutSemiColon {

	public static void main(String[] args) {
		
		//App 1
		if(System.out.printf("Hello World" +"\n") == null)
		{	
		}
		
		//App2
		if(System.out.append("Hello World"+"\n") == null)
		{	
		}

		//App3
		if(System.out.append("Hello World"+"\n").equals(null))
		{	
		}
		
		//App4
		for(int i=0; i<1; System.out.println("Hello World"))
		{
			i++;
		}
	}
}
