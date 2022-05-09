package com.jzg.leetcode.array;

/**
 * 最大子数组之和
 */
public class MaxSum {

  public static void main(String[] args) {
    int[] nums = {-1};
    System.out.println(maxSum(nums));
    int x=1,y=2;
    Integer.bitCount(x^y);
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
