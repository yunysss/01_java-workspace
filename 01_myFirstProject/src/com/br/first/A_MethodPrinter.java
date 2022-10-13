package com.br.first;

public class A_MethodPrinter {

	// 일반 메소드
	// public void 메소드명() { 실행시키고자하는 코드 } 
	
	public void methodA() {
		System.out.println("메소드 A 출력문");
		methodB(); // 같은 클래스 내 메소드 호출
	}
	
	public void methodB() {
		System.out.println("메소드 B 출력문");
		methodC();
	}
	
	public void methodC() {
		System.out.println("메소드 C 출력문");
	}
	
}
