package com.jzg.leetcode.array;

import java.util.Arrays;

/**
 * 数组交集
 */
public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }


    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0, index1 = 0, index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if(nums1[index1] == nums2[index2]){
                if(index == 0 || (index > 0 && nums1[index1] != nums[index-1])){
                    nums[index] = nums1[index1];
                    index++;
                }
                index1++;
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        return Arrays.copyOf(nums, index);
    }

}
