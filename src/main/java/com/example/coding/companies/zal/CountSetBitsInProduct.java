package com.example.coding.companies.zal;


//Write a function that takes positive integers A and B and returns the number bits set to 1 of the binary representation of A*B
public class CountSetBitsInProduct {

    public static int countSetBitsInProduct(int A, int B) {
        // Calculate the product of A and B
        int product = A * B;

        // Initialize a count to keep track of the number of set bits
        int count = 0;

        // Iterate through each bit in the binary representation
        while (product > 0) {
            // Check the least significant bit
            if ((product & 1) == 1) {
                count++;
            }
            // Right-shift to the next bit
            product = product >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int A = 555;
        int B = 13;
        int result = countSetBitsInProduct(A, B);
        System.out.println("Number of set bits in A * B: " + result); // Should print the count
    }


}
