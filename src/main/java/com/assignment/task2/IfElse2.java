package com.assignment.task2;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = sc.next().charAt(0);
        if( ch >='A' && ch <='Z' || ch >='a' && ch <= 'z'){
            System.out.println("Its a character");
        }else {
            System.out.println("Its not  a character");
        }

	}

}
