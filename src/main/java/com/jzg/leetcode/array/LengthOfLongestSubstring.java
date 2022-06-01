package com.jzg.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 有效的括号
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring1(s));
    }


    static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> characterSet = new HashSet<>();
            characterSet.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (characterSet.contains(s.charAt(j))) {
                    break;
                }
                characterSet.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, characterSet.size());
        }
        return maxLength;
    }

    static int lengthOfLongestSubstring1(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> characterMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.containsKey(s.charAt(i))) {
                left = Math.max(left, characterMap.get(s.charAt(i)) + 1);
            }
            characterMap.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

}
