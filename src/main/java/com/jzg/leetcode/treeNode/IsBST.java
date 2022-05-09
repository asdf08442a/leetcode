package com.jzg.leetcode.treeNode;

import java.util.Stack;

/**
 * 判断BST
 *
 * @author jinzg
 * @date 2021/2/13
 */
public class IsBST {

    public static void main(String[] args) {

        TreeNode root21 = new TreeNode(null, null, 4);

        TreeNode root221 = new TreeNode(null, null, 3);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 6);

        TreeNode root = new TreeNode(root21, root22, 5);

        System.out.println(isBSTRecur(root));
    }

    static boolean isBSTUnRecur(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                root = stack.pop();
                if (pre != null && pre.value >= root.value) {
                    return false;
                }
                pre = root;
                root = root.right;
            }
        }
        return true;
    }

    static boolean isBSTRecur(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isBST(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.value <= minValue || root.value >= maxValue) {
            return false;
        }
        return isBST(root.left, minValue, root.value) && isBST(root.right, root.value, maxValue);
    }


}
