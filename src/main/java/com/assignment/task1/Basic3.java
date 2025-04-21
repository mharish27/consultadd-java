package com.assignment.task1;

import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("first number: " + num1 + "; second number: "
				+ num2);	
		swapWithTempVariable(num1, num2);
		swapWithoutTempVariable(num1, num2);
		
	}
	
	private static void swapWithTempVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Number after swapping using temp variable:");
		System.out.println("first number: " + a + "; second number: "
				+ b);
	}
	
	private static void swapWithoutTempVariable(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Number after swapping without using temp variable:");
		System.out.println("first number: " + a + "; second number: "
				+ b);
	}

}
