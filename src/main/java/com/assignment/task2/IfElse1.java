package com.assignment.task2;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int number = sc.nextInt();
		
		if(number<0){
            System.out.println( "You entered a negative number");
        }else if(number>0) {
            System.out.println( "You entered a positive number");
        } else {
            System.out.println( "You entered 0");
        }
	}

}
