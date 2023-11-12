package practice;

public class WordReversal {
	public static void main(String[] args) {
		System.out.println(reverseWords("Hello there, how are you doing?"));
	}

	public static String reverseWords(String words){
		char lastCharacter = words.charAt(words.length() - 1);
		StringBuilder wordsWithoutPunctuations = new StringBuilder(words);
		if (lastCharacter == '.' || lastCharacter == '?' || lastCharacter == '!') {
			wordsWithoutPunctuations.deleteCharAt(words.length() - 1);
		}
		wordsWithoutPunctuations.replace(0, 1, words.substring(0, 1).toUpperCase());

		String[] temp = wordsWithoutPunctuations.toString().split(" ");
		StringBuilder reversed = new StringBuilder();

		for (int i = temp.length - 1; i >= 0; i--){

			reversed.append(temp[i]);
			if (i > 0) reversed.append(" ");
		}
		reversed.append(lastCharacter);

		return reversed.toString();
	}
}
