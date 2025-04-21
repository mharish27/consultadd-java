package com.assignment.task7;

import java.util.HashSet;
import java.util.Set;

public class Programming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6, 8, 7, 4, 0, 12};
        int[] arr2= {12, 8, 6, 1, 2, 3};

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        for( int num:arr){
            set.add(num);
        }
        
        for(int num:arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        
        System.out.print(intersection);
	}

}
