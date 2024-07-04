package stack_using_array;

public class StackUsingArray {
	int data[];
	int topIndex;
	
	StackUsingArray(){
		data=new int[10];
		topIndex=-1;
	}
	StackUsingArray(int size){
		data=new int[size];
		topIndex=-1;
	}
	
	void push(int element) throws StackFullException {
		if(topIndex==data.length-1) {
			throw new StackFullException();
		}
		if(topIndex<data.length) {
			data[++topIndex]=element;
		}
	}
	
	int pop() throws StackEmptyException {
		if(isEmpty())
			throw new StackEmptyException();
		int temp=data[topIndex];
		--topIndex;
		return temp;
	}
	
	int size() {
		return topIndex+1;
	}
	
	boolean isEmpty() {
		return topIndex==-1;
	}
	
	int top() throws StackEmptyException {
		if(isEmpty())
			throw new StackEmptyException();
		
		return data[topIndex];
	}
	
	
	void print() throws StackEmptyException {
		if(isEmpty())
			throw new StackEmptyException();
		if(!isEmpty()) {
			for(int i=topIndex;i>=0;i--) {
				System.out.print(data[i]+" ");
			}
			System.out.println();
		}
		
	}
}
