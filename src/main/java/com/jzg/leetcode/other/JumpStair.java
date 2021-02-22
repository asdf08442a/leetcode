package com.jzg.leetcode.other;

/**
 * 跳台阶(一次可以跳1级台阶，也可以跳2级台阶)
 *
 * @author jinzg
 * @date 2021/2/20
 */
public class JumpStair {

  public static void main(String[] args) {
    System.out.println(jumpStairUnRecur(5));
  }

  public static int jumpStairRecur(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    return jumpStairRecur(n - 1) + jumpStairRecur(n - 2);
  }

  public static int jumpStairUnRecur(int n) {
    int a = 1, b = 1;
    for (int i = 1; i < n; i++) {
      a = a + b;
      b = a - b;
    }
    return a;
  }
}
