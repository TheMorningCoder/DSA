package leetcode_questions;

import java.util.HashMap;

public class ConstructRansomNotefromMagazine {

	public static void main(String[] args) {
		String magazine="abcdefabc";
		String ransomNote="cafe";
		System.out.println(canConstruct(magazine,ransomNote));
		System.out.println(canConstruct("cutie puppy",ransomNote));
	}
	public static boolean canConstruct(String magazine,String ransomNote) {
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:magazine.toCharArray()) {
			map.put(c, map.getOrDefault(map.get(c),0)+1);
		}
		for(char c:ransomNote.toCharArray()) {
			if(!(map.containsKey(c))) {
				return false;
			}
			map.put(c,map.get(c)-1);
		}
		return true;
	}

}
