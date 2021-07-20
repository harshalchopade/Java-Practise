package Practise;

public class NULLConcept {
	static Object obj;
	static String str; 
	public static void main(String[] args) {
		
		
		//1 case sensitive
		//Object obj = null;
		
		//2 default value for any kind of class refn
		//System.out.println(obj);
		System.out.println(str);

		//3.null is allowed for Wrapper class not for primitive
		//Integer i = null;
		//int j = null;
		
		//4.instanceof
		Integer i = null;
		Integer j = 20;
		
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer); //i is pointing to null, when we assign the value then only ref will be applied
		
		//5. static vs nonstatic
		NULLConcept obj = null;
		//obj.send();
		obj.sum(); //static method can be accessed by null refrnc also.
		
		//6 == and !=
		System.out.println(null==null);//true
		System.out.println(null!=null);
		
		//7
		String str = null;
		Integer id = null;
		Double d = null;
		
		String s1 = (String)null;
		System.out.println(s1); //null
		
		
		System.out.println(s1+ "Harshal"); //null
		System.out.println(s1.length()); //NPE any action can't be performed.
		
	}

	public static void sum() {
		System.out.println("sum");
	}
	
	public void send() {
		System.out.println("send");
	}
}
