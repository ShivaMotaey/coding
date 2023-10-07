package com.example.coding.leetcode;


//https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {


//    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//    Example 1:
//
//    Input: x = 123
//    Output: 321
//    Example 2:
//
//    Input: x = -123
//    Output: -321
//    Example 3:
//
//    Input: x = 120
//    Output: 21
//
//
//    Constraints:
//
//    -231 <= x <= 231 - 1


    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(123));
        System.out.println(ri.reverse(-123));
        System.out.println(ri.reverse(120));
        System.out.println(ri.reverse(1234567891));
    }

    public int myReverse(int x) {
        StringBuilder sb = new StringBuilder(x < 0 ? String.valueOf(Math.abs(x)) : String.valueOf(x));
        sb = sb.reverse();
        if (x < 0) {
            sb.insert(0, "-");
        }

        int result = 0;
        try {
            result = Integer.valueOf(sb.toString());
        } catch (Exception e) {
        } finally {
            return result;
        }
    }

    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow
            }

            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Underflow
            }

            reversed = reversed * 10 + pop;
            x /= 10;
        }

        return reversed;
    }
}
