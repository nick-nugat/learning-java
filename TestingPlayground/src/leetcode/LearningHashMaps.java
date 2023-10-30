package concepts;

import java.util.*;

public class LearningHashMaps {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			if (complementIndex != null)
				return new int[] {i, complementIndex};

			complements.put(target - nums[i], i);
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 5)));
	}
}

