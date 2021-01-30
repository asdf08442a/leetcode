package com.jzg.leetcode.node;

/**
 * 删除链表的倒数第N个节点
 *
 * 1->3->4->7
 *
 * 3
 *
 * 1->4->7
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class DelNthFromEndNode {

  public static void main(String[] args) {
    Node node17 = new Node(null, 7);
    Node node14 = new Node(node17, 4);
    Node node13 = new Node(node14, 3);
    Node node11 = new Node(node13, 1);

    Node node = delNthFromEndNode(node11, 3);
    System.out.println(node);

  }

  static Node delNthFromEndNode(Node node, int n) {
    if (node == null) {
      return null;
    }
    if (n == 0) {
      return node;
    }

    Node first = node;
    while (n-- != 0) {
      first = first.next;
      if (first == null) {
        return node;
      }
    }

    Node after = node;
    while (first.next != null) {
      first = first.next;
      after = after.next;
    }

    after.next = after.next.next;
    return node;
  }
}
