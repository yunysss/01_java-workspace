package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Phone[] phones = new Phone[3]; // Phone 객체를 3개 담을 수 있는 배열을 만든것 뿐
		
		//phones[0].setName("아이폰");
		System.out.println(phones[0]);
		System.out.println(phones);
		
		phones[0] = new Phone();
		phones[0].setName("아이폰");
		phones[0].setBrand("사과");
		phones[0].setPrice(1400000);
		phones[0].setSeries("14pro");
		
		phones[1] = new Phone("은하수", "생송", 1200000, "s20");
		
		phones[2] = new Phone("벨벳폰", "헬지", 900000, "없음");
		
		int price = 0;
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());
			price += phones[i].getPrice();
		}
		
		// 총 가격, 평균가 출력
		System.out.println("총 가격 : " + price);
		System.out.println("평균가 : " + price / phones.length);
		
		// 사용자에게 구매하고자하는 핸드폰명 입력받기
		// 해당 핸드폰을 검색한 후 그 가격을 알려주도록
		
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 명 : ");
		String search = sc.nextLine();
		
		boolean flag = true;
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(search)) {
				System.out.println("가격 : " + phones[i].getPrice() + "원");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("저희 가게에서 판매하는 핸드폰이 아닙니다.");
		}
			
	}

}
