package com.jzg.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 有效的括号
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "bbbb";
        System.out.println(lengthOfLongestSubstring(s));
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

}
