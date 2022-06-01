package com.jzg.leetcode.treeNode;

/**
 * 判断是否为子结构
 *
 * @author jinzg
 * @date 2021/2/13
 */
public class HasSubTree {

    public static void main(String[] args) {

        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);
        TreeNode root1 = new TreeNode(root21, null, 1);

        System.out.println(hasSubTreeRecur(root, root1));
    }

    static boolean hasSubTreeRecur(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return false;
        }

        boolean result = false;
        if (node1.value == node2.value) {
            result = doesHasSubTree(node1, node2);
        }
        if (!result) {
            result = hasSubTreeRecur(node1.left, node2);
        }
        if (!result) {
            result = hasSubTreeRecur(node1.right, node2);
        }
        return result;
    }

    private static boolean doesHasSubTree(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        return doesHasSubTree(node1.left, node2.left) && doesHasSubTree(node1.right, node2.right);
    }
}
