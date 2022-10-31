package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {

	public static void main(String[] args) {
		
		Product[] products = new Product[3];
		
		products[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		products[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		products[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		for(Product p : products) {
			System.out.println(p.information());
		}
		System.out.println("==============================================================");
		
		for(Product p : products) {
			p.setPrice(120000);
			p.setTax(0.05);
			System.out.println(p.information());
		}
		
		System.out.println("==============================================================");
		
		/*
		for(Product p : products) {
			System.out.println("상품명 = " + p.getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(p.getPrice() + p.getPrice() * p.getTax()));
		}
		*/
		
		for(int i=0; i<products.length; i++) {
			System.out.println("상품명 = " + products[i].getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(products[i].getPrice() + products[i].getPrice() * products[i].getTax()));
		}

	}

}
