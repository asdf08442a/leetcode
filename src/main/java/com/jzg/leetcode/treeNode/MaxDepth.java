package com.jzg.leetcode.treeNode;

/**
 * 最大深度
 *
 * @author jinzg
 * @date 2021/2/1
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        int depth = maxDepthRecur(root);
        System.out.println(depth);
    }

    static int maxDepthRecur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepthRecur(root.left), maxDepthRecur(root.right)) + 1;
    }
}
