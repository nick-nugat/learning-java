package lectures.cmsc204;

public class Main {
	public static void main(String[] args) {
		recursive(5);
	}

	/**
	 * this is a recursive method that prints out the binary equivalent of int a
	 * @param a number passed in
	 */
	static void recursive(int a){
		if (a < 2){ //base 2
			System.out.println(a);
			return;
		}
		recursive(a / 2);
		System.out.println(a % 2);
	}
}
