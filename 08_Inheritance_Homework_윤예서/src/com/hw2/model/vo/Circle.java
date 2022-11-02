package com.hw2.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String draw() {
		double area = Math.PI * radius * radius;
		double circum = (Math.PI) * radius * 2;
		return super.draw() + "\n면적 : " + Math.round(area * 10d) / 10d + "\n둘레 : " + Math.round(circum * 10d) / 10d;
	}

}
