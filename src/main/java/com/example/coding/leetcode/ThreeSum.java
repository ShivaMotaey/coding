package com.example.coding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {

//    15. 3Sum
//            Medium
//28.7K
//2.6K
//            Companies
//    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//    Notice that the solution set must not contain duplicate triplets.
//
//
//
//    Example 1:
//
//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]
//    Explanation:
//    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//    The distinct triplets are [-1,0,1] and [-1,-1,2].
//    Notice that the order of the output and the order of the triplets does not matter.
//    Example 2:
//
//    Input: nums = [0,1,1]
//    Output: []
//    Explanation: The only possible triplet does not sum up to 0.
//    Example 3:
//
//    Input: nums = [0,0,0]
//    Output: [[0,0,0]]
//    Explanation: The only possible triplet sums up to 0.

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum1(new int[]{-1, 0, 1,5, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {//complexity is O(n^2)
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values to avoid duplicate triplets.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (sum < target){
                    left++;
                }else {
                    right--;
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum1(int[] nums) {//complexity is O(n^2)
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums); // Sort the array in ascending order.

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values to avoid duplicate triplets.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = nums[i]; // Find two numbers that sum to -nums[i].

            while (left < right) {
                int sum = nums[left] + nums[right];

                if ((sum + target) == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values.
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move the pointers.
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
