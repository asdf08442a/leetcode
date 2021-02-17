package com.jzg.leetcode.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
    System.out.println(Arrays.toString(array));
    bubbleSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void bubbleSortOpt1(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      boolean isSorted = true;
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }

  public static void bubbleSortOpt2(int[] array) {
    int lastExchangeIndex = 0;
    int sortBorder = array.length - 1;
    for (int i = 0; i < array.length - 1; i++) {
      boolean isSorted = true;
      for (int j = 0; j < sortBorder; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isSorted = false;
          lastExchangeIndex = j;
        }
      }
      sortBorder = lastExchangeIndex;
      if (isSorted) {
        break;
      }
    }
  }

  /**
   * 鸡尾酒排序
   */
  public static void bubbleSortOpt3(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      boolean isSorted = true;
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }

      isSorted = true;
      for (int j = array.length - i - 1; j > i; j--) {
        if (array[j] < array[j - 1]) {
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }

  public static void bubbleSort1(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}
