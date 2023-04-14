package com.exercicio07.solid;
public class PaymentValidation {
	
	public static void creditCardValidation(CreditCardPaymentInfo creditCardinfo) {
		if (null == creditCardinfo.getCardHolderName() || null == creditCardinfo.getCardNumber()
				|| null == creditCardinfo.getCvv() || null == creditCardinfo.getExpirationDate()
						|| null == creditCardinfo.getInstallments()) {
			throw new RuntimeException("Invalid Fields To Credit Card Payment");
		}
	}

	public static void boletoValidation(String barCode) {
		if (null == barCode) {
			throw new RuntimeException("Invalid Fields To Boleto Payment");
		}
	}

	public static void pixValidation(String pixKey) {
		if (null == pixKey) {
			throw new RuntimeException("Invalid Fields To Pix Payment");
		}
	}

}
