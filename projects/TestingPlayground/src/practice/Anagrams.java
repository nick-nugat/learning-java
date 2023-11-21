package practice;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("binary", "brainy"));
	}

	public static boolean isAnagram(String word1, String word2) {
		if (word1.length() != word2.length()) return false;

		boolean status = true;
		char[] array1 = word1.toCharArray();
		char[] array2 = word2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);

		return Arrays.equals(array1, array2);
	}
}
