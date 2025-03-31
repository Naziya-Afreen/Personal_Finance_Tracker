package com.nazi.financetracker;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransactionService {
    private TransactionDAO transactionDAO = new TransactionDAO();
    private Scanner scanner = new Scanner(System.in);

    public void addTransaction() {
        System.out.print("Enter type (Income/Expense): ");
        String type = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        Transaction transaction = new Transaction(0, type, amount, category, new Date());
        transactionDAO.addTransaction(transaction);
    }

    public void viewTransactionHistory() {
        List<Transaction> transactions = transactionDAO.getAllTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t.getType() + " | " + t.getAmount() + " | " + t.getCategory() + " | " + t.getDate());
            }
        }
    }
}

