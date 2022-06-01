package com.jzg.leetcode.treeNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jinzg
 * @date 2021/2/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public int value;
}
