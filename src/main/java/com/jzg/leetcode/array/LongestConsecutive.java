package com.jzg.leetcode.array;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 最大连续子数组
 */
public class LongestConsecutive {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 300, 5, 201, 202, 199};
        System.out.println(longestConsecutive(nums));
    }


    static int longestConsecutive(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        int result = 0;
        Set<Integer> set = Sets.newHashSet();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num)){
                continue;
            }
            int len = 1;
            int temp = num;
            while(set.contains(--temp)){
                ++len;
                // 可以去掉，但加上可以减少时间复杂度？
                set.remove(temp);
            }
            temp = num;
            while(set.contains(++temp)){
                ++len;
                set.remove(temp);
            }
            result = Math.max(len, result);
        }
        return result;
    }

}
