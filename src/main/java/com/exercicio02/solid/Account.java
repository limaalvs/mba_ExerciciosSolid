package com.exercicio02.solid;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = new BigDecimal("1000");

    public void addMoney(BigDecimal money) {
        this.balance = this.balance.add(money);
    }

    public void removeMoney(BigDecimal money) {
        this.balance = this.balance.subtract(money);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void doTransaction(TransactionStrategy strategy, BigDecimal cashValue) {
        strategy.doTransaction(this, cashValue);
    }
}
