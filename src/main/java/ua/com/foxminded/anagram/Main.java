package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Anagram anagram = new Anagram();
			System.out.println("Enter your string, please");
			String input = scanner.nextLine();
			System.out.println(anagram.reverseString(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
