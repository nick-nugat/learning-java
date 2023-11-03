package scratch;

import java.util.Scanner;

/**
 * verify if password is:
 * - at least 8 chars long
 * - at least one uppercase and one lowercase
 * - has one digit
 */
public class PasswordVerifier {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;

		System.out.print("Enter password: ");
		password = input.nextLine();
		if (validPassword(password)) System.out.println("Valid Password");
		else System.out.println("Invalid Password");

	}

	public static boolean validPassword(String str) {
		boolean lengthOf8 = false;
		boolean uppercase = false;
		boolean lowercase = false;
		boolean digit = false;

		for (int i = 0; i < str.length(); i++) {
			if(str.length() >= 8) lengthOf8 = true;
			if(Character.isUpperCase(str.charAt(i))) uppercase = true;
			if(Character.isLowerCase(str.charAt(i))) lowercase = true;
			if(Character.isDigit(str.charAt(i))) digit = true;
		}

		return lengthOf8 && uppercase && lowercase && digit;
	}

}
