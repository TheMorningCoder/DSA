package stack_using_linked_list;

import stack_using_array.StackEmptyException;

public class StackUse {
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<Integer>();
		int arr[]= {10,20,30,40,50,60};
		for(int i:arr)
			stack.push(i);
		stack.print();
		System.out.println("Popped element= "+stack.pop());
		stack.print();
		System.out.println("Top element= "+stack.top());
	}
}
