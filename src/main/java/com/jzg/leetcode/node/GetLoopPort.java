package com.jzg.leetcode.node;

/**
 * 找到环入口
 * <p>
 * 1->3->4->7->5->4
 * <p>
 * 4
 *
 * @author jinzg
 * @date 2021/2/14
 */
public class GetLoopPort {

    public static void main(String[] args) {
        Node node17 = new Node(null, 7);
        Node node14 = new Node(node17, 4);
        Node node13 = new Node(node14, 3);
        Node node11 = new Node(node13, 1);
        node17.next = node14;

        Node node = getLoopPort(node11);
        System.out.println(node.value);

    }

    static Node getLoopPort(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
