package leetcode_questions;

public class LengthOfLastWord {
	public static void main(String args[]) {
		String str1="   fly me   to   the moon  ";
		String str2="luffy is still joyboy";
		System.out.println(lengthOfLastWord(str1));
		System.out.println(lengthOfLastWord(str2));
	}
	
	public static int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        int len=arr.length;
        return arr[len-1].length();
    } 
}
