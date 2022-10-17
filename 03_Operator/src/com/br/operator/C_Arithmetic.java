package com.br.operator;

public class C_Arithmetic {
	
	/*
	 * * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 *   + - * / %
	 *   * / %  >  + -
	 */
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 x num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 값 % 2 == 0 라는건 짝수란 소리
		// 값 % 2 == 1 라는건 홀수란 소리
		
		// 값 % 5 == 0 라는건 5의배수란 소리
	}
	
	
	
	

}
