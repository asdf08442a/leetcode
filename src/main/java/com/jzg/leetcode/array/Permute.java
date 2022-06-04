package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 */
public class Permute {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }


    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(nums, result, new LinkedList<>());
        return result;
    }

    private static void backTracking(int[] nums, List<List<Integer>> result, LinkedList<Integer> linkedList) {
        if (linkedList.size() == nums.length) {
            result.add(new ArrayList<>(linkedList));
            return;
        }
        for (int num : nums) {
            if (linkedList.contains(num)) {
                continue;
            }
            linkedList.add(num);
            backTracking(nums, result, linkedList);
            linkedList.removeLast();
        }
    }
}
