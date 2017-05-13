package com.raksit.assignment4.banking;

import com.raksit.assignment4.invoices.Invoice;

public interface PaymentCreator {
	
	Payment createPayment(Invoice invoice) throws PaymentException;
}
