package com.exercicio02.solid;

import java.math.BigDecimal;

public interface TransactionStrategy {
    void doTransaction(Account account, BigDecimal cashValue);
}
