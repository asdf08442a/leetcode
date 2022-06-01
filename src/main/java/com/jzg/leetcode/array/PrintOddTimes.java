package com.jzg.leetcode.array;

/**
 * 打印奇数次数
 */
public class PrintOddTimes {

    public static void main(String[] args) {
        printOneOddTimes(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3});
        printTwoOddTimes(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3, 4});
    }

    public static void printOneOddTimes(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        System.out.println(ans);
    }

    public static void printTwoOddTimes(int[] nums) {
        int eor = 0;
        for (int num : nums) {
            eor ^= num;
        }

        int rightOne = eor & (~eor + 1);
        int otherOne = 0;
        for (int num : nums) {
            if ((num & rightOne) == 0) {
                otherOne ^= num;
            }
        }
        System.out.println(otherOne + " " + (eor ^ otherOne));
    }
}
