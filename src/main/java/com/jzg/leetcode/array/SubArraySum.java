package com.jzg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为k的子数组
 */
public class SubArraySum {

    public static void main(String[] args) {

    }

    static int subArraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int pre = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
