package com.jzg.leetcode.array;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

    }

    static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0) {
            return null;
        }

        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int t = stack.pop();
                ans[t] = i - t;
            }
            stack.push(i);
        }
        return ans;
    }
}
