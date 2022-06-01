package com.jzg.leetcode.sort;

import java.util.Arrays;

/**
 * 堆排序
 * <p>
 * 时间复杂度O(nlogn)，空间复杂度O(1)，不稳定排序
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        // 构建最大二叉堆
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        // 循环删除堆顶元素，替换到二叉堆的末尾，调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            downAdjust(array, 0, i);
        }
    }

    public static void downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex] < array[childIndex + 1]) {
                childIndex++;
            }
            if (temp > array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        array[parentIndex] = temp;
    }
}
