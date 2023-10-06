package com.example.coding.searching.Jump;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (arr[prev] < target) {
            prev++;

            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr[prev] == target) {
            return prev; // Return the index of the target element
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int target = 25;
        int result = jumpSearch(arr, target);//O(sqrt(n))
        if (result != -1) {
            System.out.println("Jump Search Result: Element found at index " + result);
        } else {
            System.out.println("Jump Search Result: Element not found");
        }
    }
}
