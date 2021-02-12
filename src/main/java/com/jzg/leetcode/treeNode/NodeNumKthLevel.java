package com.jzg.leetcode.treeNode;

/**
 * 第k层节点数
 *
 * @author jinzg
 * @date 2021/2/12
 */
public class NodeNumKthLevel {

  public static void main(String[] args) {

    TreeNode root2111 = new TreeNode(null, null, 8);

    TreeNode root211 = new TreeNode(root2111, null, 4);
    TreeNode root212 = new TreeNode(null, null, 5);
    TreeNode root21 = new TreeNode(root211, root212, 2);

    TreeNode root221 = new TreeNode(null, null, 6);
    TreeNode root222 = new TreeNode(null, null, 7);
    TreeNode root22 = new TreeNode(root221, root222, 3);

    TreeNode root = new TreeNode(root21, root22, 1);

    System.out.println(nodeNumKthLevelRecur(root, 4));
  }

  static int nodeNumKthLevelRecur(TreeNode root, int k) {
    if (root == null || k < 1) {
      return 0;
    }
    if (k == 1) {
      return 1;
    }
    return nodeNumKthLevelRecur(root.left, k - 1) + nodeNumKthLevelRecur(root.right, k - 1);
  }
}
