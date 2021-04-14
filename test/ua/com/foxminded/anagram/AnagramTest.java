package ua.com.foxminded.anagram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

	private Anagram anagram;

	@Before
	public void setUp() {
		anagram = new Anagram();
	}

	@Test
	public void testReverseStringWithLettersOnly() {
		assertEquals("dcba hgfe", anagram.reverseString("abcd efgh"));
	}

	@Test
	public void testReverseStringWithLettersAndNonLetters() {
		assertEquals("d1cba hgf!e", anagram.reverseString("a1bcd efg!h"));
	}

	@Test
	public void testReverseStringWithNonLettersOnly() {
		assertEquals("12%3! 45@6^", anagram.reverseString("12%3! 45@6^"));
	}
}
