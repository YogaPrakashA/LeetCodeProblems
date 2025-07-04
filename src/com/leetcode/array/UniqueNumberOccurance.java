package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 3};
        System.out.println(uniqueNumberOccurance(arr));
    }

    private static Boolean uniqueNumberOccurance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}
