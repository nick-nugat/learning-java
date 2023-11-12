package practice;

public class FindTheWord {
	public static void main(String[] args) {
		System.out.println(findTheSecondToLastWord("I love Codecademy!"));
		System.out.println(findTheNthWord("I can program in Java", 3));
	}

	public static String findTheSecondToLastWord(String words){
		String[] temp = words.split(" ");
		return temp[temp.length - 2];
	}

	public static String findTheNthWord(String words, int n){
		String[] temp = words.split(" ");
		return temp[n - 1];
	}
}
