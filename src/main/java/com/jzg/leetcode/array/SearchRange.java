package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class SearchRange {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        System.out.println(Arrays.toString(searchRange1(nums, 1)));
    }

    static int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false) - 1;
        if (leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target && nums[rightIndex] == target) {
            return new int[]{leftIndex, rightIndex};
        }
        return new int[]{-1, -1};
    }

    private static int binarySearch(int[] nums, int target, boolean flag) {
        int l = 0, r = nums.length - 1, ans = nums.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target || (flag && nums[mid] >= target)) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static int[] searchRange1(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] != target) {
            return new int[]{-1, -1};
        }
        int left = l;
        l = 0;
        r = nums.length - 1;
        while (l < r) {
            int mid = (l + r + 1) >>> 1;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return new int[]{left, r};
    }
}
