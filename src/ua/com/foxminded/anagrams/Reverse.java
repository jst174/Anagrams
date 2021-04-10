package ua.com.foxminded.anagrams;

public class Reverse {
	public static String reverseString(String input) {
		String[] inputString = input.split(" ");
		String[] outputString = new String[inputString.length];

		int i = 0;
		for (String string : inputString) {

			outputString[i] = reverseWord(string);
			i++;
		}

		return String.join(" ", outputString);

	}

	private static String reverseWord(String input) {

		char[] inputWord = input.toCharArray();

		for (int i = 0, j = inputWord.length - 1; i < j;) {

			if (!Character.isLetter(inputWord[i])) {
				i++;
			} else if (!Character.isLetter(inputWord[j])) {
				j--;
			} else {
				char tmp = inputWord[j];
				inputWord[j] = inputWord[i];
				inputWord[i] = tmp;
				i++;
				j--;
			}
		}
		return String.valueOf(inputWord);
	}
}
