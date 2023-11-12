package practice;

import java.util.Arrays;

public class SearchAlgorithms {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 6)); //java built-in
	}

	private static int binarySearch(int[] arr, int numToFind){
		int low = 0;
		int high = arr.length - 1;


		while (low <= high){
			int middlePosition = (low + high) / 2;
			int middleNumber = arr[middlePosition];

			if (numToFind == middleNumber)
				return middlePosition; //basically finishes!
			else if (numToFind < middleNumber)
				high = middlePosition - 1; //high pointer assigned
			else
				low = middlePosition + 1; //low pointer assigned
		}

		return -1;
	}
}
