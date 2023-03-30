package com.ecom.shop.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	
	
	@GetMapping("/get")
	public Iterable<PaymentEntity> fetchAll()
	{
		return paymentService.fetchAllRecords();	
	}
	
	@PostMapping("/post")
    public PaymentEntity add(@RequestBody PaymentEntity payment )
    {
		return paymentService.addAll(payment);
    }
	

}
