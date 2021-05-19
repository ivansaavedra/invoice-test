package com.invoiceservice.api.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoiceservice.api.invoice.entity.Invoice;

@Repository
public interface RepoInvoice extends JpaRepository<Invoice, Integer> {

}
