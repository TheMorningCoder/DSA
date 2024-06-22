package leetcode_questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IntegerToRoman {
	public static void main(String args[]) {
		System.out.println(integerToRomanApproach1(3749));
		System.out.println(integerToRomanApproach2(3749));
	}
	
	public static String integerToRomanApproach1(int num) {
		String str="";
		HashMap<Integer,String> map=new HashMap<>();
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
		
		Set<Integer> keys=map.keySet();
		
		while(num>0) {
			if(keys.contains(num)) {
				str+=map.get(num);
				num=0;
			}
			else {
				int n=num;
				int maxKey=Collections.max(keys.stream().filter(k->k<n).toList());
				str+=map.get(maxKey);
				num-=maxKey;
			}	
		}
		return str;
	}
	
	
	
	
	public static String integerToRomanApproach2(int num) {
		String str="";
		LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        
        for(Map.Entry<Integer,String>entry :map.entrySet()) {
        	int key=entry.getKey();
        	String value=entry.getValue();
        	
        	while(num>=key) {
        		str=str+value;
        		num=num-key;
        	}	
        }
		
		return str;
	}
}
