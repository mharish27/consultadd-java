package com.assignment.task1;

import java.util.Scanner;

public class Basic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double radius = sc.nextInt();
		
		double area = 3.14 * radius * radius;
		System.out.print("area of the circle: " + area);
	}

}
