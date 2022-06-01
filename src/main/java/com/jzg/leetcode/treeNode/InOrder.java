package com.jzg.leetcode.treeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历
 *
 * @author jinzg
 * @date 2021/2/1
 */
public class InOrder {

    public static void main(String[] args) {
        TreeNode root211 = new TreeNode(null, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        List<Integer> list = new ArrayList<>();
        inOrderUnRecur(root, list);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        inOrderUnRecur(root, list1);
        System.out.println(list1);
    }

    static void inOrderRecur(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrderRecur(root.left, list);
        list.add(root.value);
        inOrderRecur(root.right, list);
    }

    static void inOrderUnRecur(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                list.add(root.value);
                root = root.right;
            }
        }
    }
}
