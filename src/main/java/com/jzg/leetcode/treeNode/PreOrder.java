package com.jzg.leetcode.treeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 前序遍历
 *
 * @author jinzg
 * @date 2021/2/1
 */
public class PreOrder {

  public static void main(String[] args) {
    TreeNode root211 = new TreeNode(null, null, 4);
    TreeNode root212 = new TreeNode(null, null, 5);
    TreeNode root21 = new TreeNode(root211, root212, 2);

    TreeNode root221 = new TreeNode(null, null, 6);
    TreeNode root222 = new TreeNode(null, null, 7);
    TreeNode root22 = new TreeNode(root221, root222, 3);

    TreeNode root = new TreeNode(root21, root22, 1);

    List<Integer> list = new ArrayList<>();
    preOrderUnRecur(root, list);
    System.out.println(list.toString());
  }

  static void preOrderRecur(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.value);
    preOrderRecur(root.left, list);
    preOrderRecur(root.right, list);
  }

  static void preOrderUnRecur(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    Stack<TreeNode> stack = new Stack();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      list.add(node.value);
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }
  }
}
