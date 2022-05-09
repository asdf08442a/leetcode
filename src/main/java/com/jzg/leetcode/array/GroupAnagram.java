
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
        Map<String, List<String>> ansMap = new HashMap();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            if (ansMap.containsKey(sortStr)) {
                ansMap.get(sortStr).add(str);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                ansMap.put(sortStr, strings);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> strList : ansMap.values()) {
            result.add(strList);
        }
        return result;
    }

}
