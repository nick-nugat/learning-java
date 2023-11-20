package practice;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty()) return null;

		String[] arrayOfStrings = phrase.split(" ");
		for (int i = 0; i < arrayOfStrings.length; i++) {
			String current = arrayOfStrings[i];
			String firstCharacterOfWord = current.substring(0, 1), restOfWord = current.substring(1);

			arrayOfStrings[i] = firstCharacterOfWord.toUpperCase() + restOfWord;
		}
		StringBuilder temp = new StringBuilder();

		for (String word : arrayOfStrings) {
			temp.append(word + " ");
		}

		return temp.toString().trim();

	}

	public static void main(String[] args) {
		JadenCase jadenCase = new JadenCase();
		System.out.print(jadenCase.toJadenCase("Hello world, how are you doing"));
	}

}