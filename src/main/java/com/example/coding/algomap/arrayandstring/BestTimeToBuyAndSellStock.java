package com.example.coding.algomap.arrayandstring;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//        Constraints:
//
//        1 <= prices.length <= 105
//        0 <= prices[i] <= 104

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1)); // Output: 5
        System.out.println(maxProfit_Gpt(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2)); // Output: 0
        System.out.println(maxProfit_Gpt(prices2)); // Output: 0
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = prices.length - 1; i>=0; i--){
            for(int j=i-1; j>=0; j-- ){
                if(prices[i] > prices[j] && (prices[i] - prices[j]) > maxProfit)
                    maxProfit = prices[i] - prices[j];
            }
        }
        return maxProfit;
    }

    static int maxProfit_Gpt(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Calculate the profit and update the max profit
            }
        }

        return maxProfit;
    }
}
