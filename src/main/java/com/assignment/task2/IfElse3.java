package com.assignment.task2;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a dividend: ");
		int dividend = sc.nextInt();
		
		System.out.print("Enter a dividend: ");
		int divisor = sc.nextInt();
		calculate(dividend, divisor);
	}
	
	public static void calculate(int dividend, int divisor) {
		double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        System.out.println("quotient: " + quotient + "," + "remainder: " + remainder);
	}

}
