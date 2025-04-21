package com.assignment.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programming11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,0,1,1,1};
        int target = 3;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        int currSum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        System.out.println("Subarrays with sum " + target + ":");
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (map.containsKey(currSum - target)) {
                for (int start : map.get(currSum - target)) {
                    found = true;
                    System.out.print("Subarray: [");
                    for (int k = start + 1; k <= i; k++) {
                        System.out.print(nums[k] + (k < i ? ", " : ""));
                    }
                    System.out.println("]");
                }
            }

            map.putIfAbsent(currSum, new ArrayList<>());
            map.get(currSum).add(i);
        }

        if (!found) {
            System.out.println("No subarray found.");
        }
	}

}
