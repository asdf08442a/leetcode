package com.jzg.leetcode.array;

import java.util.*;

/**
 * 全排列
 */
public class Permute {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(permute(nums));
    }


    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }
        backTracking(nums, result, map, new LinkedList<>());
        return result;
    }

    private static void backTracking(int[] nums, List<List<Integer>> result, Map<Integer, Boolean> map, LinkedList<Integer> linkedList) {
        if (linkedList.size() == nums.length) {
            result.add(new ArrayList<>(linkedList));
            return;
        }
        for (int num : nums) {
            if (!map.get(num)) {
                map.put(num, true);
                linkedList.add(num);
                backTracking(nums, result, map, linkedList);
                map.put(num, false);
                linkedList.removeLast();
            }
        }
    }

}
