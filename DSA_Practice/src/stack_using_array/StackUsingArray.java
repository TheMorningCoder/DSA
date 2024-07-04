package stack_using_array;

public class StackUsingArray {
	int data[];
	int topIndex;
	
	StackUsingArray(){
		data=new int[10];
		topIndex=-1;
	}
	
	void push(int element) {
		if(topIndex<data.length) {
			data[++topIndex]=element;
		}
	}
	
	int pop() {
	if(topIndex==-1)
		return -1;
	int temp=data[topIndex];
	--topIndex;
	return temp;
	}
	
	int size() {
		return topIndex+1;
	}
	int top() {
		return data[topIndex];
	}
	void print() {
		for(int i=topIndex;i>=0;i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
