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

    TreeNode root21 = new TreeNode(null, null, 1);

    TreeNode root22 = new TreeNode(null, null, 3);

    TreeNode root = new TreeNode(root21, root22, 2);

    System.out.println(isBSTUnRecur(root));
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
}
