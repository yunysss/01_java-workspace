package com.br.chap02_inherit.model.vo;

public class Ship extends Vehicle {

	private int propeller;
	
	public Ship() {}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	public String information() {
		return super.information() + ", propeller : " + propeller;
	}
}
