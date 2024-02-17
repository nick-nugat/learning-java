package concepts;

import java.util.Scanner;

public class CharCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		char c;

		System.out.print("Enter a string: ");
		s = scanner.nextLine();

		System.out.print("Enter a character: ");
		c = scanner.next().charAt(0);

		int amountOfChars = countChars(s, c);
		System.out.println(amountOfChars);
		scanner.close();
	}

	public static int countChars(String s, char c) {
		if (s.isEmpty()){
			return 0;
		} else{
			char currentChar = Character.toLowerCase(s.charAt(0));
			int count = c == currentChar ? 1 : 0;

			return count + countChars(s.substring(1), c);
		}
	}
}
