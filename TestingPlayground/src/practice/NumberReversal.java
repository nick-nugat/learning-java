package practice;

import java.util.Scanner;

public class NumberReversal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want to reverse? ");
		int number = scanner.nextInt();
		System.out.println(reverseNumber(number));
	}
	private static int reverseNumber(int number){
		StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
		stringBuilder.reverse();
		return Integer.parseInt(stringBuilder.toString());
	}
}
