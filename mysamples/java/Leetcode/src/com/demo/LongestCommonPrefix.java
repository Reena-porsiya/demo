package com.demo;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Example 1
        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = longestCommonPrefix(strs1);
        System.out.println("Example 1 Output: " + result1); // Output: "fl"

        // Example 2
        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = longestCommonPrefix(strs2);
        System.out.println("Example 2 Output: " + result2); // Output: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        // Check if the array of strings is empty
        if (strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string in the array
        String prefix = strs[0];

        // Iterate through the array of strings starting from the second string
        for (int i = 1; i < strs.length && prefix.length() > 0; i++) {
            // While the current string does not start with the current prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Remove the last character from the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        // Return the final prefix
        return prefix;
    }
}