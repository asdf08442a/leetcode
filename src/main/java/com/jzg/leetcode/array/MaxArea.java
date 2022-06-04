package com.jzg.leetcode.array;

/**
 * 盛最多水的容器
 */
public class MaxArea {

    public static void main(String[] args) {

    }

    static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            ans = Math.max(ans, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
