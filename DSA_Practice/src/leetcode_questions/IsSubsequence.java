package leetcode_questions;


public class IsSubsequence {

    public static void main(String args[]) {
    	String mainStr="ababghabcd";
    	String subStr="abc";
    	System.out.println("Main String= "+mainStr +"  substring = "+subStr);
    	System.out.println(subStringFound(mainStr,subStr));
    	String mainStr2="acbabghabd";
    	String subStr2="abc";
    	System.out.println("Main String= "+mainStr2 +"  substring = "+subStr2);
    	System.out.println(subStringFound(mainStr2,subStr2));
    }
    public static boolean subStringFound(String mainString,String subString) {
    	int mi=0,si=0;
    	
    	while(mi<mainString.length()) {
    		if(mainString.charAt(mi)==subString.charAt(si)) {
    			si++;
    			if(si==subString.length())
    				return true;
    		}
    		mi++;
    	}
    	return false;
    }
}
