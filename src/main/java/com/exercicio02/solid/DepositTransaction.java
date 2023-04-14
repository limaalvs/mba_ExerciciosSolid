package com.exercicio02.solid;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DepositTransaction implements TransactionStrategy {
    @Override
    public void doTransaction(Account account, BigDecimal cashValue) {
        BigDecimal taxPercentageValue = cashValue
                .multiply(BigDecimal.valueOf(0.05))
                .divide(new BigDecimal(100), RoundingMode.HALF_DOWN);

        cashValue = cashValue.add(taxPercentageValue);
        account.addMoney(cashValue);
    }
}
