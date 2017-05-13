package com.raksit.assignment4.invoices;

import java.util.Collection;

public interface InvoiceCollectorGateway {
	
	void collectInvoices(Collection<Invoice> invoices);
}
