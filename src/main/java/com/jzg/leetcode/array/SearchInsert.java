package com.jzg.leetcode.array;

/**
 * 查找插入位置
 *
 * @author jinzg
 * @date 2021/1/30
 */
public class SearchInsert {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 4, 5, 8, 67, 88};
    int rst = searchInsert(nums, 7);
    System.out.println(rst);
  }

  static int searchInsert(int[] nums, int num) {
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
