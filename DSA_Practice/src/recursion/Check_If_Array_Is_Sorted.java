package recursion;
import java.util.Scanner;

public class Check_If_Array_Is_Sorted {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter array");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(checkArrayBetter(arr,0));
	}
	public static boolean checkArray(int a[]) {
		if(a.length==1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int newArray[]=new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			newArray[i-1]=a[i];
		}
		return checkArray(newArray);
	}
	public static boolean checkArrayBetter(int a[],int startIndex) {
		if(a.length-1==startIndex) {
			return true;
		}
		if(a[startIndex]>a[startIndex+1]) {
			return false;
		}
		
		return checkArrayBetter(a,startIndex+1);
	}
}
