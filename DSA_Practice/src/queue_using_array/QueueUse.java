package queue_using_array;

public class QueueUse {
	public static void main(String args[]) {
		QueueUsingArray queue=new QueueUsingArray(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.print();
		System.out.println("FrontIndex= "+queue.frontIndex);
		System.out.println("RearIndex= "+queue.rearIndex);
		System.out.println("Size= "+queue.size);
		System.out.println(queue.dequeue());
		queue.print();
		System.out.println("Size= "+queue.size);
	}
	
}
