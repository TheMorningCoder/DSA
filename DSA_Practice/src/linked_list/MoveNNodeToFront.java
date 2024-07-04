package linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MoveNNodeToFront {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		int i, len = 1, pos;
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = head;
		Node<Integer> newHead;
		if (head == null || n == 0) {
			return null;
		} else {
			while (temp1.next != null) {
				len++;
				temp1 = temp1.next;
			}
			temp1.next = head;
			if (n == len) {
				return head;
			}
			pos = len - n;
			for (i = 1; i < pos; i++) {
				temp2 = temp2.next;
			}
			newHead = temp2.next;
			temp2.next = null;
		}
		return newHead;
	}

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void printReverse(Node<Integer> root) {
		int len = 0, i;
		ArrayList<Integer> arr = new ArrayList<>();
		Node<Integer> temp = root;
		if (root == null)
			return;
		else {
			while (temp != null) {
				arr.add(temp.data);
				++len;
				temp = temp.next;
			}
			for (i = len - 1; i >= 0; i--) {
				System.out.print(arr.get(i) + " ");
			}
		}

	}

	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
		Node<Integer> temp = head;
		Node<Integer> node = new Node<Integer>(data);
		int len = 0;

		if (head == null)
			return head;

		if (pos == 0) {
			node.next = head;
			return node;
		}

		while (temp != null) {
			if (len == pos - 1) {
				node.next = temp.next;
				temp.next = node;
			}
			temp = temp.next;
			len++;
		}
		if (pos > len) {
			temp = node;
		}

		return head;

	}

	public static Node<Integer> insertRec(Node<Integer> head, int pos, int data) {
		Node<Integer> node = new Node<Integer>(data);
		if (pos == 0) {
			node.next = head;
			head = node;
			return head;
		}
		if (head == null)
			return head;
		else {
			head.next = insertRec(head.next, pos - 1, data);
			return head;
		}

	}

	public static Node<Integer> deleteRec(Node<Integer> head, int pos) {
		Node<Integer> temp = head;
		int len = 0;
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		if (pos == 0) {
			head = head.next;
			return head;
		}
		else if(pos<len){
			head.next=deleteRec(head.next,pos-1);
			return head;
		}
		else {
			return head;
		}
	}
	public static Node<Integer> mergeTwoSortedArrays(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer>dummy=new Node<Integer>(0);
		Node<Integer>temp=dummy;
		
		while(head1!=null&&head2!=null) {
			if(head1.data<head2.data) {
				
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}else {
				
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
			
		}
		while(head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		
		return dummy.next;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		Node<Integer> sortedList;
		
		Node<Integer> head = new Node<>(1);
		head.next = new Node<>(6);
		head.next.next = new Node<>(7);
		head.next.next.next = new Node<>(9);
		head.next.next.next.next = new Node<>(16);
		head.next.next.next.next.next = new Node<>(17);
		head.next.next.next.next.next.next = new Node<>(100);
		
		Node<Integer> head2 = new Node<>(1);
		head2.next = new Node<>(2);
		head2.next.next = new Node<>(3);
		head2.next.next.next = new Node<>(4);
		
		
		print(head);
		print(head2);
		sortedList=mergeTwoSortedArrays(head,head2);
		print(sortedList);

	}
}