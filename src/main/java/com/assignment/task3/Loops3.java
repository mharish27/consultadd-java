package com.assignment.task3;

import java.util.Scanner;

public class Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check if it is palindrome:");
        int num = sc.nextInt();
        if(checkIfPalindrome(num)) {
        	System.out.println(num + " is a Palindrome");
        }else {
        	System.out.println(num + " is not a Palindrome");
        }
	}

	private static boolean checkIfPalindrome(int num) {
		// TODO Auto-generated method stub
		int reverseNumber = 0;
		int number = num;
		while(num > 0) {
			int lastDigit = num % 10;
			num = num/10;
			reverseNumber = reverseNumber * 10 + lastDigit;
		}
		return (reverseNumber == number);
	}

}
