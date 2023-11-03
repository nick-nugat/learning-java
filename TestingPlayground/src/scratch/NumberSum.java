package scratch;

import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers separated by commas: ");
		String numsWithCommas = input.nextLine();
		System.out.println(sumOfNums(numsWithCommas));

	}

	public static int sumOfNums(String nums) {
		int sum = 0;

		String[] stringArray = nums.split(",");
		int[] intArray = new int[stringArray.length];

		for (int i = 0; i < stringArray.length; i++)
			intArray[i] = Integer.parseInt(stringArray[i]);
		for (int j : intArray)
			sum += j;

		return sum;
	}
}
