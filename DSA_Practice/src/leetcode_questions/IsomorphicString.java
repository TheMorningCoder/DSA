package leetcode_questions;

import java.util.HashMap;
import java.util.Objects;

public class IsomorphicString {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg","add"));
		System.out.println(isIsomorphic("egg","tol"));
		System.out.println(isIsomorphic("too","foo"));
	}

	public static boolean isIsomorphic(String s, String t) {
		char arr1[] = s.toCharArray();
		char arr2[] = t.toCharArray();
		HashMap<Character, Integer> mapOne = new HashMap<>();
		HashMap<Character, Integer> mapTwo = new HashMap<>();
		if (arr1.length != arr2.length)
			return false;
		for (int i = 0; i < arr1.length; i++) {
			Integer i1 = mapOne.put(arr1[i], i);
			Integer i2 = mapTwo.put(arr2[i], i);
			if(!Objects.equals(i1, i2)) {
				return false;
			}
		}
		return true;
	}

}
