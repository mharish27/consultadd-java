package com.assignment.task1;

import java.util.Scanner;

public class Basic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = sc.nextInt();
		
		int sum = sum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}

}
