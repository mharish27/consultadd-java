package com.assignment.task4;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        
        for(int i=0;i<size;i++){
            System.out.print("enter " + (i+1 )+ " element:" );
             array[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
        }
	}

}
