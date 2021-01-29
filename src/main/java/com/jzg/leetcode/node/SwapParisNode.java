package com.jzg.leetcode.node;

/**
 * 交换链表的相邻节点
 *
 * 1->3->7->5
 *
 * 3->1->5->7
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class SwapParisNode {

  public static void main(String[] args) {
    Node node15 = new Node(null, 5);
    Node node17 = new Node(node15, 7);
    Node node13 = new Node(node17, 3);
    Node node11 = new Node(node13, 1);

    Node node = swapParisNode(node11);
    System.out.println(node);

  }

  static Node swapParisNode(Node node) {
    Node virtual = new Node();
    virtual.next = node;
    Node head = virtual;
    while (head.next != null && head.next.next != null) {
      Node s1 = head.next, s2 = s1.next, s3 = s2.next;
      head.next = s2;
      s2.next = s1;
      s1.next = s3;
      head = s1;
    }
    return virtual.next;
  }
}
