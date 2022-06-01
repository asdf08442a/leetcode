package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 有序数组删除重复数字
 */
public class DelDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(delDuplicate(nums));
    }

    static int[] delDuplicate(int[] nums) {
        if (nums.length <= 0) {
            return nums;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return Arrays.copyOf(nums, i + 1);
    }

}
