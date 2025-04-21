package com.assignment.task2;

import java.util.Scanner;

public class IfElse4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a dividend: ");
		int year = sc.nextInt();
		
		leapYearCheck(year);
	}
	
	public static void leapYearCheck(int year) {
		if ((year % 4 != 0 || year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " "+"is not a leap year");
        } else {
            System.out.println(year + " "+"is a leap year");
        }
	}

}
