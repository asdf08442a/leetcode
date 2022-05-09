package com.jzg.leetcode.array;

/**
 * // 如n=4 则1+2+2+3=8
 * // 如n=5 则1+2+2+3+3=11
 */
public class ArraySum {

    public static void main(String[] args) {
        int listSum = getListSum(5);
        System.out.println(listSum);
    }


    public static int getListSum(int len) {
        int sum = 0;
        int addTimes = 0;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (++addTimes > len) {
                    return sum;
                }
                sum += i;
            }
        }
        return sum;
    }
}
