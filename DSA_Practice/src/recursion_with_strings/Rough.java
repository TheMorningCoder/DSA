package recursion_with_strings;

public class Rough {

	public static void main(String[] args) {
		System.out.println("aabcd");
		System.out.println(reverseString("aabcd"));	
	}

	public static String reverseString(String str) {
		int start=0;
		int end=str.length()-1;
		String str2="";
		char temp;
		char[] arr=str.toCharArray();
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}

		str2=new String(arr);
		return str2;

	}
}
