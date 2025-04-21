package com.assignment.task7;

import java.util.Scanner;

public class Programming5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to verify if its armstrong num:");
        int num = sc.nextInt();
        
        boolean isArmstrong = checkIfArmstrong(num);
        
        
        if(isArmstrong){
            System.out.print(num + " is an armstrong");
        }else {
            System.out.print(num + " is not an armstrong");
        }

	}

	private static boolean checkIfArmstrong(int num) {
		// TODO Auto-generated method stub
		int Digit = String.valueOf(num).length();
        int number = num;
        double result = 0;
        int digit;
        
        while (num > 0) {
            digit = num % 10;
            result = result + Math.pow(digit, Digit);
            num = num / 10;
        }
		
		return result == number;
	}

}
