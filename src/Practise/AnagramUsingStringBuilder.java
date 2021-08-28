package Practise;

public class AnagramUsingStringBuilder {

	public static boolean isAnagramUsingSB(String s1, String s2) {

		if (s1 == null && s2 == null)
		{
			return false;
		}

		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();

		boolean flag = true;

		if (str1.length() != str2.length()) 
		{
			return false;
		} 
		else
		{
			char[] charArray = str1.toCharArray();
			StringBuilder sb = new StringBuilder(str2);
			for (char c : charArray) 
			{
				int index = sb.indexOf("" + c);
				if (index != -1) 
				{
					sb.deleteCharAt(index);
				}
				else
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		System.out.println(isAnagramUsingSB("Silent", "Listen"));
		System.out.println(isAnagramUsingSB("Si l en t", "L is te  n"));
		System.out.println(isAnagramUsingSB("S il  en t", "L i s te n"));
	}
}
