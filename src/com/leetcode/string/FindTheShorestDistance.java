package com.leetcode.string;

import java.util.Arrays;

public class FindTheShorestDistance {
    /*
        find the shortest distance from each character in string
        input  = "loveleetcode"   "e"
     */
    public static void main(String[] args) {
            String s1 = "loveleetcode";
            Character  target = 'e';

            System.out.println(Arrays.toString(shortestDistance(s1, target)));
    }

    private static  int[] shortestDistance(String word1, Character target) {

            int len1 = word1.length();
            int[] result = new int[len1-1];

            int prev = Integer.MIN_VALUE/2;

            for (int i = 0; i < len1; i++) {
                if (word1.charAt(i) == target) {
                    prev = i;
                }
                result[i] = i-prev;
            }

            for (int i = len1-1; i >= 0; i--) {
                if (word1.charAt(i) == target) {
                    prev = i;
                }
                result[i] = Math.min(result[i], prev-i);

            }

            return result;


    }


}
