package com.leetcode;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int input  = 1634;
        System.out.println(findArmstrongNumber(input));
    }

    public static boolean findArmstrongNumber(int n) {
        int temp = n;
        double sum = 0;
        int inputLength = String.valueOf(n).length();
        int left = 0;
        while (left < inputLength) {

            int digit  =  n %10;
             sum += Math.pow(digit,inputLength);
             n/=10;
            left++;
        }

        return sum == temp;


    }
}
