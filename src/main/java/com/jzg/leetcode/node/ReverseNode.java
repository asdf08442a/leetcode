package com.jzg.leetcode.node;

/**
 * 反转链表
 *
 * 1->3->7
 *
 * 7->3->1
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class ReverseNode {

  public static void main(String[] args) {
    Node node17 = new Node(null, 7);
    Node node13 = new Node(node17, 3);
    Node node11 = new Node(node13, 1);

    Node node = reverseNode1(node11);
    System.out.println(node);

  }

  static Node reverseNode1(Node node) {
    if (node == null) {
      return null;
    }

    Node dummy = new Node(null, -1);
    Node curr = node;
    while (curr != null) {
      Node next = curr.next;
      curr.next = dummy.next;
      dummy.next = curr;
      curr = next;
    }
    return dummy.next;
  }
}
