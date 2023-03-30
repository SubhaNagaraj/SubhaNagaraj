package com.ecom.shop.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentRepo;
	
	
	public PaymentEntity addAll(PaymentEntity payment) {
			
		return paymentRepo.save(payment);
	}


	public Iterable<PaymentEntity> fetchAllRecords() {
		
		return paymentRepo.findAll();
	}

}
