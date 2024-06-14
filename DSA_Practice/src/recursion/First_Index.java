package recursion;

public class First_Index {

	public static void main(String[] args) {
		int a[]= {12,23,34,56};
		int e=34;
		System.out.println(firstIndex(a,0,e));
		int b[]= {1,3,4,5};
		int f=3;
		System.out.println(firstIndex(b,0,f));
		int c[]= {11,3,40,5};
		int g=30;
		System.out.println(firstIndex(c,0,g));
	}
	static public int firstIndex(int arr[], int startIndex,int element) {
		if(startIndex==arr.length) {
			return -1;
		}
		if(arr[startIndex]==element) {
			return startIndex;
		}
		
		return firstIndex(arr,startIndex+1,element);
	}

}
