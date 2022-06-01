package com.jzg.leetcode.array;

import java.util.Objects;

/**
 * 最长公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] s = new String[]{"a"};
        System.out.println(longestCommonPrefix(s));
    }


    static String longestCommonPrefix(String[] strs) {
        int i = 0;
        String result = "";
        if (strs == null) {
            return result;
        }
        while (true) {
            if (Objects.equals(strs[0], "") || i > strs[0].length() - 1) {
                return result;
            }
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (i > s.length() - 1) {
                    return result;
                }
                if (c != s.charAt(i)) {
                    return result;
                }
            }
            result += c;
            i++;
        }
    }

}
