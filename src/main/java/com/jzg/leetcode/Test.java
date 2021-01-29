package com.jzg.leetcode;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 两数相加
 *
 * @author jzg
 * @date 2019-06-05
 */
public class Test {

  public static void main(String[] args) {
    String a = "123";
    String b = new String("123");
    System.out.println(a == b);
    System.out.println(a.equals(b));
  }

}
