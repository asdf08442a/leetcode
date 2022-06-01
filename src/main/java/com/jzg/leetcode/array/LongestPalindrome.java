package com.jzg.leetcode.array;

/**
 * 最长回文字串
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("ab"));
    }

    static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        boolean[][] d = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            d[i][i] = true;
        }

        int maxLen = 1;
        int begin = 0;
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    d[i][j] = false;
                } else {
                    if (j - i < 3) {
                        d[i][j] = true;
                    } else {
                        d[i][j] = d[i + 1][j - 1];
                    }
                }
                if (d[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }
}
