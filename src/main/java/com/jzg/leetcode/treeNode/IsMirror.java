package com.jzg.leetcode.treeNode;

/**
 * 判断镜像
 *
 * @author jinzg
 * @date 2021/2/12
 */
public class IsMirror {

  public static void main(String[] args) {

    TreeNode root2111 = new TreeNode(null, null, 8);

    TreeNode root211 = new TreeNode(root2111, null, 4);
    TreeNode root212 = new TreeNode(null, null, 5);
    TreeNode root21 = new TreeNode(root211, root212, 2);

    TreeNode root221 = new TreeNode(null, null, 6);
    TreeNode root222 = new TreeNode(null, null, 7);
    TreeNode root22 = new TreeNode(root221, root222, 3);

    TreeNode root1 = new TreeNode(root21, root22, 1);


    TreeNode rootM2111 = new TreeNode(null, null, 8);

    TreeNode rootM211 = new TreeNode(null, rootM2111, 4);
    TreeNode rootM212 = new TreeNode(null, null, 5);
    TreeNode rootM21 = new TreeNode(rootM212, rootM211, 2);

    TreeNode rootM221 = new TreeNode(null, null, 6);
    TreeNode rootM222 = new TreeNode(null, null, 7);
    TreeNode rootM22 = new TreeNode(rootM222, rootM221, 3);
    TreeNode root2 = new TreeNode(rootM22, rootM21, 1);

    System.out.println(isMirrorRecur(root1, root2));
  }

  static boolean isMirrorRecur(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 == null || root2 == null) {
      return false;
    }
    if (root1.value != root2.value) {
      return false;
    }
    return isMirrorRecur(root1.left, root2.right) && isMirrorRecur(root1.right, root2.left);
  }
}
