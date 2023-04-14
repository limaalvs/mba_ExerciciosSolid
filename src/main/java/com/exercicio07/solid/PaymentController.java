package com.exercicio07.solid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentService service; 
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createPayment(@RequestBody PaymentRequest request) {
		service.processPayment(request);
	}
	
	
	@GetMapping
	public  List<PaymentEntity> getAllPayments() {
		return service.getAllPayments();
	}

}
