package latest_prep;

import java.util.HashMap;

public class UniqueSubstrings {
    public static int findSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Sliding window pointers
        int start = 0;

        // HashMap to store the last seen position of characters
        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // If character is already in the window, update the start pointer
            if (lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= start) {
                start = lastSeen.get(currentChar) + 1;
            }

            // Update the last seen position of the current character
            lastSeen.put(currentChar, end);

            // Calculate the number of unique substrings ending at 'end'
            count += (end - start + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abac";
        int result = findSubstrings(s);
        System.out.println("Number of substrings with no repeating characters: " + result);
    }
}


