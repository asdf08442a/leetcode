package com.jzg.leetcode.node;

/**
 * 交换链表的相邻节点
 * <p>
 * 1->3->7->5
 * <p>
 * 3->1->5->7
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class SwapParis {

    public static void main(String[] args) {
        Node node15 = new Node(null, 5);
        Node node17 = new Node(node15, 7);
        Node node13 = new Node(node17, 3);
        Node node11 = new Node(node13, 1);

        Node node = swapParis(node11);
        System.out.println(node);

    }

    static Node swapParis(Node node) {
        Node dummy = new Node();
        dummy.next = node;
        Node head = dummy;
        while (head.next != null && head.next.next != null) {
            Node s1 = head.next, s2 = s1.next, s3 = s2.next;
            head.next = s2;
            s2.next = s1;
            s1.next = s3;
            head = s1;
        }
        return dummy.next;
    }
}
