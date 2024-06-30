package leetcode_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CheckWordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abca", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog cat cat fish"));
		System.out.println(wordPattern("a==a", "dog cat dog"));
		System.out.println(wordPattern("a==a", "dog cat cat dog"));

	}

	public static boolean wordPattern(String pattern, String s) {
		char charArray[] = pattern.toCharArray();
		String wordArray[] = s.split(" ");
		if (charArray.length != wordArray.length) {
			return false;
		}
		HashMap<Character, Integer> charMap = new HashMap<>();
		HashMap<String, Integer> wordMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			Integer currentCharIndex = charMap.put(charArray[i], i);
			Integer currentWordIndex = wordMap.put(wordArray[i], i);
			if(!Objects.equals(currentCharIndex,currentWordIndex)) {
				return false;
			}
		}

		return true;
	}
}
