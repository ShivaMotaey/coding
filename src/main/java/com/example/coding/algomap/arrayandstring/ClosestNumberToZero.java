package com.example.coding.algomap.arrayandstring;

public class ClosestNumberToZero {

//    2239. Find Closest Number to Zero
//            Easy
//    Topics
//            Companies
//    Hint
//    Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
//
//
//    Example 1:
//
//    Input: nums = [-4,-2,1,4,8]
//    Output: 1
//    Explanation:
//    The distance from -4 to 0 is |-4| = 4.
//    The distance from -2 to 0 is |-2| = 2.
//    The distance from 1 to 0 is |1| = 1.
//    The distance from 4 to 0 is |4| = 4.
//    The distance from 8 to 0 is |8| = 8.
//    Thus, the closest number to 0 in the array is 1.
//    Example 2:
//
//    Input: nums = [2,-1,1]
//    Output: 1
//    Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.

    public static void main(String[] args) {

        ClosestNumberToZero solution = new ClosestNumberToZero();

        int[] nums1 = {-4, -20, 10, 4, 8};
        System.out.println("Closest number to 0 in the first example: " + solution.findClosestNumber(nums1));

        int[] nums2 = {2, -1, 1};
        System.out.println("Closest number to 0 in the second example: " + solution.findClosestNumber(nums2));
    }

    public int findClosestNumber(int[] nums) {
        int closest = nums[0]; // Initialize with the first element

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num; // Found a number closer to 0
            } else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num; // Found a number equally close to 0 but larger
            }
        }

        return closest;
    }

}
