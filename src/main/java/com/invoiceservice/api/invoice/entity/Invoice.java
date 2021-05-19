package com.invoiceservice.api.invoice.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Invoice {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	@Column(name = "id_invoice")
	private Integer idInvoice;
	
	@Column(name = "invoice_code")
	@JsonProperty("invoice_code")
	@NotNull(message="invoice code is required!")
	private Integer invoiceCode;
	
	@Column(name = "customer_code")
	@JsonProperty("customer_code")
	@NotNull(message="customer code is required!")
	private Integer customerCode;

	@JsonProperty("subtotal")
	@NotNull(message="subtotal is required!")
	private Double subtotal;
	
	@JsonProperty("taxes")
	@NotNull(message="taxes are required!")
	private Double taxes;
	
	@Column(name = "created_at")
	@JsonProperty("created_at")
	@NotNull(message="creation date is required!")
	private LocalDate createdAt;
	
	@NotNull(message="status is required!")
	private Integer status;
	
	@JsonProperty("invoice_items")
	@NotNull(message="invoice items are required!")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_invoice")
	private List<InvoiceItem> invoiceItems;
}
