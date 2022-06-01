package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 最接近的三数之和
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 10000000;

        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1, third = nums.length - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum < target) {
                    int i = second + 1;
                    while (i < third && nums[second] == nums[i]) {
                        i++;
                    }
                    second = i;
                } else {
                    int j = third - 1;
                    while (second < j && nums[third] == nums[j]) {
                        j--;
                    }
                    third = j;
                }
            }
        }
        return best;
    }
}
