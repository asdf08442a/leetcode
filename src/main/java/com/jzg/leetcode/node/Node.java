package com.jzg.leetcode.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jinzg
 * @date 2021/1/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {

    public Node next;
    public int value;
}
