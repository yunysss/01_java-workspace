package com.br.chap02_objectArray.model.vo;

public class Phone {
	
	private String name;
	private String brand;
	private int price;
	private String series;
	
	public Phone() {
		
	}
	
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getSeries() {
		return series;
	}
	
	public String information() {
		return name + ", " + brand + ", " + price + ", " + series;
	}

}
