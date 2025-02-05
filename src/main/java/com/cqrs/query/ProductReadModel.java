package com.cqrs.query;

import jakarta.persistence.*;

@Entity
@Table(name = "product_read_model")
public class ProductReadModel {
    @Id
    private Long id;
    private String name;
    private double price;
	
    public ProductReadModel() {
		super();
	}

	public ProductReadModel(Long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
    
   
}

