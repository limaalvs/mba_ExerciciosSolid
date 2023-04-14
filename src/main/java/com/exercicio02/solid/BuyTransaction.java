package com.exercicio02.solid;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BuyTransaction implements TransactionStrategy {

    @Override
    public void doTransaction(Account account, BigDecimal cashValue) {
        BigDecimal taxPercentageValue = cashValue
                .multiply(BigDecimal.valueOf(0.15))
                .divide(new BigDecimal(100), RoundingMode.HALF_DOWN);

        cashValue = cashValue.add(taxPercentageValue);
        account.removeMoney(cashValue);
    }
}
