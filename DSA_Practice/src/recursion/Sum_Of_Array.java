package recursion;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter array");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(sumOfArray(arr,0));
	}
	public static int sumOfArray(int arr[],int startIndex) {
		if(startIndex==arr.length) {
			return 0;
		}
		return arr[startIndex]+sumOfArray(arr,startIndex+1);
	}

}