package com.example.coding.companies.zal;

//Palindrome integer without string, or additional memory?
public class PalindromeInteger {


    public static boolean isPalindrome(int x) {
        // Check for negative numbers (they can't be palindromes)
        if (x < 0) {
            return false;
        }

        // Reverse the integer
        int reversed = 0;
        int original = x;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Compare the reversed integer with the original
        return original == reversed;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(isPalindrome(num1)); // Should return true
        System.out.println(isPalindrome(num2)); // Should return false
        System.out.println(isPalindrome(num3)); // Should return false
    }
}
