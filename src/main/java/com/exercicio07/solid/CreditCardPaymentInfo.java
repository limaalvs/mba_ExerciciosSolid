package com.exercicio07.solid;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditCardPaymentInfo {
    @JsonProperty("cardHolderName")
    private String cardHolderName;
    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("cvv")
    private String cvv;
    @JsonProperty("installments")
    private Integer installments;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }
}
