package com.jzg.leetcode.array;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集
 */
public class SubSets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subSets(nums));
    }


    static List subSets(int[] nums) {
        List<ArrayList<Integer>> result = Lists.newArrayList();
        if (nums.length <= 0) {
            return result;
        }
        dfs(nums, 0, Lists.newLinkedList(), result);
        return result;
    }

    private static void dfs(int[] nums, int start, LinkedList<Integer> list, List<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.addLast(nums[i]);
            dfs(nums, i + 1, list, result);
            list.removeLast();
        }
    }

}
