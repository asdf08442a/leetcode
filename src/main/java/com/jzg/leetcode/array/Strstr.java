package com.jzg.leetcode.array;

/**
 * 实现strstr
 */
public class Strstr {

    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issipi";
        System.out.println(strStr(hayStack, needle));
    }

    static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int l = 0, r = 0;
        int startIndex = -1;
        while (l < haystack.length() && r < needle.length()) {
            if (haystack.charAt(l) != needle.charAt(r)) {
                if (startIndex != -1) {
                    l = startIndex;
                }
                l++;
                startIndex = -1;
                r = 0;
            } else {
                if (startIndex == -1) {
                    startIndex = l;
                }
                l++;
                r++;
            }
        }
        if (r < needle.length()) {
            return -1;
        }
        return startIndex;
    }
}
