package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pro = new Product[10];
	public static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 정보 수정");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 3: productUpdate(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void productInput() {
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		
	}
	
	public void productPrint() {
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
	}
	
	public void productUpdate() {
		System.out.print("\n수정하고자하는 제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("변경할 제품명 : ");
		String newpName = sc.nextLine();
		System.out.print("변경할 가격 : ");
		int newPrice = sc.nextInt();
		System.out.print("변경할 세금 : ");
		double newTax = sc.nextDouble();
		
		for(int i=0; i<count; i++) {
			if(pro[i].getpName().equals(pName)) {
				pro[i].setpName(newpName);
				pro[i].setPrice(newPrice);
				pro[i].setTax(newTax);
			}
		}
		
	}
}
