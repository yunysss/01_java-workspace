package com.br.chap02_string.controller;

public class B_BuilderBufferTest {
	
	/*
	 * * StringBuilder, StringBuffer == 가변클래스 (그 자리에서 값이 변경되는 개념)
	 * - 두 개의 클래스 모두 생성자나 메소드가 동일함
	 * - 유일한 차이점 동기화 되냐 안되냐의 차이 => 속도 차이
	 * 
	 * * 동기화 : 한 자원에 대해 여러 스레드가 접근하려 할 때 한 시점에서 하나의 스레드만 사용될 수 있게 하는 것
	 * 
	 * > StringBuilder : 동기화 제공 x => 속도가 빠름
	 * > StringBuffer : 동기화 제공 o => 속도가 느림
	 */
	public void method1() {
		
		//StringBuilder sb1 = "hello"; => String클래스만 리터럴값 대입 가능
		
		// 객체 생성시 처음에 16개의 문자들을 저장할 수 있는 버퍼가 내부적으로 생성
		
		// 1. 기본생성자로 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1의 수용량 : " + sb1.capacity());
		System.out.println("sb1의 문자열의 길이 : " + sb1.length());
		
		// 2. 정수값 하나 전달가능한 매개변수 생성자로 생성
		StringBuilder sb2 = new StringBuilder(30); // => 전달된 정수값 크기만큼의 수용량이 지정
		System.out.println("\nsb2의 수용량 : " + sb2.capacity());
		System.out.println("sb2의 문자열의 길이 : " + sb2.length());
		
		// 3. 문자열 하나 전달가능한 매개변수 생성자로 생성
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("\nsb3의 수용량 : " + sb3.capacity()); // 16 + 5 => 21
		System.out.println("sb3의 문자열의 길이 : " + sb3.length());
		
	}
	
	public void method2() {
		// 가변클래스가 맞는지 (즉, 그자리에서 수정되는지) => 주소값 변경되지 않음
		
		StringBuilder sb = new StringBuilder("반가워!"); // 4글자
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		// 1. append(String str) : StringBuilder로 반환
		//    기존의 문자열에 새로운 문자열 추가하고 싶을때
		sb.append("안녕!");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		sb.append("다들 조금만 힘내세요!!!"); // 14글자 더 추가 (기존의 수용량 20 초과)
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity()); // 기존의 수용량 * 2 + 2
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		// 2. delete(int start; int end) : StringBuilder
		//    start<= <end 범위의 문자열 삭제하기
		sb.delete(2, 5); // 워, 녕
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity()); // 다시 줄어들지 않음
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		// 3. insert(int offset, String str) : StringBuilder
		//    offset 위치에 str을 추가시켜줌
		sb.insert(1,  "ㅎㅎㅎ");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		// 4. reverse() : StringBuilder
		//    기존의 문자열을 역으로 바꿀 때
		sb.reverse();
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
		
		// 메소드체이닝 == 메소드 연이어서 호출
		sb.append("ㅋㅋㅋ")
		.delete(0, 4)
		.reverse()
		.insert(2, "ㄱㄱㄱ"); // 가독성을 위해 내려서 표시 가능
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("==================");
	}
	
}
