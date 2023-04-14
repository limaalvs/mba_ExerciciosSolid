package com.exercicio02.solid;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        Account account = new Account();
        BigDecimal cashValue = new BigDecimal("500");

        // Buy
        TransactionStrategy buyTransaction = new BuyTransaction();
        account.doTransaction(buyTransaction, cashValue);
        System.out.println(" Buy Transaction:" + account.getBalance());


        //Sell
        TransactionStrategy sellTransaction = new SellTransaction();
        account.doTransaction(sellTransaction, cashValue);
        System.out.println(" Sell Transaction:" + account.getBalance());

        //Deposit
        TransactionStrategy depositTransaction = new DepositTransaction();
        account.doTransaction(depositTransaction, cashValue);
        System.out.println(" Deposit Transaction:" + account.getBalance());

        // Withdrawal
        TransactionStrategy withdrawalTransaction = new WithdrawalTransaction();
        account.doTransaction(withdrawalTransaction, cashValue);
        System.out.println(" Withdrawal Transaction:" + account.getBalance());

    }
}
