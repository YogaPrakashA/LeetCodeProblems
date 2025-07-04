package com.leetcode.pattern;

public class Pattern1 {

            /*
            input = 7
            Output =
            1
            2 4
            3 6 9
            4 8 12 16
            5 10 15 20 25
            6 12 18 24 30 36
            7 14 21 28 35 42 49*/
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
