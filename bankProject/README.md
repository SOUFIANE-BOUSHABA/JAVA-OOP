# Java Bank Account Management System

This Java project implements a simple bank account management system with two classes: `Account` and `SavingsAccount`. The `Account` class represents a generic bank account with basic functionalities like depositing and withdrawing funds, while the `SavingsAccount` class inherits from `Account` and can be extended with additional functionalities specific to savings accounts.

## Features

- Create a bank account with an initial balance
- Deposit funds into the account
- Withdraw funds from the account (if sufficient balance is available)

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Visual Studio Code (or any other Java IDE)

### Installation

1. Clone this repository to your local machine:
https://github.com/SOUFIANE-BOUSHABA/JAVA-OOP.git




## Usage

1. Create a `SavingsAccount` object by providing an initial balance.
2. Use the `deposit()` method to add funds to the account.
3. Use the `withdraw()` method to withdraw funds from the account (if sufficient balance is available).
4. Check the current balance using the `getBalance()` method.

Example usage:
```java
// Create a SavingsAccount object with an initial balance of 1000
SavingsAccount savingsAccount = new SavingsAccount(1000);

// Deposit 500 into the account
savingsAccount.deposit(500);

// Withdraw 200 from the account
savingsAccount.withdraw(200);

// Check the current balance
System.out.println("Current balance: " + savingsAccount.getBalance());
