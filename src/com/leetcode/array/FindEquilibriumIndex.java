package com.leetcode.array;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,5,8,2,3,1};
        System.out.println(findEquilibriumIndex(arr));

    }

    private static int findEquilibriumIndex(int[] nums) {

        int sumOfArray = 0;
        for(int arr : nums){
            sumOfArray += arr;
        }

        int leftSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sumOfArray -= nums[i];

            if(leftSum == sumOfArray)
                return i;

            leftSum += nums[i];

        }

    return -1;
    }
}
