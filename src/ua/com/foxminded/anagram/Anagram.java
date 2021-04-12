package ua.com.foxminded.anagram;

public class Anagram {
	
	public  String reverseString(String input) {
		final String SPACE = " ";
		String[] words = input.split(SPACE);
		String[] outputString = new String[words.length];
		int i = 0;
		for (String string : words) {
			outputString[i] = reverseWord(string);
			i++;
		}
		return String.join(SPACE, outputString);
	}

	private String reverseWord(String input) {
		char[] chars = input.toCharArray();
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
