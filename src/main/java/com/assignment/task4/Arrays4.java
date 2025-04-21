package com.assignment.task4;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={23, 67, 34, 99, 75, 11, 90};
        int n = 67;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;
        
        while(left<right) {
            int mid = left + (right - left) / 2;
            
            if(n==nums[mid]){
            	found=true;
            	break;
            }
            else if (n <nums[mid]){
            	right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        if(found){
            System.out.print(n + " is present in the array");
        }else{
            System.out.print(n + " is not present in the array");
        }
	}
}
