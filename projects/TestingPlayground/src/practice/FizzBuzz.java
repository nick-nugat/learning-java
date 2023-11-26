package practice;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> arrayList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int j = i + 1;
			if (j % 15 == 0) arrayList.add("FizzBuzz");
			else if (j % 3 == 0) arrayList.add("Fizz");
			else if (j % 5 == 0) arrayList.add("Buzz");
			else arrayList.add(Integer.toString(j));
		}

		return arrayList;
	}

//	public static void main(String[] args) {
//		Solution solution = new Solution();
//
//		System.out.println(solution.fizzBuzz(5));
//	}
}
