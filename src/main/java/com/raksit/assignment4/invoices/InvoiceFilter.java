package com.raksit.assignment4.invoices;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceFilter {

	public static final int LOW_ENOUGH_THRESHOLD = 10000;
	
	@Filter
	public boolean accept(Invoice invoice) {
		boolean lowEnough = invoice.getDollars().intValue() < LOW_ENOUGH_THRESHOLD;
		
		System.out.println("Amount of $" + invoice.getDollars()
		+ (lowEnough ? " can" : " cannot") + " be automatically processed by the system.");
		
		return lowEnough;
	}
}
