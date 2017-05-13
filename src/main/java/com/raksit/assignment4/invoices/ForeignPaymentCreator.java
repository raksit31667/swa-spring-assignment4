package com.raksit.assignment4.invoices;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.raksit.assignment4.banking.Payment;
import com.raksit.assignment4.banking.PaymentCreator;
import com.raksit.assignment4.banking.PaymentException;

@Component
public class ForeignPaymentCreator implements PaymentCreator {
	
	private static final String CURRENT_IBAN_ACC = "current-iban-acc";
	
	@Transformer
	@Override
	public Payment createPayment(Invoice invoice) throws PaymentException {
		
		if(null == invoice.getIban()) {
			throw new PaymentException("IBAN mustn't be null when creating foreign payment!");
		}
		
		return new Payment(CURRENT_IBAN_ACC, invoice.getAccount(), invoice.getDollars());
	}
}
