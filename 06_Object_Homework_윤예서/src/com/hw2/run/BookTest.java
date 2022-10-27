package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("=============================");
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		System.out.println(b1.information());
		System.out.println("=============================");
		
		System.out.println("도서명 = " + b1.getTitle());
		System.out.println("할인된 가격 = " + (b1.getPrice() - (int)(b1.getPrice() * b1.getDiscountRate())) + "원");
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " + (b2.getPrice() - (int)(b2.getPrice() * b2.getDiscountRate())) + "원");
		

	}

}
