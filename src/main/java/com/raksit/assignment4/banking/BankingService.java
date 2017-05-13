package com.raksit.assignment4.banking;

public interface BankingService {
	
	void pay(Payment payment) throws PaymentException;
}
