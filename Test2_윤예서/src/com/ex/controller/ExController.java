package com.ex.controller;

import java.util.Scanner;

import com.ex.model.vo.Bread;

public class ExController {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		} else if(num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수1 : ");
		int num1 = sc.nextInt();
		System.out.print("양수2 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			int max = Math.max(num1, num2);
			int min = Math.min(num1, num2);
			
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x 또는 X, /, %) : ");
		char op = sc.nextLine().charAt(0);
		
		if((op == '/' || op == '%') && num2 == 0) {
			System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다.");
		} else {
			int result = 0;
			switch(op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case 'x': case 'X': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하였습니다. 프로그램을 종료합니다."); return;
			}
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}
	}
	
	public void ex4() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총합계 : " + sum);
	}
	
	public void ex5() {
		Bread b = new Bread();
		b.setBreadName("포켓몬빵");
		b.setBrand("삼립");
		b.setPrice(1500);
		b.setStock(0);
		
		System.out.println(b.information());
		
		b.setStock(20);
		
		System.out.println(b.information());
	}
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("빵이름 : ");
		String name = sc.nextLine();
		System.out.print("브랜드 : ");
		String brand = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("재고수량 : ");
		int stock = sc.nextInt();
		
		Bread b = new Bread(name, brand, price, stock);
		
		System.out.println(b.information());
		
	}

}
