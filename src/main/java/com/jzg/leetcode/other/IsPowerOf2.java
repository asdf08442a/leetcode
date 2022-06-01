package com.jzg.leetcode.other;

/**
 * 判断2的整数幂
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class IsPowerOf2 {

    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));
        System.out.println(isPowerOf2(20));
    }


    public static boolean isPowerOf2(int a) {
        return (a & a - 1) == 0;
    }
}
