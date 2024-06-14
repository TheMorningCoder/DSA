package recursion_with_strings;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		int arr[]= {12,12,34,45,56,78,89,90};
		System.out.println(arr);
		int ele=89;
		int index=binarySearch(arr,0,arr.length-1,ele);
		System.out.println(index);
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
