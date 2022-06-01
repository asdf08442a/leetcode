package com.jzg.leetcode.array;

/**
 * 最大利润
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {7, 6, 7};
        System.out.println(singleNumber(nums));
    }


    static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
