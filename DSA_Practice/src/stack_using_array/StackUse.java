package stack_using_array;

public class StackUse {
	
	public static void main(String args[]) {
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
	}
}
