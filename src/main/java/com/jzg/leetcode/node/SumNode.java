package com.jzg.leetcode.node;

/**
 * 求和
 * <p>
 * 1->3->7 + 7->8->1 = 8->1->9
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class SumNode {

    public static void main(String[] args) {
        Node node17 = new Node(null, 7);
        Node node13 = new Node(node17, 3);
        Node node11 = new Node(node13, 1);

        Node node21 = new Node(null, 1);
        Node node28 = new Node(node21, 8);
        Node node27 = new Node(node28, 7);

        Node node = sum(node11, node27);
        System.out.println(node);

    }

    static Node sum(Node node1, Node node2) {
        Node dummy = new Node();
        Node head = dummy;
        int c = 0, s;
        while (node1 != null || node2 != null || c != 0) {
            int a = node1 == null ? 0 : node1.value;
            int b = node2 == null ? 0 : node2.value;
            s = a + b + c;
            head.next = new Node(null, s % 10);
            c = s / 10;
            node1 = node1 == null ? null : node1.next;
            node2 = node2 == null ? null : node2.next;
            head = head.next;
        }
        return dummy.next;
    }
}
