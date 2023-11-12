package lectures;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonDemo {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setName("Kate");
//		s1.setAge(14);
//		s1.setId("1111");
//		s1.setAge('A');

		Student s1 = new Student("Kate", 14, "1111", 'A');
		Student s2 = new Student("Kate", 14, "1111", 'A');

//		System.out.println(s1.equals(s2));
//
//		System.out.println(s1.getPay());
//		System.out.println(p1.getPay());

		ArrayList<Person> arrayOfPeople = new ArrayList<>(5);
		//every student gets paid 1000
		arrayOfPeople.add(new Student("Kate", 23, "111", 'B'));
		arrayOfPeople.add(new Student("Mary", 34, "222", 'C'));

		//every person gets paid 0
		arrayOfPeople.add(new Person("John", 67));
		arrayOfPeople.add(new Person());

		for (Person p : arrayOfPeople) {
			System.out.println(p.getName() + " is paid " + p.getPay());
		}

		arrayOfPeople.remove(1);
		arrayOfPeople.remove(new Person("John", 67));

		System.out.println();
		System.out.println();
		for (Person p : arrayOfPeople) {
			System.out.println(p.getName() + " is paid " + p.getPay());
		}




	}

}
