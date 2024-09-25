package leetcode_questions;
/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example:
Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation: The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".*/

import java.util.*;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        // Convert the string into a character array
        char[] chars = s.toCharArray();
        // Create a set of vowels (both upper and lower case)
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        // Two pointers to track positions from the start and end
        int left = 0, right = s.length() - 1;
        
        // Loop until the two pointers meet
        while (left < right) {
            // Move the left pointer forward if it's not a vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            // Move the right pointer backward if it's not a vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }
            
            // Swap the vowels at the left and right pointers
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                // Move the pointers
                left++;
                right--;
            }
        }
        // Convert the character array back to a string and return
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(reverseVowels(input)); // Output: "holle werld"
    }
}
