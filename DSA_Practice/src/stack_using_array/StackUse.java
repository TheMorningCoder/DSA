package stack_using_array;

public class StackUse {
	
	public static void main(String args[]) throws StackFullException, StackEmptyException {
		StackUsingArray stack=new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.print();
		System.out.println("Stack size= "+stack.size());
		System.out.println("Top element= "+stack.top());
		System.out.println("Popped element= "+stack.pop());
		System.out.println("Stack size= "+stack.size());
		System.out.println("Top element= "+stack.top());
		stack.print();
		System.out.println("Second Stack:");
		StackUsingArray stack2=new StackUsingArray(5);
		int arr[]= {1,2,3,4,5};
		for(int i:arr) {
			stack2.push(i);
		}
		stack2.print();
	}
}
