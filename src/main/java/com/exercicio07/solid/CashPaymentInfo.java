package com.exercicio07.solid;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class CashPaymentInfo {
    @JsonProperty("pixKey")
    private String pixKey;
    @JsonProperty("barCode")
    private String barCode;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
