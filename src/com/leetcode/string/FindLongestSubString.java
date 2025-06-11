package com.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubString {
    public static void main(String[] args) {
        // Sample input = "abcabcbb", "bbbb"
        String input = "pwwkew";
        System.out.println(findLongestSubstring(input));
    }

    private static int findLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int maxLength = 0;
        String longestSubstring = "";
        for (int right = 0; right < s.length(); right++) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }

        }

        return maxLength;

    }
}
