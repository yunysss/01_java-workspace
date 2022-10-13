package com.br.first;

// 주석 : 소스코드와 무관한 즉, 코드로 인식 안됨 => 주로 코드에 대한 설명을 작성
/*
 * 여러줄 주석 
 * 
 * 1. 프로젝트 만들기 (Java Project)
 * 2. 패키지 만들기 --> 폴더와도 같은 개념 (비슷한 역할을 하는 클래스들끼리 분류해서 관리함)
 * 3. 클래스 만들기 --> 코드 쳐야되니깐
 * 4. 메소드 만들기
 */

public class HelloWorld {

	// 메인메소드 : 프로그램 실행시 제일 먼저 찾아져서 실행되는 메소드
	public static void main(String[] args) {
		
		// 뭔가를 화면에 출력하고 싶을때 출력문을 통해 작업 (print, println, printf)
		
		// System.out.println(출력하고자하는 값); --> 해당 값을 출력 후 "줄바꿈해주는" 역할
		System.out.println("Hello World!");
		
		// System.out.print(출력하고자하는 값); --> 해당 값을 출력만 하고 끝
		System.out.print("안녕\t하세요\n");
		// 출력문 내에서 한줄 띄어쓰기 하고자 할 경우 => \n 넣으면됨
		System.out.print("\"여러분\"~!");
		
	}
	
	
}