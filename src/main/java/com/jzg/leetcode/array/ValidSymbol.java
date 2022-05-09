package com.jzg.leetcode.array;

import java.util.Stack;

/**
 * 有效的括号
 */
public class ValidSymbol {

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }


    static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(')');
            } else if ('[' == s.charAt(i)) {
                stack.push(']');
            } else if ('{' == s.charAt(i)) {
                stack.push('}');
            } else if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

}
