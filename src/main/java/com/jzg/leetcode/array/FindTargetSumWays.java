package com.jzg.leetcode.array;

/**
 * 目标和
 */
public class FindTargetSumWays {

    public static void main(String[] args) {

    }

    static int count = 0;

    static int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return count;
    }

    private static void dfs(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        dfs(nums, target, index + 1, sum + nums[index]);
        dfs(nums, target, index + 1, sum - nums[index]);
    }
}
