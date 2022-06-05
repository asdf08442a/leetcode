package com.jzg.leetcode.array.sort;

import java.util.Arrays;

/**
 * 最小二叉堆
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class BinaryHeap {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjustMin(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        buildMinHeap(array);
        System.out.println(Arrays.toString(array));
    }

    public static void upAdjustMin(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }

    public static void downAdjustMin(int[] array, int parentIndex) {
        int length = array.length;
        int temp = array[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            if (temp < array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        array[parentIndex] = temp;
    }

    public static void buildMinHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            downAdjustMin(array, i);
        }
    }
}
