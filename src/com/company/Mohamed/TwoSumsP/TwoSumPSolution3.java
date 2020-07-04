package com.company.Mohamed.TwoSumsP;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPSolution3 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compelement = target - nums[i];
            if (map.containsKey(compelement) && map.get(compelement) != i) {
                return new int[]{i, map.get(compelement)};

            }
            map.put(nums[i], i);
        }


        throw new IllegalArgumentException("No two sum solution ");

    }
};
