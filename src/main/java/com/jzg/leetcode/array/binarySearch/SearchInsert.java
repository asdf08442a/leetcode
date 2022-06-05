package com.jzg.leetcode.array.binarySearch;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4};
        System.out.println(searchInsert(nums, 1));
    }

    static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = nums.length;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (target > nums[mid]) {
                l = mid + 1;
            } else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}
