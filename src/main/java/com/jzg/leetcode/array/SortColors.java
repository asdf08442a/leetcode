package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 颜色分类
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i, p++);
            }
        }

        for (int i = p; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, i, p++);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
