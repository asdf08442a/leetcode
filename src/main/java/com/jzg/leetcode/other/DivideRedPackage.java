package com.jzg.leetcode.other;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 拆分红包
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class DivideRedPackage {

  public static void main(String[] args) {
    List<Integer> list = divideRandom(100, 10);
    System.out.println(list);
    System.out.println(list.stream().collect(Collectors.summarizingInt(value -> value)).getSum());
  }


  /**
   * @param totalAmount    总金额（单位分）
   * @param totalPeopleNum 总人数
   * @return List<Integer>  拆分后的红包数组
   */
  public static List<Integer> divideRandom(int totalAmount, int totalPeopleNum) {
    if (totalAmount > 20000) {
      throw new IllegalArgumentException("单个红包不能超过200元");
    }
    if (totalAmount < totalPeopleNum || totalAmount < 1) {
      throw new IllegalArgumentException("被拆分的总金额不能小于0.01元");
    }

    List<Integer> list = Lists.newArrayList();
    int leftAmount = totalAmount;
    int leftNum = totalPeopleNum;
    Random random = new Random();
    for (int i = 1; i < totalPeopleNum; i++) {
      int amount = random.nextInt(leftAmount / leftNum * 2 - 1) + 1;
      leftAmount -= amount;
      leftNum--;
      list.add(amount);
    }
    list.add(leftAmount);
    return list;
  }
}
