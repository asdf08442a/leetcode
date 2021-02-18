package com.jzg.leetcode.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author jinzg
 * @date 2021/2/17
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
    System.out.println(Arrays.toString(array));
    quickSortDouble(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void quickSortDouble(int[] array, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return;
    }
    int pivot = array[startIndex];
    int left = startIndex;
    int right = endIndex;
    while (left < right) {
      // 切记：先看右边
      while (left < right && array[right] >= pivot) {
        right--;
      }
      // 再看左边
      while (left < right && array[left] <= pivot) {
        left++;
      }
      if (left < right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
      }
    }
    array[startIndex] = array[left];
    array[left] = pivot;
    quickSortDouble(array, startIndex, left - 1);
    quickSortDouble(array, left + 1, endIndex);
  }
}
