package com.demo.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="produc_table")
public class Product {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prodId;
	private String prodName;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Customer customer;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn
	private List<Review> review=new ArrayList<>();
	
	public Product() {
	}
	public Product(String prodName) {
		this.prodName = prodName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", review=" + review + "]";
	}
}