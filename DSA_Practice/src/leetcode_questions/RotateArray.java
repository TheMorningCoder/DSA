package leetcode_questions;

public class RotateArray {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7};
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println();
		int nums[]=rotateArray(arr,3);
		for(int n:nums)
			System.out.print(n+" ");
		
	}
	public static int[] rotateArray(int nums[],int k) {
		k=k%nums.length;
		
		reverseArray(nums,0,nums.length-1);
		reverseArray(nums,0,k-1);
		reverseArray(nums,k,nums.length-1);
		
		return nums;
	}
	
	public static void reverseArray(int nums[],int start,int end) {
		int temp;
		
		while(start<end) {
			temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}
}
