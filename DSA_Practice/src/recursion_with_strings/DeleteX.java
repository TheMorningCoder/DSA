//Given a string, compute recursively a new string where all 'x' chars have been removed.

package recursion_with_strings;

public class DeleteX {

	public static void main(String[] args) {
		String str="XX Hxey Mxy nxamex ixsx SaXXumxyaxx";
		System.out.println("Original String: "+str);
		System.out.println("String after change:"+replaceX(str));
	}
	public static String replaceX(String str) {
		if(str.length()==0) {
			return str;
		}
		if(str.charAt(0)=='x'||str.charAt(0)=='X')
			return replaceX(str.substring(1));
		else
		return str.charAt(0)+replaceX(str.substring(1));
	}
}
