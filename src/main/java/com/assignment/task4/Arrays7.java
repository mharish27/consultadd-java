package com.assignment.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));

	}
	
	public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        int[] result = new int[n];
        int j = 0; 

        for (int i = 0; i < n; ) {
            result[j++] = arr[i];
            int current = arr[i];
            while (i < n && arr[i] == current) {
                i++;
            }
        }

        return result;
    }

}
