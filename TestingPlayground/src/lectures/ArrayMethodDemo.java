package lectures;

import java.util.Arrays;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		int[][] nums = {
				{34, 56, 12},
				{10, 56},
				{1, 5, 7, -8}
		};

		System.out.println(sumOfArray(nums));

		//using Arrays.toString() method
		int[] myArray = createOne(nums, 1);
		System.out.println(Arrays.toString(myArray));

		//using enhanced for loop
		for(int n: myArray) {
			System.out.print(n + " ");
		}



	} //end main

	/**
	 * method that takes 2D ragged array and finds sum of all elements in array
	 * @param array
	 * @return
	 */
	public static int sumOfArray(int[][] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				sum += array[i][j];
		}
		return sum;
	}


	public static int[] createOne(int[][] arr, int col) {
		int[] arrayColumn = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			arrayColumn[i] = arr[i][col];

		return arrayColumn;

	}
}
