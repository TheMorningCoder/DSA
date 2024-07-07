package stack_collections_questions;
import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		int arr[]= {60,50,40,30,20,10};
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> extra=new Stack<Integer>();
		for(int n:arr)
			stack.push(n);
//		ArrayList<Integer> list = Collections.list(stack.elements());
//		System.out.println(list);
		System.out.println(stack.toString());
		reverseStack(stack,extra);
		System.out.println(stack.toString());
	}
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		 while(!input.isEmpty()) {
			extra.push(input.pop()); 
		 }
		
		Iterator<Integer> iterator=extra.iterator();
		while(iterator.hasNext()) {
			input.push(iterator.next());
		}
		
	}

}
