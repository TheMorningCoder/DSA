package linked_list;

import java.io.IOException;

public class MergeSort_LinkedList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Node<Integer> sortedList;

		Node<Integer> head = new Node<>(1);
		head.next = new Node<>(16);
		head.next.next = new Node<>(75);
		head.next.next.next = new Node<>(9);
		head.next.next.next.next = new Node<>(1);
		head.next.next.next.next.next = new Node<>(3);
		head.next.next.next.next.next.next = new Node<>(1);
		print(head);
		sortedList = mergeSort(head);
		print(sortedList);

	}

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static Node<Integer> mergeSort(Node<Integer> head) {
		Node<Integer> middle, nextOfMiddle, left, right, sortedList;
		if (head == null || head.next == null)
			return head;

		middle = getMiddle(head);
		nextOfMiddle = middle.next;
		middle.next = null;

		left = mergeSort(head);
		right = mergeSort(nextOfMiddle);

		return merge(left, right);
	}

	public static Node<Integer> getMiddle(Node<Integer> head) {
		if (head == null)
			return head;
		Node<Integer> fast, slow;
		fast = head.next;
		slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {

		Node<Integer> sortedList = new Node<Integer>(0);
		Node<Integer> temp = sortedList;

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;

			} else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		while (head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		while (head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}

		return sortedList.next;
	}

}
