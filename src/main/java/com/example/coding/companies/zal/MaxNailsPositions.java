package com.example.coding.companies.zal;


//Fix the implementation of a function that takes an array A of N integers representing the lengths of nails
// on a wooden board in non-decreasing order where integer K returns the maximal number of nails
// that can be positioned at matching length after hammering down at most K nails
public class MaxNailsPositions {

    public static int maxNailsPositions(int[] A, int K) {
        int left = 1;
        int right = A[A.length - 1];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int gaps = 0;
            int nails = 1;
            int prevNail = A[0];

            for (int i = 1; i < A.length; i++) {
                if (A[i] - prevNail >= mid) {
                    nails++;
                    prevNail = A[i];
                } else {
                    gaps += A[i] - prevNail;
                }
            }

            if (nails > K) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left - 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 7, 8};
        int K = 2;
        int result = maxNailsPositions(A, K);
        System.out.println("Maximal number of nails that can be positioned: " + result);
    }

}
