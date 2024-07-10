package stack_collections_questions;

import java.util.Stack;

public class BracketsAreRedundantOrNot { 
	public static void main(String[] args) {
		System.out.println(checkRedundantBrackets("((a+b))"));

	}
	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> stack=new Stack<Character>();
		for(char ch:expression.toCharArray()) {
			System.out.println("ch= "+ch);
		if(ch!=')'){
				stack.push(ch);
			}
		else{
			// condition when ch==')'
				char top=stack.pop();
				boolean flag=true;
				while(top!='(') {
					if(top=='+'||top=='-'||top=='*'||top=='/')
						flag=false;
					top=stack.pop();
				}
				System.out.println("Flag= "+flag);
				if (flag) {
                    return true;
                }
			}
		}	
		return false;
	}

}
