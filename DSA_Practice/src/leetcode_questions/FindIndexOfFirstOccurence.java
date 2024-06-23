package leetcode_questions;

public class FindIndexOfFirstOccurence {
	public static void main(String args[]) {
		String str1="dadsadbutsaddad";
		String str2="sad";
		System.out.println(strStr(str1,str2));
		String haystack = "leetcode";
		String needle = "leeto";
		System.out.println(strStr(haystack,needle));
	}
	
	public static int strStr(String haystack, String needle) {
        int flag=-1;
        int len=needle.length();
        for(int i=0;i+len<=haystack.length();i++){
            if(haystack.substring(i,i+len).equals(needle)){
                flag=i;
                break;
            }
                
        }
        return flag;
    }
	
}
