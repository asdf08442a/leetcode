package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环删除下标包含7或是7的倍数的数
 */
public class RemoveNum {

    public static void main(String[] args) {
        Integer[] nums = new Integer[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        Integer[] ans = removeNum(nums);
        System.out.println(ans);
    }


    static Integer[] removeNum(Integer[] nums) {
        while (nums.length / 7 >= 1) {
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                    continue;
                } else {
                    newList.add(nums[i]);
                }
            }
            Integer[] newArray = newList.toArray(new Integer[newList.size()]);
            nums = newArray;
        }
        return nums;
    }

}
