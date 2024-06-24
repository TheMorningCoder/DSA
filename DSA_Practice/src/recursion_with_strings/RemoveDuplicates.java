/*Given a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz*/

package recursion_with_strings;

public class RemoveDuplicates {
	public static void main(String args[]) {
		String str="xxxyyyzwwzzz";
		System.out.println(str);
		System.out.println(removeDupe(str));
	}
	public static String removeDupe(String str) {
		// becoz we need minimum 2 chars to be present in String to remove duplicates
		if(str.length()<2) {
			return str;
		}
		else {
			if(str.charAt(0)==str.charAt(1)) {
				return removeDupe(str.substring(1));
			}
			else {
				return str.charAt(0)+removeDupe(str.substring(1));
			}
			
 		}
	}
}
