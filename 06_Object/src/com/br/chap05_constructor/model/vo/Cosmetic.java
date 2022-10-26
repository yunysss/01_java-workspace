package com.br.chap05_constructor.model.vo;

public class Cosmetic {
	
	private String cName;
	private int price;
	private String brand;
	private String category;
	private String[] ingredient;
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
	
	public String getcName() {
		return cName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String[] getIngredient() {
		return ingredient;
	}
	
	public String information() {
		return "cName : " + cName + ", price : " + price + ", brand : " + brand + ", category : " + category + ", ingredient : " + ingredient;
	}

}
