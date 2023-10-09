package com.example.coding.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationOfWords {

    public static void main(String[] args) {
        PermutationOfWords permutationOfWords = new PermutationOfWords();
        permutationOfWords.findSubstringRecursive("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
    }

    public void findSubstringRecursive(String s, String[] words) {
        List<String> results = new ArrayList<>();
        findPermutations(words, 0, results);
        System.out.println(results.stream().map(i -> String.valueOf(s.indexOf(i))).filter(i -> Integer.valueOf(i) > -1).collect(Collectors.joining(",")));
    }

    void findPermutations(String[] words, int index, List<String> results) {
        if (index == words.length - 1) {
            results.add(Arrays.stream(words).collect(Collectors.joining("")));
        }

        for (int i = index; i < words.length; i++) {
            swap(words, index, i);
            findPermutations(words, index + 1, results);
            swap(words, index, i);
        }

    }

    void swap(String[] words, int index, int i) {
        String temp = words[index];
        words[index] = words[i];
        words[i] = temp;
    }


    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalWordsLength = wordLength * words.length;
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalWordsLength; i++) {
            String sub = s.substring(i, i + totalWordsLength);
            Map<String, Integer> tempCounts = new HashMap<>();
            int j = 0;

            while (j < totalWordsLength) {
                String word = sub.substring(j, j + wordLength);

                if (!wordCounts.containsKey(word)) {
                    break;
                }

                tempCounts.put(word, tempCounts.getOrDefault(word, 0) + 1);
                if (tempCounts.get(word) > wordCounts.getOrDefault(word, 0)) {
                    break;
                }

                j += wordLength;
            }

            if (j == totalWordsLength) {
                result.add(i);
            }
        }

        return result;
    }
}
