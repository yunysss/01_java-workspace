package com.br.chap01_beforeVSafter.after.model.vo;

//			   자식 	   --->	   부모
//			   후손			   조상
//			   하위			   상위
//			   this			  super
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super. 으로 부모에 접근 가능 (단, private은 접근 불가)
		
		// 해결방법1. 부모클래스에 필드들 protected 접근제한자로 수정
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter메소드 활용 (public이기 때문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모생성자 호출
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
				
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne() {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의
	public String information() {
		//return "브랜드명 : " + super.getBrand() + ", 상품코드 : " + super.getpCode()
		return super.information() + ", 일체여부 : " + allInOne;	
	}
	

}
