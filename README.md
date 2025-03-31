Personal Finance Tracker

Overview

Personal Finance Tracker is a console-based application built using Java, JDBC, and MySQL to help users manage their expenses, income, and budget effectively. This project aims to provide an easy-to-use financial tracking system for personal use.

Features

Add, update, and delete transactions (income & expenses)

Categorize transactions

View monthly/weekly summaries

Track balance and generate reports

Secure data storage using MySQL

Technologies Used

Java (Core functionality)

JDBC (Database connectivity)

MySQL (Data storage)

Installation & Setup

Prerequisites

Ensure you have the following installed:

Java JDK 11+

MySQL Server

MySQL Connector/J

Steps to Set Up

Clone the repository:

git clone https://github.com/Naziya-Afreen/Personal_Finance_Tracker
cd personal-finance-tracker

Set up the MySQL database:

Create a database:

CREATE DATABASE finance_tracker;

Import the schema from schema.sql (if provided)

Update database credentials in DatabaseConfig.java:

private static final String URL = "jdbc:mysql://localhost:3306/finance_tracker";
private static final String USER = "your_username";
private static final String PASSWORD = "your_password";

Compile and run the project:

javac Main.java
java Main

Usage

Run the application and follow the on-screen prompts to manage finances.

Use the menu options to add, update, view, or delete transactions.
