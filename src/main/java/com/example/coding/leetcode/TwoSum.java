package com.example.coding.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/

public class TwoSum {

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//
//
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
//
//
//    Constraints:
//
//            2 <= nums.length <= 104
//            -109 <= nums[i] <= 109
//            -109 <= target <= 109
//    Only one valid answer exists.
//        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store values and their indices
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the hashmap
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            // If not found, add the current number and its index to the hashmap
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two elements add up to the target");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");
    }

    public static void main1(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[] {2,7,11,15, 50,35, 2 ,60 ,13,60};
        int target = 28;
        nums = twoSum.calc1(nums, target);
        Arrays.stream(nums).forEach(i-> System.out.println(i));
    }
    public int[] calc1(int[] nums, int target) {
        for(int i =0; i< nums.length ; i++){
            for(int j = i + 1; j< nums.length ; j++){
                if((nums[i] + nums[j]) == target)
                    return new int[] {i,j};

            }
        }
        return new int[0];
    }
}
