package leetcode_questions;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String arr[]) {
		String prefix=arr[0];
		for(int i=1;i<arr.length;i++) {
			while(arr[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
					return "";
			}
		}
		
		
		return prefix;
	}

	public static void main(String[] args) {
		String str[]= {"flower", "flow", "flight"};
		String str2[]= {"dog", "racecar", "car"};
		System.out.println("Longest Common Prefix is: "+longestCommonPrefix(str));
		System.out.println("Longest Common Prefix is: "+longestCommonPrefix(str2));

	}

}
