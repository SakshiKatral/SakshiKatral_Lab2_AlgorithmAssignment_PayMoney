package com.ssk.leaning.lab.service;

import java.util.Scanner;

import com.ssk.leaning.labpaymoney.TransactionApp;

public class TransactionServices {
	public void transactionCounter(int[] transactionArray, int numberOfTarget) {
		while(numberOfTarget != 0) {
			int flag = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the target value");

			int target = scanner.nextInt();
			int sum = 0;
			for(int i = 0; i < numberOfTarget; i++) {
				sum = sum + transactionArray[i];
				if(sum >= target){
					System.out.println("Target achieved after " + (i+1) + " transactions");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Given target didn't achieved");
			}
			numberOfTarget --;
		}
	}
}