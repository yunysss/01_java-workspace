package com.br.chap04_field.model.vo;

/*
 * >> 변수 구분
 * - 전역 변수 : 클래스영역 안에 바로 선언한 변수 => 클래스 내에서 어디서든 전역으로 다 사용 가능
 * - 지역 변수 : 클래스영역 내의 어떤 특정한 구역({})에 선언한 변수(매개변수 포함) => 선언된 해당 지역에서만 사용 가능
 *             * 특정한 구역 : 메소드{}, 제어문(if,for){} 등등
 * 1. 전역 변수
 * - 멤버변수 == 인스턴스변수
 *   생성시점 : new 연산자를 통해서 객체 생성시
 *   소멸시점 : 객체 소멸시 같이 소멸
 *   
 * - 클래스변수 == static변수
 *   생성시점 : 프로그램 실행과 동시에 무조건 메모리영역(static)에 할당
 *   소멸시점 : 프로그램 종료될때 소멸
 * 
 * 2. 지역 변수
 *    생성시점 : 지역변수가 속해있는 특정한 구역({}) 실행(호출)시 메모리영역에 할당
 *    소멸시점 : 특정한 구역({}) 종료시 소멸
 */
public class FieldTest1 { // 클래스영역 시작
	
	private int global;
	
	public void test(int num) { // 메소드영역 시작
		// 매개변수 == 지역변수
		
		int local = 100;
		
		// 멤버변수 => 이 객체 생성시 JVM이 기본값으로라도 초기화
		System.out.println(global);
		
		// 매개변수 => 이 메소드 호출시 반드시 값이 전달되어 올 것이기 때문에 초기화
		System.out.println(num);
		
		// 지역변수 => 내가 초기화를 직접하지 않으면 텅 빈 상태
		System.out.println(local);
		
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
		System.out.println(ft2.def);
		//System.out.println(ft2.pri);
		
	} // 메소드영역 끝

} // 클래스영역 끝
