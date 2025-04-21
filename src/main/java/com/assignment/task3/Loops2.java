package com.assignment.task3;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find it's factorial:");
        int num = sc.nextInt();
        int fact=1;
       for(int i=2;i<=num;i++){
           fact=fact*i;
        }
       System.out.print(num+"! = "+fact);

	}

}
