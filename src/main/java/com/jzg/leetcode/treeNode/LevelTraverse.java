package com.jzg.leetcode.treeNode;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 广度遍历
 *
 * @author jinzg
 * @date 2021/2/12
 */
public class LevelTraverse {

  public static void main(String[] args) {

    TreeNode root2111 = new TreeNode(null, null, 8);

    TreeNode root211 = new TreeNode(root2111, null, 4);
    TreeNode root212 = new TreeNode(null, null, 5);
    TreeNode root21 = new TreeNode(root211, root212, 2);

    TreeNode root221 = new TreeNode(null, null, 6);
    TreeNode root222 = new TreeNode(null, null, 7);
    TreeNode root22 = new TreeNode(root221, root222, 3);

    TreeNode root = new TreeNode(root21, root22, 1);

    List<Integer> list = Lists.newArrayList();
    levelTraverseUnRecur(root, list);
    System.out.println(list);
  }

  static void levelTraverseUnRecur(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      list.add(node.value);
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }
}
