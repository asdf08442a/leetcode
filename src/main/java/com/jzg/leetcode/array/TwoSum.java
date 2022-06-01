package com.jzg.leetcode.array;

/**
 * 两数之和
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 3, 23, 6, 7, 4, 9};
        int target = 11;
        one(nums, target);
    }

    /**
     * 暴力枚举 时间复杂度：O(n2) 空间复杂度：O(1)
     */
    static void one(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }

}
