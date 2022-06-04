package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列2
 */
public class Permute2 {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    static boolean[] vis;

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, result, new LinkedList<>());
        return result;
    }

    private static void dfs(int[] nums, List<List<Integer>> result, LinkedList<Integer> linkedList) {
        if (linkedList.size() == nums.length) {
            result.add(new ArrayList<>(linkedList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue;
            }
            linkedList.add(nums[i]);
            vis[i] = true;
            dfs(nums, result, linkedList);
            vis[i] = false;
            linkedList.removeLast();
        }
    }
}
