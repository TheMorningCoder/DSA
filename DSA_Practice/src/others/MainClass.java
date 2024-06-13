package others;

public class MainClass {

	public static void main(String[] args) {
		DynamicArray d=new DynamicArray();
		d.add(18);
		d.add(67);
		d.insert(34, 1);
		d.print();
		d.sizeOfArray();
		System.out.println("Removing last element");
		d.remove();
		System.out.println("Array after removing last element");
		d.print();
		d.sizeOfArray();
	}

}
