/*
 
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

*/

package leetcode_questions;

import java.util.Arrays;

public class MergeSortArray {
    
    public static void main(String args[]) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        
        // Output the result
        for (int x : nums1)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a copy of the first m elements of nums1
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        
        // Initialize pointers for nums1Copy and nums2
        int p1 = 0;
        int p2 = 0;
        
        // Initialize the pointer for nums1
        int p = 0;
        
        // Compare elements from nums1Copy and nums2 and merge them into nums1
        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] < nums2[p2]) {
                nums1[p++] = nums1Copy[p1++];
            } else {
                nums1[p++] = nums2[p2++];
            }
        }
        
        // If there are remaining elements in nums1Copy
        while (p1 < m) {
            nums1[p++] = nums1Copy[p1++];
        }
        
        // If there are remaining elements in nums2
        while (p2 < n) {
            nums1[p++] = nums2[p2++];
        }
    }
}














//package leetcode_questions;
//
//public class MergeSortArray {
//	
//	public static void main(String args[]) {
//		int nums1[] = {1,2,3,0,0,0};
//		int m = 3;
//		int nums2[] = {2,5,6};
//		int n = 3;
//		merge(nums1,m,nums2,n);
//	}
//	
//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i=0,j=0;
//        for(int x:nums1)
//            System.out.print(x+" ");
//        System.out.println();
//        while(i<nums1.length&&j<nums2.length){
//            if(nums1[i]==0){
//                nums1[i]=nums2[j];
//                i++;
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//        for(int x:nums1)
//            System.out.print(x+" ");
//        System.out.println();
//        recursiveMerge(nums1);
//        for(int x:nums1)
//            System.out.print(x+" ");
//        System.out.println();
//    }
//	public static void recursiveMerge(int arr[]) {
//		if(arr.length<=1)
//			return;
//		
//		int sub1[]=new int[arr.length/2];
//		int sub2[]=new int[arr.length-sub1.length];
//		
//		for(int i=0;i<arr.length/2;i++)
//			sub1[i]=arr[i];
//		for(int i=arr.length/2;i<arr.length;i++)
//			sub1[i-arr.length/2]=arr[i];
//		
//		recursiveMerge(sub1);
//		recursiveMerge(sub2);
//		mergeArrays(arr,sub1,sub2);
//	}
//	public static void mergeArrays(int arr[],int sub1[],int sub2[]) {
//		int i=0,j=0,k=0;
//		for(int x:sub1)
//            System.out.print(x+" ");
//        System.out.println();
//        for(int x:sub2)
//            System.out.print(x+" ");
//        System.out.println();
//		while(i<sub1.length&&j<sub2.length) {
//			if(sub1[i]<sub2[j]) {
//				arr[k]=sub1[i];
//				i++;
//				k++;
//			}else {
//				arr[k]=sub2[j];
//				j++;
//				k++;
//			}
//		}
//		
//		if(i<sub1.length) {
//			while(i<sub1.length) {
//				arr[k]=sub1[i];
//				i++;
//				k++;
//			}
//		}
//		if(j<sub2.length) {
//			while(j<sub2.length) {
//				arr[k]=sub2[j];
//				j++;
//				k++;
//			}
//		}
//			
//			
//			
//			
//			
//	}
//	
//}
