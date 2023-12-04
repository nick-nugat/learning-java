package lectures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		int value;

		//try-with-resources (closes scanner automatically afterward)
		System.out.println("Enter value: ");

		try (Scanner scanner = new Scanner(System.in)) {
			value = scanner.nextInt();
			System.out.println("You entered " + value);

		} catch(InputMismatchException ime){
			System.out.println("Something went wrong!");
		}

	}
}
