package com.exercicio03.solid;

import java.math.BigDecimal;

public class BancoSaqueServiceApp {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaDepositoPrazoFixo contaDepositoPrazoFixo = new ContaDepositoPrazoFixo();

        contaCorrente.depositar(new BigDecimal("100"));
        contaCorrente.sacar(new BigDecimal("15"));

        contaPoupanca.depositar(new BigDecimal("400"));
        contaPoupanca.sacar(new BigDecimal("40"));

        contaDepositoPrazoFixo.depositar(new BigDecimal("900"));

    }
}
