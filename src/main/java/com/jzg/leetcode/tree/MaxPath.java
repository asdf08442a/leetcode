package com.jzg.leetcode.tree;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;


/**
 * 最长路径
 *
 * @author jinzg
 * @date 2021/2/1
 */
public class MaxPath {

    static List result = Lists.newLinkedList();

    public static void main(String[] args) {
        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        List maxPath = maxPath(root);
        System.out.println(maxPath);
    }

    static List maxPath(TreeNode root) {
        if (root == null) {
            return null;
        }

        int maxDepth = getMaxDepth(root);
        dfs(root, Lists.newLinkedList(), maxDepth);

        return result;
    }

    private static void dfs(TreeNode root, LinkedList<Integer> list, int maxDepth) {
        if (root == null) {
            return;
        }
        list.add(root.value);
        if (root.left == null && root.right == null) {
            if (list.size() == maxDepth) {
                result = Lists.newLinkedList(list);
            }
        }
        dfs(root.left, list, maxDepth);
        dfs(root.right, list, maxDepth);
        list.removeLast();
    }

    private static int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getMaxDepth(root.left), getMaxDepth(root.right)) + 1;
    }
}
