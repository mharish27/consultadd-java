package com.assignment.task3;

import java.util.Scanner;

public class Loops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter number and check if it is a prime number:");
        int num = sc.nextInt();
        

        if (checkForPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

	}

	private static boolean checkForPrime(int num) {
		// TODO Auto-generated method stub
        if (num <= 1) return false;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
		return true;
	}

}
