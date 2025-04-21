package com.assignment.task2;

import java.util.Scanner;

public class IfElse7 {
	public static void main(String[] args) {
		while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            double num = sc.nextDouble();
            if (num < 0) {

                System.out.println("its over");
                break;

            } else if (num > 0) {
                System.out.println("good going");
                continue;
            }else {
                System.out.println("you entered zero");
            }
        }
	}
}
