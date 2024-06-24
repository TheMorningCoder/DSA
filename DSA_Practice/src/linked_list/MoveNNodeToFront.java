package linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Node<T> {
    T data;
    Node<T> next;
    
    public Node(T data) {
        this.data = data;
    }
}

public class MoveNNodeToFront {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		int i,len=1,pos;
		Node<Integer>temp1=head;
		Node<Integer>temp2=head;
		Node<Integer>newHead;
		if(head==null||n==0) {
			return null;
		}
		else {
			while(temp1.next!=null) {
				len++;
				temp1=temp1.next;
			}
			temp1.next=head;
			if(n==len) {
				return head;
			}
			pos=len-n;
			for(i=1;i<pos;i++) {
				temp2=temp2.next;
			}
			newHead=temp2.next;
			temp2.next=null;
		}
		return newHead;
	}
    
    public static void print(Node<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    public static void printReverse(Node<Integer> root) {
    	int len=0,i;
		 ArrayList<Integer> arr=new ArrayList<>();
		 Node<Integer> temp=root;
		if(root==null)
			return;
		else {
			while(temp!=null){
				 arr.add(temp.data);
				 len++;
				 temp=temp.next;
			 }
			 for(i=len-1;i>=0;i--){
				 System.out.print(arr.get(i)+" ");
			 }
		}

	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	Node<Integer> head = new Node<>(10);
        head.next = new Node<>(6);
        head.next.next = new Node<>(77);
        head.next.next.next = new Node<>(90);
        head.next.next.next.next = new Node<>(61);
        head.next.next.next.next.next = new Node<>(67);
        head.next.next.next.next.next.next = new Node<>(100);
        print(head);
        printReverse(head);

        
    }
}