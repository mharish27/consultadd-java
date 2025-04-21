package com.assignment.task4;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter the number you want to search in the array:");
        int n = sc.nextInt();
        boolean isfound = false;
        
        for (int array : arr) {
            if (array == n) {
                isfound = true;
                break;
            }
        }
        
        if (isfound) {
            System.out.print( n + " is present in the array");
        }else{
            System.out.print(n + " is not present in the array");
        }

	}

}
