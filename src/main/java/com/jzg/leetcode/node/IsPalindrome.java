package com.jzg.leetcode.node;

import java.util.Stack;

/**
 * 判断回文链表
 * <p>
 * 1->3->7->7->3->1
 * <p>
 * true
 *
 * @author jinzg
 * @date 2021/1/29
 */
public class IsPalindrome {

  public static void main(String[] args) {
    Node node21 = new Node(null, 2);
    Node node23 = new Node(node21, 3);
    Node node27 = new Node(null, 1);

    Node node17 = new Node(node27, 3);
    Node node13 = new Node(node17, 3);
    Node node11 = new Node(node13, 1);

    boolean rst = isPalindrome(node11);
    System.out.println(rst);

  }

  static boolean isPalindrome(Node node) {
    if (node == null || node.next == null) {
      return true;
    }

    Node head = node;
    Node slow = node;
    Node fast = node;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    Stack<Integer> stack = new Stack<>();
    while (slow != null) {
      stack.push(slow.value);
      slow = slow.next;
    }
    while (!stack.isEmpty()) {
      int value = stack.pop();
      if (value != head.value) {
        return false;
      }
      head = head.next;
    }
    return true;
  }
}
