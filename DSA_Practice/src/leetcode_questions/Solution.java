package leetcode_questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Solution {

	public static String intToRoman(int num) {
		HashMap<Integer, String> map = new HashMap<>();
		String str = "";
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");

		Set<Integer> keys = map.keySet();

		while (num != 0) {
				System.out.println("num= "+num);
				if (keys.contains(num)) {
					str += map.get(num);
					num = 0;
					
				} 
				else {
					int n = num;
					int maxKey = Collections.max(keys.stream().filter(k -> k < n).toList());
					//System.out.println("maxKey= "+maxKey);
					str += map.get(maxKey);
					System.out.println("str= "+str);
					num -= maxKey;
					//System.out.println("updated num= "+num);

					
				}
		}

		return str;
	}

	public static void main(String args[]) {
		System.out.println(intToRoman(3749));
		//System.out.println(intToRoman(42));
	}

}