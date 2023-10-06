package com.example.coding.searching.Binary;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int target = 25;
        int result = binarySearch(arr, target);//O(log n)
        if (result != -1) {
            System.out.println("Binary Search Result: Element found at index " + result);
        } else {
            System.out.println("Binary Search Result: Element not found");
        }
    }
}
