package linked_list;

public class DoublyLinkedList {
	private DLLNode node;
	private DLLNode head;
	private DLLNode tail;
	private int len=0;
	
	void append(int data) {
		node=new DLLNode(data);
		if(head==null) {
			head=tail=node;
			len=1;
		}
			
		else {
			DLLNode temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			tail=temp.next=node;
			len++;
		}
	}
	void insertAtPosition(int data,int position) {
		node=new DLLNode(data);
		DLLNode temp=head;
		for(int i=1;i<position-1;i++) {
			System.out.println("i= "+i+" temp.data= "+temp.data);
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		
	}
	
	
	void displayList() {
		if(head==null)
			System.out.println("Empty list");
		else {
			DLLNode temp=head;
					while(temp!=null) {
						System.out.print(temp.data+" ");
						temp=temp.next;
					}
					System.out.println();
		}
	}
	
	
	
	
}




 class DLLNode {
	 int data;
	 DLLNode next;
	 DLLNode prev;
	 DLLNode(int data){
		 this.data=data;
	 }
}
