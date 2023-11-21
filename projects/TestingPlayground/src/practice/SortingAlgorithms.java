package practice;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10000];

		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(10000);

		/**
		 * for 10000 elements:
		 * merge sort AND quick sort - 2ms
		 * insertion sort - 10ms
		 * bubble sort - 86ms
		 * selection sort - 34ms
		 */
		System.out.println("Before: " + Arrays.toString(arr));
		long startTime = System.currentTimeMillis();
		quickSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("After: " + Arrays.toString(arr));
		System.out.println("Algorithm took: " + (endTime - startTime) + "ms");
	}

	//overloaded method for simpler method call
	private static void quickSort(int[] arr){
		quickSort(arr, 0, arr.length - 1);
	}
	//recursive type of method - random index is the "pivot" - takes values less than and greater than pivot and places them on left and right of it respectively - continues doing same thing for its sub-arrays
	private static void quickSort(int[] arr, int lowIndex, int highIndex){
		if (lowIndex >= highIndex) return;

		//choosing pivot randomly
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;

		//setting pivot to random index in array
		int pivot = arr[pivotIndex];

		//swapping value at pivotIndex with value at highIndex
		swap(arr, pivotIndex, highIndex);

		int leftPointer = partition(arr, lowIndex, highIndex, pivot); //partitions array

		//recursive - sorts left sub-array
		quickSort(arr, lowIndex, leftPointer - 1);

		//recursive - sorts right sub-array
		quickSort(arr, leftPointer + 1, highIndex);
	}

	private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		//move left and right pointers towards each other until they hit each other :p
		while (leftPointer < rightPointer){
			//while value at leftPointer in array is <= the pivot AND the leftPointer is less than the rightPointer, INCREMENT the leftPointer
			while ((arr[leftPointer] <= pivot) && (leftPointer < rightPointer))
				leftPointer++;
			//while value at rightPointer in array is >= the pivot AND the leftPointer is less than the rightPointer, DECREMENT the rightPointer
			while ((arr[rightPointer] >= pivot) && (leftPointer < rightPointer))
				rightPointer--;

			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);

		return leftPointer;
	}

	//values "bubble" to the top
	private static void bubbleSort(int[] arr){
		int length = arr.length;
		boolean sorted = true;

		//checks if list needs to be sorted again
		while (sorted){
			sorted = false;
			for (int i = 0; i < length - 1; i++) {
				int currentValue = arr[i];
				int nextValue = arr[i + 1];

				if (currentValue > nextValue){
					swap(arr, i, i + 1); //swaps values at index i and index i + 1
					sorted = true;
				}
			}
		}
	}

	//loops array multiple times, finding the smallest value from where its index is and swapping it
	private static void selectionSort(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			int minValue = arr[i];
			int indexOfMin = i;
			for (int j = i + 1; j < length; j++){
				if (arr[j] < minValue){
					minValue = arr[j];
					indexOfMin = j;
				}
			}
			swap(arr, i, indexOfMin);
		}
	}

	//checks a value -> are values before greater? -> move over
	private static void insertionSort(int[] arr){
		int length = arr.length;

		for (int i = 1; i < length; i++) {
			int currentValue = arr[i]; //saving current value off to a temporary variable

			int j = i - 1;
			while (j >= 0 && arr[j] > currentValue){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentValue;
		}
	}

	private static void mergeSort(int[] arr) {
		int length = arr.length;
		int midIndex = arr.length / 2;

		if (length < 2) return; //during recursive calls, when the input array length is less than 2, the method finishes

		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[length - midIndex];

		//copy elements from arr to leftHalf
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = arr[i];
		}

		//copy second half of elements from arr to rightHalf
		for (int i = midIndex; i < length; i++) {
			rightHalf[i - midIndex] = arr[i];
		}

		//recursive calls to mergeSort()
		mergeSort(leftHalf);
		mergeSort(rightHalf);

		//merge array halves together
		merge(arr, leftHalf, rightHalf);
	}

	/**
	 * Swaps two values in an array
	 * @param arr Array whose values need to be swapped
	 * @param a Index to swap
	 * @param b Index to swap
	 */
	private static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void merge(int[] arr, int[] leftHalf, int[] rightHalf){
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;

		/*
		iterators:
		i - left
		j - right
		k - merged
		*/
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength){
			if (leftHalf[i] <= rightHalf[j]){
				arr[k] = leftHalf[i];
				i++;
			} else {
				arr[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while(i < leftLength){
			arr[k] = leftHalf[i];
			i++;
			k++;
		}

		while(j < rightLength){
			arr[k] = rightHalf[j];
			j++;
			k++;
		}


	}
}
