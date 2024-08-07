package com.example.coding.algomap.arrayandstring;

import java.util.Arrays;
import java.util.stream.Collectors;

//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

//        Example 1:
//
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//        Example 2:
//
//        Input: s = "axc", t = "ahbgdc"
//        Output: false
//
//
//        Constraints:
//
//        0 <= s.length <= 100
//        0 <= t.length <= 104
//        s and t consist only of lowercase English letters.


public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    static Boolean isSubsequence(String s, String t){
        String[] arr1 = s.split("");
        String[] arr2 = t.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = Arrays.stream(arr1).collect(Collectors.joining());
        t = Arrays.stream(arr2).collect(Collectors.joining());

        return t.contains(s);
    }
}
