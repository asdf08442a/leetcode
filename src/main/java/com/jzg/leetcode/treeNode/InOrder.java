package com.jzg.leetcode.treeNode;

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

    inOrderTreeNode(root);

  }

  static void inOrderTreeNode(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTreeNode(root.left);
    System.out.print(String.valueOf(root.value) + ' ');
    inOrderTreeNode(root.right);
  }
}
