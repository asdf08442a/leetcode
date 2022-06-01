package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码的字母组合
 */
public class LettersCombination {

    public static void main(String[] args) {
        System.out.println(lettersCombination("23"));
    }

    static List<String> lettersCombination(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backTracking(digits, phoneMap, ans, 0, new StringBuilder());
        return ans;
    }

    private static void backTracking(String digits, Map<Character, String> phoneMap, List<String> ans, int index, StringBuilder str) {
        if (str.length() == digits.length()) {
            ans.add(str.toString());
        } else {
            String letters = phoneMap.get(digits.charAt(index));
            for (int j = 0; j < letters.length(); j++) {
                str.append(letters.charAt(j));
                backTracking(digits, phoneMap, ans, index + 1, str);
                str.deleteCharAt(index);
            }
        }
    }
}
