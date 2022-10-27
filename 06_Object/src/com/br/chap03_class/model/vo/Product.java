package com.br.chap03_class.model.vo;

public class Product {
	// 클래스 선언구문에 작성가능한 접근제한자 (public, default)
	//                                      접근제한자 생략
	// public으로 하면 같은 패키지 내에서든 다른 패키지에서든 해당 클래스를 사용 가능
	// default으로 하면 같은 패키지 내에서만 사용 가능 (다른 패키지에서는 사용 불가)
	
	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자
	public Product() {
		
	}
	
	// 매개변수생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	/*
	public void setPName(String pName) {
				setPname
	}
	*/
	
	public void setpName(String pName) { // 메소드명 주의!
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName + ", " + price + ", " + brand;
	}
}
