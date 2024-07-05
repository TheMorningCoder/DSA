package stack_using_linked_list;

import linked_list.Node;
import stack_using_array.StackEmptyException;

public class StackUsingLinkedList<T> {
	Node<T> head;
	int size=0;
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;	
	}
	public void push(T element) {
		Node<T> node=new Node<T>(element);
		if(isEmpty()) {
			head=node;
			size++;
		}
		else {
			node.next=head;
			head=node;
			size++;
		}
	}
	
	public  T pop() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		else {
			Node<T> temp=head;
			head=head.next;
			size--;
			return temp.data;
		}
		
	}
	public  T top() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException();
		}else {
			return head.data;
		} 
	}
	
	public void print() {
		Node<T> temp=head;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
}
