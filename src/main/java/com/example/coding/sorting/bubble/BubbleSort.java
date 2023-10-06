package com.example.coding.sorting.bubble;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void bubbleSort2(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr); //O(n^2)
//        bubbleSort2(arr);
        System.out.println("Bubble Sort Result:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
