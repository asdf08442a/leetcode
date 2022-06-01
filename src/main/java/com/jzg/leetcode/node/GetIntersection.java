package com.jzg.leetcode.node;

/**
 * 获取两个链表的交点
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class GetIntersection {

    public static void main(String[] args) {
        Node node17 = new Node(null, 7);
        Node node13 = new Node(node17, 3);
        Node node11 = new Node(node13, 1);

        Node node21 = new Node(node13, 1);
        Node rst = getIntersection(node11, node21);
        System.out.println(rst);
    }

    static Node getIntersection(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return null;
        }

        Node head1 = node1;
        int len1 = 0;
        while (head1 != null) {
            head1 = head1.next;
            len1++;
        }

        Node head2 = node2;
        int len2 = 0;
        while (head2 != null) {
            head2 = head2.next;
            len2++;
        }

        if (len1 > len2) {
            int t = len1 - len2;
            while (t != 0) {
                node1 = node1.next;
                t--;
            }
        } else {
            int t = len2 - len1;
            while (t != 0) {
                node2 = node2.next;
                t--;
            }
        }

        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }

}
