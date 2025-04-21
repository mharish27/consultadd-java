package com.assignment.task2;

import java.util.Scanner;

public class IfElse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the first num:");
        int num1 = sc.nextInt();
        System.out.print("enter the second num:");
        int num2 = sc.nextInt();
        System.out.print("enter the operator:");
        char operator = sc.next().charAt(0);
        
        int result = calculator(num1, num2, operator);
        System.out.println("Result is: " + result);
	}
	
	public static int calculator(int num1, int num2, char operator) {
		int result = 0;
		switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;

        default:
            System.out.println("not a valid operator");
		}
		return result;
	}

}
