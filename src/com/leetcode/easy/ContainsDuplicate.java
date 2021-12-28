package com.leetcode.easy;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String x[]) {
        boolean containsDuplicate = containsDuplicate(new int[]{1, 4, 5, 5, 6});
        System.out.println("Contains duplicate : " + containsDuplicate);

    }

    private static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                return true;
            } else {
                count.put(nums[i], true);
            }
        }
        return false;
    }
}
