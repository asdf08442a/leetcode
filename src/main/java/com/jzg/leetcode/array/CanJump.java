package com.jzg.leetcode.array;

/**
 * 跳跃游戏
 */
public class CanJump {

    public static void main(String[] args) {

    }

    static boolean canJump(int[] nums) {
        int rightmost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
            }
            if (rightmost >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
