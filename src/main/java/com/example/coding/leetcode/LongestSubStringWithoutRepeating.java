package com.example.coding.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {



    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxlength = 0;
        Set<Character> charSet = new HashSet<>();

        while (right < n) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
                maxlength = Math.max(maxlength, right - left);
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxlength;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeating ls = new LongestSubStringWithoutRepeating();
        String s1 = "abcadabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(ls.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(ls.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(ls.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
