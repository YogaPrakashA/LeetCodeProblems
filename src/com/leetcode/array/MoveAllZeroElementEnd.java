package com.leetcode.array;

import java.util.Arrays;

public class MoveAllZeroElementEnd {
    public static void main(String[] args) {
        int[] arr = {0,3,4,0,3,0,0,1,4,7,0};
        int[] arr1 = {2,0,0,0,0,9,1,0,0,0,0};

        System.out.println(Arrays.toString(moveAllZeroElementEnd(arr)));
        System.out.print(Arrays.toString(moveAllZeroElementEnd(arr1)));
    }

    private static int[] moveAllZeroElementEnd(int[] arr){
            int left = 0;
            int right = arr.length-1;

            while(left <= right){

                if(arr[left] == 0){
                    while(arr[right] == 0){
                        right--;
                    }

                    if(left < right){
                        arr[right]= arr[left]+arr[right];
                        arr[left] = arr[right]-arr[left];
                        arr[right] = arr[right]-arr[left];
                        right--;
                    }

                }
                left++;
            }
            return  arr;
    }
}
