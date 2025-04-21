package com.assignment.task3;

import java.util.Scanner;

public class Loops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;
        char choice;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("Enter a number to play a game:");
        do{
            num = sc.nextInt();
            if(num<min){
                min = num;
            }if(num>max){
                max= num;
            }
            System.out.print("do u want to enter another num? y/n");
            choice = sc.next().charAt(0);
        }while (choice =='y'|| choice == 'Y');
        System.out.println("Smallest num = "+ min);
        System.out.println("Largest num = "+ max);

	}

}
