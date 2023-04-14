package com.exercicio07.solid;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PaymentRequest {

    @JsonProperty("addres")
    private String addres;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("value")
    private BigDecimal value;
    @JsonProperty("paymentType")
    private PaymentType paymentType;
    @JsonProperty("creditCardPaymentInfo")
    private CreditCardPaymentInfo creditCardPaymentInfo;
    @JsonProperty("cashPaymentInfo")
    private CashPaymentInfo cashPaymentInfo;

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public CreditCardPaymentInfo getCreditCardPaymentInfo() {
        return creditCardPaymentInfo;
    }

    public void setCreditCardPaymentInfo(CreditCardPaymentInfo creditCardPaymentInfo) {
        this.creditCardPaymentInfo = creditCardPaymentInfo;
    }

    public CashPaymentInfo getCashPaymentInfo() {
        return cashPaymentInfo;
    }

    public void setCashPaymentInfo(CashPaymentInfo cashPaymentInfo) {
        this.cashPaymentInfo = cashPaymentInfo;
    }
}
