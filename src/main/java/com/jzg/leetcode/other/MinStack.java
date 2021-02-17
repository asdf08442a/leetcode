package com.jzg.leetcode.other;

import java.util.Objects;
import java.util.Stack;

/**
 * 最小栈
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class MinStack {

  private Stack<Integer> mainStack = new Stack<>();
  private Stack<Integer> minStack = new Stack<>();

  public void push(int element) {
    mainStack.push(element);
    if (minStack.isEmpty() || minStack.peek() > element) {
      minStack.push(element);
    }
  }

  public void pop() {
    mainStack.pop();
    if (Objects.equals(mainStack.peek(), minStack.peek())) {
      minStack.pop();
    }
  }

  public int getMin() {
    if (mainStack.isEmpty()) {
      throw new RuntimeException("stack is empty");
    }
    return minStack.peek();
  }
}
