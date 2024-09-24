package leetcode_questions;
public class GCDOfStrings {
    
    // Function to return the largest string that divides both str1 and str2
    public static String gcdOfStrings(String str1, String str2) {
        // If concatenation of str1 + str2 is not equal to str2 + str1, then no such string exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to calculate GCD of two numbers using the Euclidean algorithm
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Main method for testing
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("The GCD of strings is: " + gcdOfStrings(str1, str2));  // Output: "ABC"
    }
}
