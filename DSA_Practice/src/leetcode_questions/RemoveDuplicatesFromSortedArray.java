/*
 Given an integer array nums sorted in non-decreasing order, 
 remove the duplicates in-place such that each unique element appears only once. 
 The relative order of the elements should be kept the same. 
 Then return the number of unique elements in nums.
 
 Example 1:
 Input: nums = [1,1,2]
 Output: 2, nums = [1,2,_]
 Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 It does not matter what you leave beyond the returned k (hence they are underscores).
 
*/

package leetcode_questions;


public class RemoveDuplicatesFromSortedArray {
    public static void main(String args[]) {
    	int arr[]= {1,2,2,3,4,5,5,6,7,8,9};
    	for(int i:arr)
    		System.out.print(i+" ");
    	System.out.println();
    	removeDupes(arr);
    	for(int i:arr)
    		System.out.print(i+" ");
    	System.out.println();
    }
    public static int removeDupes(int arr[]) {
    	int uniqueNumber=1;
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]!=arr[i-1]) {
    			arr[uniqueNumber]=arr[i];
    			uniqueNumber++;
    		}
    			
    	}
    		
    	return uniqueNumber;
    }
}

