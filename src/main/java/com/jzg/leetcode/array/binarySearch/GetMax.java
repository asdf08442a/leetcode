package com.jzg.leetcode.array.binarySearch;

public class GetMax {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 3, 4};
        System.out.println(getMax(nums));
    }

    static int getMax(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    private static int process(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int mid = l + ((r - l) >> 1);
        int leftMax = process(nums, l, mid);
        int rightMax = process(nums, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }
}
