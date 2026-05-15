package com.flm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String model;
	private Double price;
	private Long quantity;
	
	public Product(String name, String model, Double price, Long quantity) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}
}
