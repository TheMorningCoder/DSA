package leetcode_questions;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		int arr[]= {1,1,1,2,2,3,4,4,4,4,4};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<removeDuplicates(arr);i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int removeDuplicates(int arr[]) {
		int writeIndex=1,count=1,i;
		for(i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				count=1;
			}
			if(count<=2) {
				arr[writeIndex]=arr[i];
				writeIndex++;
			}
		}
		
		return writeIndex;
	}

}
