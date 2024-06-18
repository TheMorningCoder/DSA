package recursion_assignment;

public class Palindrome {
	 public static void main(String args[]) {
		 System.out.println("racecar is a palindrome?:"+ checkPalindrome("racecar",0,"racecar".length()-1));
		 System.out.println("abcabc is a palindrome?:"+ checkPalindrome("abcabc",0,"abcabc".length()-1));
		 System.out.println("abbba is a palindrome?:"+ checkPalindrome("abbba",0,"abbba".length()-1));
		 
	 }
	 
	 public static boolean checkPalindrome(String str,int startIndex,int endIndex) {
		if(startIndex>=endIndex)
			return true;
		else {
			if(str.charAt(startIndex)==str.charAt(endIndex)) {
				return checkPalindrome(str,++startIndex,--endIndex);
			}
			else {
				return false;
			}
		}
			 
	 }
}
