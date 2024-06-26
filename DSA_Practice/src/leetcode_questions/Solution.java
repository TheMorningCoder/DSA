package leetcode_questions;

import java.util.HashMap;

public class Solution {

	public static void main(String args[]) {

		System.out.println(romanToInteger("LVIII"));
		System.out.println(romanToInteger("CCCXL"));
	}

	public static int romanToInteger(String str) {
		int num=0;
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len=str.length();
		for(int i=0;i<len;i++) {
			int currentValue=map.get(str.charAt(i));
			int endIndex=len-1;
			if(i<endIndex&&currentValue<map.get(str.charAt(i+1))) {
				num=num-currentValue;
			}else {
				num=num+currentValue;
			}
		}
		return num;
	}
}
