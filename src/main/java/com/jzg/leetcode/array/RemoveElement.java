package com.jzg.leetcode.array;

/**
 * 移除元素
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1}, 1));
    }


    static int removeElement(int[] nums, int n) {
        if(nums.length == 0){
            return 0;
        }
        int left = 0, right = nums.length-1;
        while(left < right){
            if(nums[left] == n){
                nums[left] = nums[right];
                right--;
            }else{
                left++;
            }
        }
        if(nums[left] == n){
            return left;
        }
        return left+1;
    }
}
