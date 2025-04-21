package com.assignment.task2;

import java.util.Scanner;

public class IfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks = sc.nextInt();
        
        calculateGrade(marks);
	}
	public static void calculateGrade(int marks) {
		if (marks > 90) {
            System.out.println("A");
        }else if (marks >75 && marks <=90){
            System.out.println("B");
        }else if(marks >65 && marks <=75){
            System.out.println("C");
        }else{
            System.out.println("fail");
        }
	}

}
