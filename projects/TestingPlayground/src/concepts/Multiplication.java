package concepts;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;

		System.out.print("Enter x: ");
		x = scanner.nextInt();

		System.out.print("Enter y: ");
		y = scanner.nextInt();

		int result = multiplyWithRecursion(x, y);
		System.out.println(result);
	}

	private static int multiplyWithRecursion(int x, int y) {
		if (y == 0){
			return 0;
		} else{
			return x + multiplyWithRecursion(x, y - 1);
		}
	}
}
