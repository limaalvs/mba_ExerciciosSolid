package com.exercicio02.solid;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SellTransaction implements TransactionStrategy {

    @Override
    public void doTransaction(Account account, BigDecimal cashValue) {
        BigDecimal taxPercentageValue = cashValue
                .multiply(BigDecimal.valueOf(0.1))
                .divide(new BigDecimal(100), RoundingMode.HALF_DOWN);

        cashValue = cashValue.add(taxPercentageValue.negate());
        account.addMoney(cashValue);
    }
}
