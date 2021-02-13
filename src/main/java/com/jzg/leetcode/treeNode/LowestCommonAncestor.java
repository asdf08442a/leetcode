package com.jzg.leetcode.treeNode;

/**
 * 判断是否为子结构
 *
 * @author jinzg
 * @date 2021/2/13
 */
public class LowestCommonAncestor {

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

    TreeNode node = lowestCommonAncestorRecur(root, root21, root22);
    System.out.println(node);
  }

  static TreeNode lowestCommonAncestorRecur(TreeNode root, TreeNode node1, TreeNode node2) {
    if (root == null || root == node1 || root == node2) {
      return root;
    }
    TreeNode left = lowestCommonAncestorRecur(root.left, node1, node2);
    TreeNode right = lowestCommonAncestorRecur(root.right, node1, node2);
    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }
}
