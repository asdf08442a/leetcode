package com.jzg.leetcode.tree;

/**
 * 最小深度
 *
 * @author jinzg
 * @date 2021/2/2
 */
public class MinDepth {

    public static void main(String[] args) {

        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        int depth = minDepthRecur(root);
        System.out.println(depth);
    }

    static int minDepthRecur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.min(minDepthRecur(root.left), minDepthRecur(root.right)) + 1;
    }
}
