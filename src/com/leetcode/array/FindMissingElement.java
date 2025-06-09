package com.leetcode.array;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int lastElementOfArray = nums[nums.length - 1];
        System.out.println(findMissingElement(nums, lastElementOfArray));

    }

    private static int findMissingElement(int[] nums, int lastElementOfArray) {
        int sumOfNums = 0;
        for (int arr : nums)
            sumOfNums += arr;

        int missingNum = lastElementOfArray * (lastElementOfArray + 1) / 2;

        missingNum = missingNum - sumOfNums;

        return missingNum == 0 ? lastElementOfArray + 1 : missingNum;


    }
}
