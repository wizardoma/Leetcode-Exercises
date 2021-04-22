package com.wizardom.Strings.Medium;

/**
 * @author Ibekason Alexander
 */
public class LongestSubStringWithoutRepeatingCharacters {

    // Given a string s, find the length of the longest substring without repeating characters.

    static int findLongestSubstring(String word) {
        StringBuilder longestSubString = new StringBuilder();
        StringBuilder currentLongestSubString = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            String curChar = word.split("")[i];
            if (currentLongestSubString.indexOf(curChar) != -1) {
                if (longestSubString.length() < currentLongestSubString.length()) {
                    longestSubString = new StringBuilder(currentLongestSubString);
                }
                currentLongestSubString = new StringBuilder();
                for (int j = i - 1; j >= 0; j--) {
                    if (!word.split("")[j].equals(curChar)) {
                        currentLongestSubString.append(word.split("")[j]);
                    } else break;

                }

            }
            currentLongestSubString.append(curChar);
        }


        return Math.max(longestSubString.length(), currentLongestSubString.length());


    }

    public static void main(String[] args) {
        System.out.println(findLongestSubstring("abcabcrtb"));
    }
}
