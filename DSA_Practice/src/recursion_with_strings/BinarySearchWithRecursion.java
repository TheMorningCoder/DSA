package recursion_with_strings;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,20,30,40,45,67};
		System.out.println(binarySearch(arr,0,arr.length-1,40));
		System.out.println(binarySearch(arr,0,arr.length-1,4));
		System.out.println(binarySearch(arr,0,arr.length-1,1));
	}
	
	public static int binarySearch(int arr[],int startIndex,int endIndex,int element){
		if(arr.length==0) {
			return -1;
		}
		if(startIndex>endIndex) {
			return -1;
		}
		
		
		int midIndex=(startIndex+endIndex)/2;
		if(element==arr[midIndex]) {
			return midIndex;
		}
		else {
			if(element>arr[midIndex]) {
				startIndex=midIndex+1;
				return binarySearch(arr,startIndex,endIndex,element);
			}
			else{
				endIndex=midIndex-1;
				return binarySearch(arr,startIndex,endIndex,element);
			}
		}
	}

}
