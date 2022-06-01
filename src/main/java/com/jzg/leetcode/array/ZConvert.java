package com.jzg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * z字形变换
 */
public class ZConvert {

    public static void main(String[] args) {
        System.out.println(zconvert("PAYPALISHIRING", 3));
        System.out.println(zconvert("ab", 1));
    }

    static String zconvert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> stringBuilders = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            stringBuilders.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            stringBuilders.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : stringBuilders) {
            ans.append(sb);
        }
        return ans.toString();
    }
}
