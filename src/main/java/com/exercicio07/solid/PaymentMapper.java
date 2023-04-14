package com.exercicio07.solid;
public class PaymentMapper {
	public static PaymentEntity mapperToEntity(PaymentRequest request) {
        PaymentEntity payment = new PaymentEntity();

        payment.setAddres(request.getAddres());
        payment.setCpf(request.getCpf());
        payment.setValue(request.getValue());
        payment.setType(request.getPaymentType().toString());

        if (PaymentType.CREDIT_CARD == request.getPaymentType()) {
            CreditCardPaymentInfo creditInfos = request.getCreditCardPaymentInfo();

            payment.setCardHolderNumber(creditInfos.getCardHolderName());
            payment.setCardNumber(creditInfos.getCardNumber());
            payment.setCardExpiration(creditInfos.getExpirationDate());
            payment.setCardCvv(creditInfos.getCvv());
            payment.setInstallments(creditInfos.getInstallments());
        } else if (PaymentType.BOLETO == request.getPaymentType()) {

            payment.setBarCode(request.getCashPaymentInfo().getBarCode());
        } else if (PaymentType.PIX == request.getPaymentType()) {

            payment.setPixKey(request.getCashPaymentInfo().getPixKey());
        }

        return payment;
    }
}
