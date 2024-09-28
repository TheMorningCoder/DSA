package leetcode_questions;

/*
You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/

public class FlowerbedSolution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // To count the number of flowers we can plant
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and the adjacent plots are also empty or at boundaries
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower here
                count++; // Increment the count of planted flowers
                
                if (count >= n) { // If we have planted enough flowers
                    return true;
                }
            }
        }
        
        return count >= n; // Check if we could plant 'n' flowers
    }

    public static void main(String[] args) {
        FlowerbedSolution solution = new FlowerbedSolution();
        
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1)); // Output: true
        
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}

