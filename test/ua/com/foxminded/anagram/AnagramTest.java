package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

	private Anagram anagram;

	@BeforeEach
	public void setUp() {
		anagram = new Anagram();
	}

	@Test
	public void reverseString_argumentIsNull_ShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () -> anagram.reverseString(null));
	}

	@Test
	public void reverseString_argumentIsEmpty_ShouldReturnEmptyString() {
		assertEquals("", anagram.reverseString(""));
	}

	@Test
	public void reverseString_WordWithLettersOnly_ShouldReverseWord() {
		assertEquals("dcba", anagram.reverseString("abcd"));
	}

	@Test
	public void reverseString_WordWithSomeNonLettersSymbol_NonLettersSymbolsShouldStayOnTheSamePlaces() {
		assertEquals("d1cba!", anagram.reverseString("a1bcd!"));
	}

	@Test
	public void reverseString_WordWithNonLettersSymbolsOnly_ShouldNotReverse() {
		assertEquals("12@3!", anagram.reverseString("12@3!"));
	}

	@Test
	public void reverseString_TextWithWordsConsistingOnlyOfLetters_ShouldReverseAllWords() {
		assertEquals("dcba hgfe", anagram.reverseString("abcd efgh"));
	}

	@Test
	public void reverseString_TextWithWordsConsistingOfSomeNonLettersSymbol_ShouldReverseLettersOnly() {
		assertEquals("d1cba hgf!e", anagram.reverseString("a1bcd efg!h"));
	}

	@Test
	public void testReverseString_TextWithWordsConsistingOfOnlyNonLettersSymbol_ShouldReturnSameText() {
		assertEquals("12%3! 45@6^", anagram.reverseString("12%3! 45@6^"));
	}
}
