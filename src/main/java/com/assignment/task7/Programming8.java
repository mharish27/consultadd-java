package com.assignment.task7;

public class Programming8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4,12,0,24,56,32,45,90,100,200,120};
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num > max){
                max = num;
            }

        }
        System.out.print(max + " is max number in the array");
	}

}
