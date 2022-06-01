package com.jzg.leetcode.treeNode;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 * 寻找路径
 *
 * @author jinzg
 * @date 2021/2/13
 */
public class FindPath {

    public static void main(String[] args) {

        TreeNode root2111 = new TreeNode(null, null, 8);

        TreeNode root211 = new TreeNode(root2111, null, 4);
        TreeNode root212 = new TreeNode(null, null, 5);
        TreeNode root21 = new TreeNode(root211, root212, 2);

        TreeNode root221 = new TreeNode(null, null, 6);
        TreeNode root222 = new TreeNode(null, null, 7);
        TreeNode root22 = new TreeNode(root221, root222, 3);

        TreeNode root = new TreeNode(root21, root22, 1);

        System.out.println(findPath(root, 8));
    }

    static List<Stack<Integer>> findPath(TreeNode root, int expectNum) {
        Stack<Integer> eachPath = new Stack<>();
        List<Stack<Integer>> allPath = Lists.newArrayList();
        if (root != null) {
            dfsFindPath(root, expectNum, allPath, eachPath);
        }
        return allPath;
    }

    private static void dfsFindPath(TreeNode root, int expectNum, List<Stack<Integer>> allPath, Stack<Integer> eachPath) {
        eachPath.push(root.value);
        if (root.left == null && root.right == null) {
            if (root.value == expectNum) {
                Stack<Integer> stack = (Stack<Integer>) eachPath.clone();
                allPath.add(stack);
            }
        }
        if (root.left != null) {
            dfsFindPath(root.left, expectNum - root.value, allPath, eachPath);
        }
        if (root.right != null) {
            dfsFindPath(root.right, expectNum - root.value, allPath, eachPath);
        }
        eachPath.pop();
    }
}
