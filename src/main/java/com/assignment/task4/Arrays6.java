package com.assignment.task4;

import java.util.HashSet;
import java.util.Set;

public class Arrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,4,5,6};
        int target=6;
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            int complement = target - num;
            if(set.contains(complement)){
                System.out.println(num + "," + complement);
            }
            set.add(num);
        }

	}

}
