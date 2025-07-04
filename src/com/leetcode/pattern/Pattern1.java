package com.leetcode.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int height = 10;

        for(int i = 1; i<=height; i++){
            for(int j = 1; j <= i*i; j++){
                if(j%i == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}
