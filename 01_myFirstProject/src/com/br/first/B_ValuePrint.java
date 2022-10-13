package com.br.first;

/*
 * ** 원칙 **
 * 1. 클래스명 --> 대문자로 시작
 * 2. 패키지명 --> 소문자로 시작
 * 3. 메소드명 --> 소문자로 시작
 * 4. 변수명   --> 소문자로 시작
 * 
 * 단, 여러개의 단어가 조합될 경우 단어 앞자리마다 대문자로 == 낙타표기법
 * ex) 클래스명 Valueprint ==> ValuePrint
 *     메소드명 valueprint ==> valuePrint
 * 
 */
public class B_ValuePrint { // com.br.first.B_ValuePrint
	
	// 다양한 형식의 값을 출력하는 메소드
	public void printValue() {
		
		// 1. 숫자 출력 (따옴표없이)
		System.out.println(123);	// 정수값
		System.out.println(1.23);	// 실수값
		
		// 2. 한글자(문자) 출력 (홑따옴표로)
		System.out.println('a');
		System.out.println('가');
		
		// 3. 여러글자(문자열) 출력 (쌍따옴표로)
		System.out.println("안녕하세요");
		
		// 4. 연산한 결과 값도 출력 가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		
		// 5. 문자와 숫자는 연산가능
		System.out.println('a' + 1); // 컴퓨터가 인식하는 고유 숫자값을 가지고 있음
		System.out.println('b' + 1); // a == 97, b == 98
		
		// 6. 문자열과 그 외의 값들의 덧셈연산 => 하나의 문자열로 연이어짐
		System.out.println("하이" + 'a'); // "하이a"
		System.out.println(123 + "안녕하세요"); // "123안녕하세요"
		
	}
	
	// 문자열과 숫자의 덧셈 연산 메소드
	public void sumStringNumber() {
		
		System.out.println(7 + 7);		// 14
		System.out.println(7 + "7");	// "77"
		System.out.println("7" + 7);	// "77"
		
		System.out.println(7 + 7 + "7");// 14 + "7" => "147"
		System.out.println("7" + 7 + 7);// "77" + 7 => "777"
		System.out.println("7" + (7 + 7));// "7" + 14 => "714"		
	}


}
