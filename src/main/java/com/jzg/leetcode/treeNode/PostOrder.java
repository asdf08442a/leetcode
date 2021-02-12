package com.jzg.leetcode.treeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历
 *
 * @author jinzg
 * @date 2021/2/1
 */
public class PostOrder {

  public static void main(String[] args) {
    TreeNode root211 = new TreeNode(null, null, 4);
    TreeNode root212 = new TreeNode(null, null, 5);
    TreeNode root21 = new TreeNode(root211, root212, 2);

    TreeNode root221 = new TreeNode(null, null, 6);
    TreeNode root222 = new TreeNode(null, null, 7);
    TreeNode root22 = new TreeNode(root221, root222, 3);

    TreeNode root = new TreeNode(root21, root22, 1);

    List<Integer> list = new ArrayList<>();
    postOrderRecur(root, list);
    System.out.println(list);

    List<Integer> list1 = new ArrayList<>();
    postOrderUnRecur(root, list1);
    System.out.println(list1);
  }

  static void postOrderRecur(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    postOrderRecur(root.left, list);
    postOrderRecur(root.right, list);
    list.add(root.value);
  }

  static void postOrderUnRecur(TreeNode root, List<Integer> list) {
    Stack<TreeNode> stack1 = new Stack();
    Stack<TreeNode> stack2 = new Stack();
    if (root != null) {
      stack1.add(root);
    }
    while (!stack1.isEmpty()) {
      TreeNode node = stack1.pop();
      stack2.push(node);
      if (node.left != null) {
        stack1.push(node.left);
      }
      if (node.right != null) {
        stack1.push(node.right);
      }
    }
    while (!stack2.isEmpty()) {
      list.add(stack2.pop().value);
    }
  }
}
