package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合之和
 */
public class CombinationSum {

    public static void main(String[] args) {

    }

    static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, target, result, new ArrayList<>(), 0);
        return result;
    }

    private static void dfs(int[] nums, int remain, List<List<Integer>> result, List<Integer> path, int start) {
        if (remain <= 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > remain) {
                return;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            dfs(nums, remain - nums[i], result, path, i);
            path.remove(path.size() - 1);
        }
    }
}
