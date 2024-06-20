package leetcode_questions;

class Solution {
    public static int majorityElement(int[] nums) {
        int index[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<index.length;j++){
                if(nums[i]==index[j])
                    index[j]++;
                else
                    index[j]=1;
            }
        }
        
        for(int x:nums)
        	System.out.print(x+" ");
        System.out.println();
        for(int x:index)
        	System.out.print(x+" ");
        System.out.println();
        int max = index[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < index.length; i++) {
            // Update the max if the current element is greater
            if (index[i] > nums.length/2) {
                max = nums[i];
            }
        }
        return max;
    }
    
    public static void main(String args[]) {
    	int a[]= {2,3,2};
    	System.out.println(majorityElement(a));
    }
}