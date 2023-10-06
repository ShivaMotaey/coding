package com.example.coding.searching.Linear;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int target = 25;
        int result = linearSearch(arr, target);//O(n)
        if (result != -1) {
            System.out.println("Linear Search Result: Element found at index " + result);
        } else {
            System.out.println("Linear Search Result: Element not found");
        }
    }
}
