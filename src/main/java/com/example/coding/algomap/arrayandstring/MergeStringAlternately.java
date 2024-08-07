package com.example.coding.algomap.arrayandstring;


//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//        Return the merged string.
//
//
//
//        Example 1:
//
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r
//        Example 2:
//
//        Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
//        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//        word2:    p   q   r   s
//        merged: a p b q   r   s
//        Example 3:
//
//        Input: word1 = "abcd", word2 = "pq"
//        Output: "apbqcd"
//        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//        word1:  a   b   c   d
//        word2:    p   q
//        merged: a p b q c   d
//
//
//        Constraints:
//
//        1 <= word1.length, word2.length <= 100
//        word1 and word2 consist of lowercase English letters.

public class MergeStringAlternately {

    public static void main(String[] args) {
        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        System.out.println(mergeStringAlternately.mergeAlternately("fereydoun", "gholami"));
    }

    public String mergeAlternately(String word1, String word2) {
        int firstWordLen = word1.length();
        int secondWordLen = word2.length();
        int counter = firstWordLen > secondWordLen ? firstWordLen : secondWordLen;
        String result = "";
        for (int i=0; i < counter; i++){
            if (i < firstWordLen)
                result += word1.substring(i, i +1);

            if (i < secondWordLen)
                result += word2.substring( i, i+1);

        }

        return result;
    }
}
