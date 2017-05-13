package com.raksit.assignment4.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.raksit.assignment4.banking.BankingService;
import com.raksit.assignment4.banking.Payment;
import com.raksit.assignment4.banking.PaymentException;

@Component
public class PaymentProcessor {
	
	@Autowired
	BankingService bankingService;
	
	@ServiceActivator
	public void processPayment(Payment payment) throws PaymentException {
		bankingService.pay(payment);
	}
}
