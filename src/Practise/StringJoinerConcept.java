package Practise;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		StringJoiner join = new StringJoiner(",", "[", "]");
		join.add("Harshal").add("Vishal").add("Pralhad");
		System.out.println(join);
		

	}

}
