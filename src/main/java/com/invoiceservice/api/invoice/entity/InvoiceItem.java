package com.invoiceservice.api.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceItem {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	@Column(name = "id_item")
	private Integer idItem;
	
	@Column(name = "id_invoice")
	private Integer idInvoice;
	
	@JsonProperty("quantity")
	@NotNull(message="quantity is required!")
	private Integer quantity;
	
	@JsonProperty("subtotal")
	@NotNull(message="subtotal is required!")
	private Double subtotal;
	
	@JsonProperty("taxes")
	@NotNull(message="taxes are required!")
	private Double taxes;
	
	@Column(name = "id_product")
	@JsonProperty("id_product")
	@NotNull(message="product id is required!")
	private Integer idProduct;
}
