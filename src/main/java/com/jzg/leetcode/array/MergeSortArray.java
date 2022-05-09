package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 合并有序数组
 */
public class MergeSortArray {

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7};
        int[] b = {2, 5, 8, 9};
        int[] mergeArray = mergeSortArray(a, b);
        System.out.println(mergeArray);
    }

    static int[] mergeSortArray(int[] a, int[] b) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null) {
            return Arrays.copyOf(b, b.length);
        }
        if (b == null) {
            return Arrays.copyOf(a, a.length);
        }

        int[] nArray = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            if (aIndex >= a.length) {
                nArray[i] = b[bIndex];
                bIndex++;
                continue;
            }
            if (bIndex >= b.length) {
                nArray[i] = a[aIndex];
                aIndex++;
                continue;
            }
            if (a[aIndex] < b[bIndex]) {
                nArray[i] = a[aIndex];
                aIndex++;
            } else {
                nArray[i] = b[bIndex];
                bIndex++;
            }
        }

        return nArray;
    }
}
