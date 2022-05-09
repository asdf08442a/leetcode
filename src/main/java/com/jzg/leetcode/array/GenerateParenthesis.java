package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }


    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int left = n, right = n;
        dfs(n, left, right, result, "");
        return result;
    }

    private static void dfs(int n, int left, int right, List<String> result, String s) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            dfs(n, left - 1, right, result, s + "(");
        }
        if (right > 0) {
            dfs(n, left, right - 1, result, s + ")");
        }
    }

}
