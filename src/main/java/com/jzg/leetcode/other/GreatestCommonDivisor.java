package com.jzg.leetcode.other;

/**
 * 最大公约数（辗转相除法 + 更相减损术）
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class GreatestCommonDivisor {

  public static void main(String[] args) {
    System.out.println(gcd(30, 20));
  }


  public static int gcd(int a, int b) {
    if (a == b) {
      return a;
    }
    if ((a & 1) == 0 && (b & 1) == 0) {
      return gcd(a >> 1, b >> 1) << 1;
    } else if ((a & 1) != 0 && (b & 1) == 0) {
      return gcd(a, b >> 1);
    } else if ((a & 1) == 0 && (b & 1) != 0) {
      return gcd(a >> 1, b);
    } else {
      int min = Math.min(a, b);
      int max = Math.max(a, b);
      return gcd(max - min, min);
    }
  }
}
