package com.jzg.leetcode.array;

/**
 * 最大子数组之和
 *
 * @author jinzg
 * @date 2021/2/15
 */
public class MaxSum {

  public static void main(String[] args) {
    int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
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

}
