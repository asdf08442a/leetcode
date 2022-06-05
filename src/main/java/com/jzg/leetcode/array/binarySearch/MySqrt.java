package com.jzg.leetcode.array.binarySearch;

/**
 * x的算术平方根
 */
public class MySqrt {

    public static void main(String[] args) {
//        System.out.println(mySqrt(10));
        System.out.println(10/3);
        System.out.println(10%3);
    }

    static int mySqrt(int num) {
        int l = 0, r = num;
        int ans = -1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if ((long)mid * mid > num) {
                r = mid - 1;
            } else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}
