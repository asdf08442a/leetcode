package com.jzg.leetcode.array;

/**
 * 最大利润
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] nums = {7,6,5};
        System.out.println(maxProfit(nums));
    }


    static int maxProfit(int[] nums) {
        int min = nums[0], max = nums[0], minPosition = 0, profit = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                max = nums[i];
                minPosition = i;
            }else if(nums[i] > max && i > minPosition){
                max = nums[i];
                if(max - min > profit){
                    profit = max - min;
                }
            }
        }
        return profit;
    }

}
