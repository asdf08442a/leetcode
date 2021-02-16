package com.jzg.leetcode.array;

/**
 * 查找插入位置
 *
 * @author jinzg
 * @date 2021/1/30
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 4, 5, 8, 67, 88};
//    int rst = binarySearchUnRecur(nums, 5);
    int rst = binarySearchRecur(nums, 5, 0, 5);
    System.out.println(rst);
  }

  static int binarySearchRecur(int[] nums, int num, int left, int right) {
    if (num < nums[left] || num > nums[right] || left > right) {
      return -1;
    }
    int mid = (left + right) / 2;
    if (num < nums[mid]) {
      return binarySearchRecur(nums, num, left, mid - 1);
    } else if (num > nums[mid]) {
      return binarySearchRecur(nums, num, mid + 1, right);
    }
    return mid;
  }

  static int binarySearchUnRecur(int[] nums, int num) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == num) {
        return mid;
      } else if (nums[mid] < num) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return left;
  }

}
