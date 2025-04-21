package com.assignment.task2;

import java.util.Scanner;

public class IfElse9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your electricity units: ");
        int units = scanner.nextInt();

        double billAmount = 0;
        if (units <= 60) {
        	billAmount = units * 0.30;
        } else if (units <= 150) {
        	billAmount = (60 * 0.30) + ((units - 60) * 0.75);
        } else if (units <= 270) {
        	billAmount = (60 * 0.30) + (90 * 0.75) + ((units - 150) * 1.10);
        } else {
        	billAmount = (60 * 0.30) + (90 * 0.75) + (120 * 1.10) + ((units - 270) * 2.50);
        }

        double surcharge = billAmount * 0.20;
        double totalBill = billAmount + surcharge;

        System.out.println("Electricity Bill (before surcharge): " + billAmount);
        System.out.println("Surcharge (20%): " + surcharge);
        System.out.println("Total Electricity Bill: " + totalBill);
	}

}
