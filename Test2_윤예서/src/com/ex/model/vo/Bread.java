package com.ex.model.vo;

public class Bread {
	
	private String breadName;
	private String brand;
	private int price;
	private int stock;
	
	public Bread() {
		
	}
	
	public Bread(String breadName, String brand, int price, int stock) {
		this.breadName = breadName;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	
	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getBreadName() {
		return breadName;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public String information() {
		return breadName + ", " + brand + ", " + price + ", " + stock;
	}

}
