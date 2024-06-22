package leetcode_questions;

import java.util.HashMap;

public class ConvertRomanToInteger {
	
	
	public static int romanToInt(String str) {
		int sum=0;
		int len=str.length();
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i=0;i<len;i++) {
			int currentValue=map.get(str.charAt(i));
			int endIndex=len-1;
			
			if(i<endIndex && currentValue<map.get(str.charAt(i+1)) ) {
				sum-=currentValue;
			}
			else {
				sum+=currentValue;
			}
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		String str="LVIII";
		System.out.println(str+" = "+romanToInt("LVIII"));
	}

}
