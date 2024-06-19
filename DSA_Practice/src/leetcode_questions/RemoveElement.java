package leetcode_questions;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        // Pointer for the next position to place an element not equal to val
        int k = 0;

        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, place it at the next position
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i<k)
         	   System.out.print(nums[i]+" ");
            else
         	   System.out.print("_ ");
         }
       return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
         removeElement(nums1, val1);
        
    }
}
