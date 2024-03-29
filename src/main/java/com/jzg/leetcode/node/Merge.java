package com.jzg.leetcode.node;

/**
 * 合并
 * <p>
 * 1->3->7
 * <p>
 * 1->4->5
 * <p>
 * 1->1->3->4->5->7
 *
 * @author jinzg
 * @date 2021/1/27
 */
public class Merge {

    public static void main(String[] args) {
        Node node17 = new Node(null, 7);
        Node node13 = new Node(node17, 3);
        Node node11 = new Node(node13, 1);

        Node node25 = new Node(null, 5);
        Node node24 = new Node(node25, 4);
        Node node21 = new Node(node24, 1);

        Node node = merge(node11, node21);
        System.out.println(node);

    }

    static Node merge(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        Node dummy = new Node();
        Node current = dummy;
        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }

        current.next = node1 != null ? node1 : node2;

        return dummy.next;
    }
}
