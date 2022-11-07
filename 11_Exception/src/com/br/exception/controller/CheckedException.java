package com.br.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * * CheckedException은 반드시 예외처리를 해야만 하는 예외들
	 *   => 조건문 제시 불가 (예측 불가한 곳에서 문제가 발생)
	 *   => 외부 매개체와 입출력이 일어날 때 발생 (IOException)
	 */
	public void method1() throws IOException {
		/*
		try {
			method2();
		} catch(IOException e) {
			System.out.println("예외 발생");
		}
		*/
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner와 비슷하게 키보드로 값을 입력받을 수 있는 객체 (BufferedReader)
		// => 문자열로 읽어들여짐
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요 : ");
		
		// 1. try~catch문 : 지금 즉시 곧바로 예외를 처리하겠다
		//    try {} : 예외가 발생할 가능성이 있는 코드 작성
		//	  catch(발생될예외클래스 매개변수) {} : try구문내에서 예외가 발생됐을 경우 처리할 구문
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch(IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		*/
		
		// 2. throws : 지금 즉시 예외를 처리하지 않고 현재 이 메소드를 호출했던 곳으로 예외처리를 떠넘기겠다 (위임하다)
		String str = br.readLine();
		System.out.println(str);
		
		
		System.out.println("프로그램을 종료합니다.");
		
		// main까지 쭉 throws로 떠넘기면 JVM이 알아서 처리 
	}
	
	/*
	 *               예외클래스                       예외발생시점                      예외처리
	 * unCheckedException RuntimeException관련 런타임에러(프로그램 실행시) 세모(개발자가 케바케로 처리 => 조건문 / 예외처리)
	 *   CheckedException RuntimeException 외    컴파일에러(빨간줄)     필수(조건문 기술 못함 => 예외처리구문으로만 해결)
	 */
}
