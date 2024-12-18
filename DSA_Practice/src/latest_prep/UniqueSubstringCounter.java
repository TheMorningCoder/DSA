package latest_prep;

import java.util.HashSet;

public class UniqueSubstringCounter {

    public static int findSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (seen.contains(c)) {
                    break; // Stop adding substrings if a character is repeated
                }
                seen.add(c);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abac";
        System.out.println("Number of substrings with no repeating characters: " + findSubstrings(s));
    }
}
