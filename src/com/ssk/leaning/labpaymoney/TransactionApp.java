package com.ssk.leaning.labpaymoney;

import java.util.Scanner;

import com.ssk.leaning.lab.service.TransactionServices;

public class TransactionApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int sizeOfTransaction = scanner.nextInt();
		int[] transactionArray = new int[sizeOfTransaction];
		
		System.out.println("Enter the value of transation array");
		
		for(int i = 0; i < sizeOfTransaction; i++) {
			transactionArray[i] = scanner.nextInt();
		}
		System.out.println("Enter the total number of target that need to be achieved ");
		int numberOfTarget = scanner.nextInt();
		TransactionServices transactionService = new TransactionServices(); 
		transactionService.transactionCounter(transactionArray, numberOfTarget);
	}
}
