package recursion_with_strings;

public class Practice {

	public static void main(String[] args) {
		String str="xxxyyyzwwzzz";
		System.out.println(str);
		System.out.println(removeDupe(str));

	}
	public static String removeDupe(String s) {
		if(s.length()<2) {
			return s;
		}
		else {
			if(s.charAt(0)==s.charAt(1)) {
				return removeDupe(s.substring(1));
			}else {
				return s.charAt(0)+removeDupe(s.substring(1));
			}
		}
	}

}
