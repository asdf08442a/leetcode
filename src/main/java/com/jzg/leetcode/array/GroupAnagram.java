package com.jzg.leetcode.array;

import java.util.*;

/**
 * 字母异位词分组
 */
public class GroupAnagram {

    public static void main(String[] args) {
        String[] s = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(s));
    }


    static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> ansMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = ansMap.getOrDefault(key, new ArrayList<>());
            list.add(str);
            ansMap.put(key, list);
        }
        return new ArrayList<>(ansMap.values());
    }

}
