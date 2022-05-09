package com.jzg.leetcode.array;

/**
 * 最大子数组之积
 */
public class MaxMulti {

    public static void main(String[] args) {
        int[] nums = {-2, 0, -1};
        System.out.println(maxMulti(nums));
    }


    static int maxMulti(int[] nums) {
        int result = nums[0], max = 1, min = 1;
        for (int num : nums) {
            if (num < 0) {
                int temp = max;
                max = Math.max(min * num, num);
                min = Math.min(temp * num, num);
            } else {
                max = Math.max(max * num, num);
                min = Math.min(min * num, num);
            }
            result = Math.max(max, result);
        }
        return result;
    }

}
