package com.example.coding.leetcode;


//https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.myIsPalindrome(121));
        System.out.println(palindromeNumber.myIsPalindrome(-121));
        System.out.println(palindromeNumber.myIsPalindrome(10));

    }

    public boolean myIsPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if(sb.toString().equals(sb.reverse().toString()))
            return true;
        return false;
    }

    public boolean isPalindrome(int x) {
        StringBuilder test = new StringBuilder();

        StringBuilder s = new StringBuilder(String.valueOf(x));

        for (int i = s.length() -1 ; i >= 0 ; i--){
            test.append(s.substring(i , i+1));
        }


        return test.toString().equals(s.toString());
    }
}
