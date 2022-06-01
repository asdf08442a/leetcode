package com.jzg.leetcode.array;

/**
 * 整数反转
 */
public class IntReverse {

    public static void main(String[] args) {

    }

    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
