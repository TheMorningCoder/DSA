package queue_using_array;

public class QueueUsingArray {
	int data[];
	int frontIndex;
	int rearIndex;
	int size;
	
	QueueUsingArray(int capacity){
		data=new int[capacity];
		frontIndex=-1;
		rearIndex=-1;
		size=0;
	}
	 boolean isEmpty() {
		 return size==0;
	 }
	 
	 int size() {
		 return size;
	 }
	 
	 void print() {
		for(int i=frontIndex;i<=rearIndex;i++) {
			System.out.print(data[i]+" ");
		} 
		System.out.println();
	 }
	 
	 void enqueue(int element) {
		 if(isEmpty()) {
			data[size]=element;
			frontIndex=rearIndex=0;
			size++;
		 }else if(size<=data.length){
			 data[size]=element;
			 size++; 
			 rearIndex=size-1;
		 }
	 }
	 int dequeue() {
		 if(!isEmpty()) {
			 int temp=data[frontIndex];
			 frontIndex++;
			 size--;
			 return temp;
		 }
		 else {}
		 return -1;
		 
	 }
	 
	
}
