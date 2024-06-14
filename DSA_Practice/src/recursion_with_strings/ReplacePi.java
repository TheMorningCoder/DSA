package recursion_with_strings;

public class ReplacePi {

	public static void main(String[] args) {
		String str = "value of pii pp value of pi value of pi ";
		System.out.println(replacePi(str));

	}

	static public String replacePi(String str) {
		if (str.length() <=0) { // becoz we need minimum 2 chars to be present in String to replace pi with 3.14
			return str; 
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			return "3.14" + replacePi(str.substring(2));
		}
		else {
			return str.charAt(0)+replacePi(str.substring(1));
		}

	}
}
