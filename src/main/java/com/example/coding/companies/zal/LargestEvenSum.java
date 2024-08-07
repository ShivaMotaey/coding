package com.example.coding.companies.zal;

import java.util.Arrays;

//Write a function that takes array A of N positive integers and positive integer K, returns the largest even sum of K elements or -1 if there are no such K elements.
public class LargestEvenSum {

    public static int largestEvenSum(int[] A, int K) {
        // Sort the array in non-decreasing order
        Arrays.sort(A);

        int sum = 0;
        int count = 0;

        // Start from the end of the sorted array
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] % 2 == 0) {
                sum += A[i];
                count++;
            }

            if (count == K) {
                return sum;
            }
        }

        // If there are not enough even numbers, return -1
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {2, 4, 7, 8, 10, 11};
        int k = 3;
        int result = largestEvenSum(a, k);
        System.out.println("Largest even sum of " + k + " elements: " + result);
    }
}
