package com.hw3.model.vo;

public class Product {
	
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public Product() {
		
	}
	
	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;		
	}
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
	
	public String information() {
		return pId + ", " + pName + ", " + price + ", " + tax;
	}

}
