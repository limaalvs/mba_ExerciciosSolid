package com.exercicio07.solid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public void processPayment(PaymentRequest request) {
		validadeOperationFields(request);
		repository.save(PaymentMapper.mapperToEntity(request));
	}

	public List<PaymentEntity> getAllPayments() {
		return repository.findAll();
	}

	private void validadeOperationFields(PaymentRequest request) {

		if (PaymentType.CREDIT_CARD.equals(request.getPaymentType())) {

			PaymentValidation.creditCardValidation(request.getCreditCardPaymentInfo());
		} else if (PaymentType.BOLETO.equals(request.getPaymentType())) {

			PaymentValidation.boletoValidation(request.getCashPaymentInfo().getBarCode());
		} else if (PaymentType.PIX.equals(request.getPaymentType())) {

			PaymentValidation.pixValidation(request.getCashPaymentInfo().getPixKey());
		}

	}
}
