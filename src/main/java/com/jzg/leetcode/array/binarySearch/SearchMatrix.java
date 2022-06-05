package com.jzg.leetcode.array.binarySearch;

public class SearchMatrix {

    public static void main(String[] args) {

    }

    static boolean searchMatrix(int[][] nums, int target) {
        int n = nums.length, m = nums[0].length;
        int l = 0, r = n * m - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            int num = nums[mid / m][mid % m];
            if (target > num) {
                l = mid + 1;
            } else if (target < num) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
