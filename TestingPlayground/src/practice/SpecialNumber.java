package practice;

import java.util.Arrays;

/**
 * Special numbers are numbers that contain 0, 1, 2, 3, 4, or 5.
 */
public class SpecialNumber {
	public static String specialNumber(int number){
		char[] charArray = Integer.toString(number).toCharArray();
		int[] intArray = new int[charArray.length];

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));

		System.out.println(Arrays.toString(intArray));

		for (int i = 0; i < intArray.length; i++) {

			if (!(intArray[i] == 0
					|| intArray[i] == 1
					|| intArray[i] == 2
					|| intArray[i] == 3
					|| intArray[i] == 4
					|| intArray[i] == 5)){
				return "NOT!!";
			}
		}

		return "Special!!";
	}

	public static void main(String[] args) {
		System.out.println(specialNumber(20355));
	}
}
