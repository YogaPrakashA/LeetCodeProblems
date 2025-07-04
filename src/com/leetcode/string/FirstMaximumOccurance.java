package com.leetcode.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstMaximumOccurance {
    public static void main(String[] args) {
        String str = "occurance";
       // System.out.println(firstMaximumOccurance(str));
    }

//    private static HashMap<Character, Integer> firstMaximumOccurance(String words) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < words.length(); i++) {
//            map.put(words.charAt(i), map.getOrDefault(words.charAt(i), 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1)
//                return map1.put(entry.getKey(), entry.getValue());
//        }
//
//        return map1;
//    }
}
