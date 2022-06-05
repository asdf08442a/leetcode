package com.jzg.leetcode.tree;

/**
 * 判断相同
 *
 * @author jinzg
 * @date 2021/2/12
 */
public class IsSame {

    public static void main(String[] args) {

        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);
        TreeNode root1 = new TreeNode(root21, root22, 1);

        System.out.println(isSameRecur(root, root21));
    }

    static boolean isSameRecur(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.value != node2.value) {
            return false;
        }
        return isSameRecur(node1.left, node2.left) && isSameRecur(node1.right, node2.right);
    }
}
