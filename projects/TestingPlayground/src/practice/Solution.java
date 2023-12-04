package practice;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static int removeElement(int[] nums, int val) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) arrayList.add(i, nums[i]);
		}

		return arrayList.size();

	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 1};
		int val = 2;

		System.out.println(removeElement(arr, val));
	}
}