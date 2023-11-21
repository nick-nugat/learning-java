package scratch;

import java.util.Scanner;

public class BackwardString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String phrase;
		System.out.print("Enter a string: ");
		phrase = scanner.nextLine();
		System.out.print(backwards(phrase));
	}
	public static String backwards(String phrase) {
		StringBuilder strb = new StringBuilder(phrase);

		strb.reverse(); //reverses strings

		return strb.toString();
	}
}
