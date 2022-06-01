package com.jzg.leetcode.array;

/**
 * 合并有序数组
 */
public class MergeArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(nums1);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null) {
            return;
        }
        int l = m - 1, r = n - 1;
        int total = m + n - 1;
        while (l >= 0 && r >= 0) {
            if (nums1[l] > nums2[r]) {
                nums1[total--] = nums1[l--];
            } else {
                nums1[total--] = nums2[r--];
            }
        }
        while (l >= 0) {
            nums1[total--] = nums1[l--];
        }
        while (r >= 0) {
            nums1[total--] = nums2[r--];
        }
    }
}
