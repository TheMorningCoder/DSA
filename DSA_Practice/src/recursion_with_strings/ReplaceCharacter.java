package recursion_with_strings;

public class ReplaceCharacter {

		public static void main(String args[]) {
			String str="Pooja's Dollhouse";
			System.out.println(replaceChar(str,'o','*'));
		}
		static public String replaceChar(String s,char ch1,char ch2) {
			if(s.length()==0) {
				return s;
			}
			if(s.charAt(0)==ch1)
				return ch2+replaceChar(s.substring(1),ch1,ch2);
			else
				return s.charAt(0)+replaceChar(s.substring(1),ch1,ch2);
		}
}
