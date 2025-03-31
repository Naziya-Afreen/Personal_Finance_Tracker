package com.nazi.financetracker;

import java.util.Date;

public class Transaction {
    private int id;
    private String type; // Income or Expense
    private double amount;
    private String category;
    private Date date;

    public Transaction(int id, String type, double amount, String category, Date date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public Date getDate() { return date; }
}
