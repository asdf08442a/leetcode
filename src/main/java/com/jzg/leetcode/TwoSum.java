package com.jzg.leetcode;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * 两数之和
 *
 * @author jzg
 * @date 2019-06-05
 */
public class TwoSum {

  public static void main(String[] args) {
    one();
  }

  /**
   * 暴力枚举 时间复杂度：O(n2) 空间复杂度：O(1)
   */
  static void one() {
    int[] nums = {1, 3, 23, 6, 7, 4, 9};
    int target = 11;
    List<Integer> integerList = Lists.newLinkedList();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          integerList.add(i);
          integerList.add(j);
          System.out.println(integerList);
          return;
        }
      }
    }
  }

}
