package com.jzg.leetcode.array;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 获取最长子串
 */
public class GetMaxSub {

    public static void main(String[] args) {
        System.out.println(getMaxSub("abdca"));
        System.out.println(getMaxSub("aaaaa"));
        System.out.println(getMaxSub("aabaa"));
    }

    static int getMaxSub(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int maxLen = 0;
        Map<Character, Integer> map = Maps.newHashMap();
        int start = -1, end = 0;
        for (; end < s.length(); end++) {
            char curr = s.charAt(end);
            if (map.containsKey(curr)) {
                start = Math.max(start, map.get(curr));
            }
            maxLen = Math.max(maxLen, end - start);
            map.put(curr, end);
        }
        return maxLen;

    }
}
