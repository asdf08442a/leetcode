package com.jzg.leetcode.array;

/**
 * 最大子数组之和
 *
 * @author jinzg
 * @date 2021/2/15
 */
public class MaxSum {

  public static void main(String[] args) {
    int[] nums = {1, 3, -4, 6, 7, 0, 9};
    System.out.println(maxSum(nums));
  }


  static int maxSum(int[] nums) {
    int max = 0, sum = 0;
    for (int num : nums) {
      if (sum <= 0) {
        sum = num;
      } else {
        sum += num;
      }
      max = Math.max(max, sum);
    }

    return max;
  }

  static int maxSum1(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
      }
      max = Math.max(max, sum);
    }

    return max;
  }

}
