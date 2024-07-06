package stack_collections_questions;
import java.util.Stack;

public class BalanceParanthesis {
	public static void main(String args[]) {
		boolean result=areBracketsBalanced("[{(a+b)}]");
		if(result)
			System.out.println("Brackets are balanced");
		else
			System.out.println("Brackets are not balanced");
	}

	public static boolean areBracketsBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[') {
				stack.push(str.charAt(i));
			}
			if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']'){
				if(stack.isEmpty()||!isMatchingBracket(stack.pop(),str.charAt(i)))
					return false;
			}
		}
		return stack.isEmpty();
	}

	private static boolean isMatchingBracket(char openingBracket,char closingBracket) {
		if(openingBracket=='('&&closingBracket==')')
			return true;
		if(openingBracket=='{'&&closingBracket=='}')
			return true;
		if(openingBracket=='['&&closingBracket==']')
			return true;
		return false;
	}
}
