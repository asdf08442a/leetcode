package com.jzg.leetcode.array;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集
 */
public class SubArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subArray(nums));
    }


    static List subArray(int[] nums) {
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

    static List subArray1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> temp = Lists.newArrayList();
            for (List subSet : result) {
                List sub = new ArrayList(subSet);
                sub.add(num);
                temp.add(sub);
            }
            result.addAll(temp);
        }
        return result;
    }

}
