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
	public void testReverseStringWithLettersOnly() throws IllegalAccessException {
		assertEquals("dcba hgfe", anagram.reverseString("abcd efgh"));
	}

	@Test
	public void testReverseStringWithLettersAndNonLetters() throws IllegalAccessException {
		assertEquals("d1cba hgf!e", anagram.reverseString("a1bcd efg!h"));
	}

	@Test
	public void testReverseStringWithNonLettersOnly() throws IllegalAccessException {
		assertEquals("12%3! 45@6^", anagram.reverseString("12%3! 45@6^"));
	}

	@Test
	public void testReverseStringWithNull() {
		assertThrows(IllegalArgumentException.class, () -> anagram.reverseString(null));
	}

	@Test
	public void testReverseStringWithEmpty() {
		assertThrows(IllegalArgumentException.class, () -> anagram.reverseString(""));
	}
}
