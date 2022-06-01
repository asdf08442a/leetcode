package com.jzg.leetcode.array;

import java.util.*;

/**
 * 全排列 & 全排列2
 */
public class Permute {

    public static void main(String[] args) {
//        System.out.println(permute(new int[]{1,2,3}));
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
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


    // TODO: 2022-05-15
    static Set<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums == null || nums.length < 1) {
            return result;
        }
        backTracking(nums, result, 0, new LinkedList<>());
        return result;
    }

    private static void backTracking(int[] nums, Set<List<Integer>> result, int index, LinkedList<Integer> linkedList) {
        if (linkedList.size() == nums.length) {
            result.add(new ArrayList<>(linkedList));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            linkedList.add(nums[index]);
            backTracking(nums, result, index + 1, linkedList);
            linkedList.removeLast();
        }
    }

}
