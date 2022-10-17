package com.br.operator;

public class A_LogicalNegation {
	
	public void method1() {
		/*
		 * ! 논리부정연산자 (단항연산자 == 하나의 값을 가지고 연산)
		 * 
		 * => 논리값(true/false)을 반대로 바꾸는 연산자
		 * => 논리값을 가지고 연산을 하고 결과마저도 논리값
		 */
		System.out.println("true의 반대 : " + !true);
		System.out.println("false의 반대 : " + !false);
		
		boolean b1 = true;
		System.out.println("b1의 반대 : " + !b1);
		
		boolean b2 = !b1; // false
		System.out.println("b2의 값 : " + b2);
		
		boolean b3 = !(5 > 3); //false
		System.out.println("b3의 값 : " + b3);
	}

}
