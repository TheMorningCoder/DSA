package queue_using_linkedlist;

import linked_list.Node;

public class QueueUsingLinkedList<T> {
	private Node<T>frontNode;
	private Node<T>lastNode;
	private int size;
	
	void enqueue(T element) {
		Node<T> newNode=new Node<T>(element);
		if(size==0) {
			frontNode=lastNode=newNode;
			size++;
		}
		else {
			lastNode.next=newNode;
			lastNode=newNode;
			size++;
		}
	}
	
	T dequeue() {
		if(!isEmpty()) {
			T temp=frontNode.data;
			frontNode=frontNode.next;
			size--;
			return temp;
		}
		else
			return null;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	void print() {
		Node<T>temp=frontNode;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
}
