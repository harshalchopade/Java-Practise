package Practise;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Harsh", 1, 50, 20);
		Student s2 = new Student("David", 2, 60, 30);
		
		List<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);

//		for (Student student : st) {
//			System.out.println(student);
//		}
		
		//Using Stream
		st.stream().forEach(e->System.out.println(e));

		//name who got marks greater than 5.
		st.stream().filter(e->e.getMarks()>5).forEach(e->System.out.println(e.getName() + " "+ e.getMarks() ));
	}

}
