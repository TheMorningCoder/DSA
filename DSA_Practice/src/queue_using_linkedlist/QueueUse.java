package queue_using_linkedlist;

public class QueueUse {

	public static void main(String[] args) {
		QueueUsingLinkedList<Character> queue=new QueueUsingLinkedList<Character>();
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('c');
		queue.enqueue('d');
		queue.print();
		System.out.println("size= "+queue.size());
		System.out.println("Popped element= "+queue.dequeue());
		queue.print();
		System.out.println("size= "+queue.size());
		System.out.println("Popped element= "+queue.dequeue());
		queue.print();
		System.out.println("size= "+queue.size());
		System.out.println("Popped element= "+queue.dequeue());
		queue.print();
		System.out.println("size= "+queue.size());
		System.out.println("Popped element= "+queue.dequeue());
		queue.print();
		System.out.println("size= "+queue.size());
		System.out.println("Popped element= "+queue.dequeue());
		queue.print();
		System.out.println("size= "+queue.size());
		
		
	}

}
