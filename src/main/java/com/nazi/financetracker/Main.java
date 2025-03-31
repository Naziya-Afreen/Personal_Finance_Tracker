package com.nazi.financetracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Transaction");
            System.out.println("2. View Transaction History");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    transactionService.addTransaction();
                    break;
                case 2:
                    transactionService.viewTransactionHistory();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
