package com.example.coding.algomap.arrayandstring;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        // Test cases
        String s1 = "III";
        System.out.println(romanToInt(s1)); // Output: 3

        String s2 = "LVIII";
        System.out.println(romanToInt(s2)); // Output: 58

        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s3)); // Output: 1994
    }

    public static int romanToInt(String s) {
        // Define a map to store the Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Initialize the integer result
        int result = 0;

        // Iterate over the characters in the string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral character
            int current = romanMap.get(s.charAt(i));

            // Check if the next character exists and if it represents a larger value
            if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > current) {
                // If so, subtract the current value from the result
                result -= current;
            } else {
                // Otherwise, add the current value to the result
                result += current;
            }
        }

        return result;
    }
}
