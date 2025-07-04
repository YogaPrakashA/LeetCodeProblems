package com.leetcode.pattern;

import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Pattern2 {

    /*
    * need to print star symbol which number we missing
    *
    * */
    public static void main(String[] args) {
        int input = 100;

        for (int i = 1; i <= input; i++) {

            if (i == 100 || i == 44 || i == 10 || i == 23)
                System.out.print("*" + " ");
            else
                System.out.print(i + " ");

            if (i % 10 == 0)
                System.out.println();
        }
    }
}
