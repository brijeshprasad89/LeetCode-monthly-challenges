package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int sumOfUniqueElements = sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println("The sum of unique Elements is " + Arrays.stream(new int[]{1, 2, 3, 2}).distinct().sum());
    }

    static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        Arrays.stream(nums).distinct().sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!unique.containsKey(nums[i])) {
                sum = sum + nums[i];
                unique.put(nums[i], 0);
            }
        }
        return sum;
    }
}
