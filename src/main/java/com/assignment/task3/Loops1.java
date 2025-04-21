package com.assignment.task3;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("No of Fibnocci series number you want to print?");
        int num = sc.nextInt();
        int prev1=0;
        int prev2=1;
        System.out.print(prev1 +","+ prev2 + ",");
        for(int i=0;i<num;i++){
          int num3=prev1+prev2;
          prev1=prev2;
          prev2=num3;
          System.out.print(num3+",");
        }
	}

}
