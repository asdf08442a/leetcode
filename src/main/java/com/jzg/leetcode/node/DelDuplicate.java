package com.jzg.leetcode.node;

/**
 * 删除有序链表重复项
 * <p>
 * 1->3->3->7
 * <p>
 * 1->3->7
 *
 * @author jinzg
 * @date 2021/1/28
 */
public class DelDuplicate {

    public static void main(String[] args) {
        Node node17 = new Node(null, 3);
        Node node14 = new Node(node17, 3);
        Node node13 = new Node(node14, 3);
        Node node11 = new Node(null, 3);

        Node node = delDuplicate(node11);
        System.out.println(node);

    }

    static Node delDuplicate(Node node) {
        if (node == null) {
            return null;
        }

        Node head = node;
        while (head.next != null) {
            if (head.value == head.next.value) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return node;
    }
}
