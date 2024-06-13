package others;

public class DynamicArray {
	int data[];
	int nextElementIndex;
	
	public DynamicArray() {
		data=new int[5];
		nextElementIndex=0;
	}
	
	public void add(int ele) {
		if(nextElementIndex==data.length) {
			DoubleCapacity();
		}
		data[nextElementIndex]=ele;
		nextElementIndex++;
	}
	
	public void insert(int element,int index) {
		if(index<0) {
			System.out.println("Invalid Index");
			return;
		}
		if(index==data.length) {
			add(element);
			return;
		}
		data[index]=element;
		
	}
	public void remove() {
		data[nextElementIndex-1]=0;
		nextElementIndex=nextElementIndex-1;
	}
	
	public void DoubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public void sizeOfArray() {
		System.out.println("Size of Array = "+ nextElementIndex);
	}
	
	public void print() {
		for(int i=0;i<nextElementIndex;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
}
