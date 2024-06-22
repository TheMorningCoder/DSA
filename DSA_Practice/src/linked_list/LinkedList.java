package linked_list;

public class LinkedList {
	private Node head;
	
	void append(int data) {
		if(head==null) {
			head=new Node(data);
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
	}
	
	void display() {
		if(head==null) {
			System.out.println("List is empty");		
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
			System.out.println();
		}
	}
}
