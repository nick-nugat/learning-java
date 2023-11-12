package practice;

public class WordSearch {
	public static void main(String[] args) {
		System.out.println(startWithWord("hello world", "hello"));
		System.out.println(numOfTimesWordIsSeen("hello hellosdasdf world", "hello"));
	}

	public static boolean startWithWord(String words, String wordToFind){
		String[] temp = words.split(" ");
		return temp[0].equals(wordToFind);
	}

	public static int numOfTimesWordIsSeen(String words, String wordToFind){
		int value = 0;
		String[] temp = words.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].contains(wordToFind)) value++;
		}

		return value;

	}
}
