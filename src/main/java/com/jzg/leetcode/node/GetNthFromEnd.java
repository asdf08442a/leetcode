package com.jzg.leetcode.node;

/**
 * 获取链表的倒数第N个节点
 * <p>
 * 1->3->4->7
 * <p>
 * 4
 * <p>
 * 1
 *
 * @author jinzg
 * @date 2021/2/14
 */
public class GetNthFromEnd {

  public static void main(String[] args) {
    Node node17 = new Node(null, 7);
    Node node14 = new Node(node17, 4);
    Node node13 = new Node(node14, 3);
    Node node11 = new Node(node13, 1);

    Node node = getNthFromEnd(node11, 5);
    System.out.println(node);

  }

  static Node getNthFromEnd(Node head, int n) {
    if (head == null) {
      return null;
    }
    Node first = head;
    while (n > 0) {
      if (first == null) {
        return null;
      }
      first = first.next;
      n--;
    }

    Node after = head;
    while (first != null) {
      first = first.next;
      after = after.next;
    }

    return after;
  }
}
