package com.example.coding.leetcode;

public class IntegerBreak {

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        System.out.println(integerBreak.intBreak(2));
        System.out.println(integerBreak.intBreak(10));
        System.out.println(integerBreak.intBreak(30));
    }

    public int intBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(2 * dp[i - 2], 3 * dp[i - 3]);
        }

        return dp[n];
    }

}
