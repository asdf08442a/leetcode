package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class ThreeSum {

    public static void main(String[] args) {

    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 1) {
            return ans;
        }
        Arrays.sort(nums);
        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = nums.length - 1;
            int target = -nums[first];
            for (int second = first + 1; second < nums.length; second++) {
                if (nums[second] == nums[second + 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> integerList = new ArrayList<>();
                    integerList.add(nums[first]);
                    integerList.add(nums[second]);
                    integerList.add(nums[third]);
                    ans.add(integerList);
                }
            }
        }
        return ans;
    }
}
