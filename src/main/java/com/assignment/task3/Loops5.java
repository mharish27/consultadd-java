package com.assignment.task3;

import java.util.Scanner;

public class Loops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter number to get the sum of first n positive numbers:");
        int num = sc.nextInt();
        
        int sumFirstNPositive = sumOfFirstNPositiveNumbers(num);
        System.out.println("sum of first " + num + " positive numbers = " + sumFirstNPositive);
	}

	private static int sumOfFirstNPositiveNumbers(int num) {
		// TODO Auto-generated method stub
		int sumFirstNPositive = 0;
		for(int i=1; i<=num; i++) {
			sumFirstNPositive += 2*i;
		}
		return sumFirstNPositive;
	}

}
