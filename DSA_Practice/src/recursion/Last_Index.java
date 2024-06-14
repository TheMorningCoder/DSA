package recursion;

public class Last_Index {

	public static void main(String[] args) {
		int a[]= {12,23,34,56,34,34,34,34,56,34};
		int e=34;
		System.out.println(lastIndex(a,a.length-1,e));
		int b[]= {1,3,4,5,3,3,4,3,3};
		int f=3;
		System.out.println(lastIndex(b,b.length-1,f));
		int c[]= {11,3,40,5};
		int g=30;
		System.out.println(lastIndex(c,c.length-1,g));
	}
	static public int lastIndex(int arr[], int lastElementIndex,int element) {
		if(lastElementIndex==-1) {
			return -1;
		}
		if(arr[lastElementIndex]==element) {
			return lastElementIndex;
		}
		
		return lastIndex(arr,--lastElementIndex,element);
	}

}
