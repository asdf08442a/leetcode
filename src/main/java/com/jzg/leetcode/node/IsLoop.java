package com.jzg.leetcode.node;

/**
 * 判断有环
 * <p>
 * 1->3->4->7
 * <p>
 * false
 *
 * @author jinzg
 * @date 2021/2/14
 */
public class IsLoop {

  public static void main(String[] args) {
    Node node17 = new Node(null, 7);
    Node node14 = new Node(node17, 4);
    Node node13 = new Node(node14, 3);
    Node node11 = new Node(node13, 1);
//    node17.next = node13;

    System.out.println(isLoop(node11));

  }

  static boolean isLoop(Node head) {
    if (head == null || head.next == null) {
      return false;
    }
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}
