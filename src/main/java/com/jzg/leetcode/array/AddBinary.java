package com.jzg.leetcode.array;

import java.util.Stack;

/**
 * 二进制数相加
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
    }

    static String addBinary(String a, String b) {
        Stack<Integer> ans = new Stack<>();
        int aLen = a.length(), bLen = b.length(), c = 0;
        while (aLen > 0 || bLen > 0 || c > 0) {
            int aNum = 0, bNum = 0;
            if (aLen > 0) {
                aNum = a.charAt(aLen - 1) - 48;
            }
            if (bLen > 0) {
                bNum = b.charAt(bLen - 1) - 48;
            }
            int sum = aNum + bNum + c;
            c = sum / 2;
            ans.add(sum % 2);
            aLen--;
            bLen--;
        }
        StringBuilder sb = new StringBuilder();
        while (!ans.isEmpty()) {
            sb.append(ans.pop());
        }
        return sb.toString();
    }
}
