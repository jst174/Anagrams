package ua.com.foxminded.anagram;

public class Anagram {

	final static String SPACE = " ";

	public String reverseString(String input) {
		String[] words = input.split(SPACE);
		String[] outputWords = new String[words.length];
		int i = 0;
		for (String word : words) {
			outputWords[i] = reverseWord(word);
			i++;
		}
		return String.join(SPACE, outputWords);
	}

	private String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int i = 0;
		int j = chars.length - 1;
		while (i < j) {
			if (!Character.isLetter(chars[i])) {
				i++;
			} else if (!Character.isLetter(chars[j])) {
				j--;
			} else {
				char tmp = chars[j];
				chars[j] = chars[i];
				chars[i] = tmp;
				i++;
				j--;
			}
		}
		return String.valueOf(chars);
	}
}
