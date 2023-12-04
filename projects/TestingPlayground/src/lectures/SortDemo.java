package lectures;

import java.util.ArrayList;
import java.util.Arrays;


public class SortDemo {
	public static void main(String[] args) {
		Person[] people = {
				new Person("Kate", 22),
				new Student("Kate", 17, "111", 'C'),
				new Instructor("John", 65, 2000)
		};

		for (Person p : people) {
			System.out.println(p);
		}
		Arrays.sort(people);

		System.out.println();
		for (Person p : people) {
			System.out.println(p);
		}


	}
}
