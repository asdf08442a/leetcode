package com.jzg.leetcode.tree;

/**
 * 镜像反转
 *
 * @author jinzg
 * @date 2021/2/12
 */
public class Mirror {

    public static void main(String[] args) {

        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        TreeNode mirror = mirrorRecur(root);
        System.out.println(mirror);
    }

    static TreeNode mirrorRecur(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = mirrorRecur(root.right);
        TreeNode right = mirrorRecur(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
