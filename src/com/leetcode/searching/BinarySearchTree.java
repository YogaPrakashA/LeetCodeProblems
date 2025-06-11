package com.leetcode.searching;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] arr = {10, 15, 30, 40, 50, 60, 70, 77, 80, 90};
        int target = 15;
        System.out.println(binarySearchTree(arr, target));
    }

    private static int binarySearchTree(int[] arr, int target) {
        int arrLen = arr.length;

        if (arrLen == 0) return -1;
        int left = 0;
        int right = arrLen - 1;

        while (left <= right) {

            int mid =left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else if (arr[mid] > target)
                right = mid - 1;
            }

        return -1;

    }
}
