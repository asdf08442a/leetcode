package com.jzg.leetcode.array.sort;

/**
 * 数组小和 || 逆序对
 */
public class SmallSum {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 2, 5};
        System.out.println(smallSum(array));
    }

    static int smallSum(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return process(nums, 0, nums.length - 1);
    }

    static int process(int[] nums, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return process(nums, l, mid) +
                process(nums, mid + 1, r) +
                merge(nums, l, mid, r);
    }

    private static int merge(int[] nums, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= r) {
            res += nums[p1] < nums[p2] ? (r - p2 + 1) * nums[p1] : 0;
            help[i++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
        }
        while (p1 <= mid) {
            help[i++] = nums[p1++];
        }
        while (p2 <= r) {
            help[i++] = nums[p2++];
        }
        for (i = 0; i < help.length; i++) {
            nums[l + i] = help[i];
        }
        return res;
    }
}
