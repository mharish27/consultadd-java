package com.assignment.task4;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,20,33,11,67};
        double sum = 0;
        for(int num:nums){
            sum += num;
        }
        
        double average = sum/nums.length;
        
        System.out.print("The array is:");
        for(int num : nums) System.out.print(num + " ");
        System.out.print("\nThe average is:" + average);
	}

}
