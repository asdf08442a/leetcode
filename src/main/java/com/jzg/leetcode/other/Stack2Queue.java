package com.jzg.leetcode.other;

import java.util.Stack;

/**
 * 栈转队列
 *
 * @author jinzg
 * @date 2021/2/17
 */
public class Stack2Queue {

  private Stack<Integer> stackA = new Stack<>();
  private Stack<Integer> stackB = new Stack<>();

  public void enQueue(int element) {
    stackA.push(element);
  }

  public Integer deQueue() {
    if (stackB.isEmpty()) {
      if (stackA.isEmpty()) {
        return null;
      }
      while (!stackA.isEmpty()) {
        stackB.push(stackA.pop());
      }
    }
    return stackB.pop();
  }
}
