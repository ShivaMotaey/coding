package com.example.coding.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianSortedArrays {

//    4. Median of Two Sorted Arrays
//            Hard
//26.4K
//2.9K
//            Companies
//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//    The overall run time complexity should be O(log (m+n)).
//
//
//
//    Example 1:
//
//    Input: nums1 = [1,3], nums2 = [2]
//    Output: 2.00000
//    Explanation: merged array = [1,2,3] and median is 2.
//    Example 2:
//
//    Input: nums1 = [1,2], nums2 = [3,4]
//    Output: 2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//
//    Constraints:
//
//    nums1.length == m
//    nums2.length == n
//0 <= m <= 1000
//            0 <= n <= 1000
//            1 <= m + n <= 2000
//            -106 <= nums1[i], nums2[i] <= 106


    public static void main(String[] args) {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};
        System.out.println(medianSortedArrays.findMedianSortedArrays(nums1, nums2));
        nums1 = new int[] {1,2};
        nums2 = new int[] {3,4};
        System.out.println(medianSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int[] mergedArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);

        Arrays.sort(mergedArr);

        if (mergedArr.length % 2 == 0)
            return Double.valueOf(mergedArr[(mergedArr.length / 2) - 1] + mergedArr[mergedArr.length / 2]) / 2;
        else
            return mergedArr[mergedArr.length / 2];
    }
}
