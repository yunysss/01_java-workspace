package com.br.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 선택적으로 실행하는 선택문 --> 조건문
	 * 반복적으로 실행하는 반복문 --> 반복문
	 * 그 외의 흐름 제어 	  --> 분기문
	 * 
	 * * 조건문
	 *   "조건식"을 통해 참이냐 거짓이냐를 판단해서
	 *   해당 조건이 만족하는 경우 실행문 실행
	 *   
	 *   => 조건식의 결과 true/false 여야됨
	 *   => 보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||) 사용
	 *   
	 * * 조건문은 크게 if문과 switch문으로 나뉨
	 * 
	 *   if문은 3가지    
	 *   1. 단독 if문.  
	 *   2. if-else문
	 *   3. if-else if문	  
	 */
	
	/*
	 * * 단독 if문
	 * 
	 *   if(조건식) {
	 *      실행시키고자하는 코드
	 *      ...
	 *   }
	 *   
	 *   조건식이 true일 경우 => 중괄호 블럭안의 코드 실행
	 *   조건식이 false일 경우 => 중괄호 블럭안의 코드 무시하고 넘어감
	 *   
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");	
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다.");	
		}		
	}
	
	/*
	 * * if-else문
	 * 
	 *   if(조건식) {
	 *   	실행 코드1;
	 *   } else {
	 *   	실행 코드2;
	 *   }
	 *   
	 *   조건식의 결과가 true일 경우 실행코드1 수행 후 if-else문 빠져나감
	 *   단, 결과가 false일 경우 무조건 실행코드2 수행
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
	}
	
	/*
	 * * if-else if문
	 *   같은 비교대상으로 여러개의 조건을 제시해야될 경우
	 *   
	 *   if(조건식1) {
	 *   	실행 코드1;
	 *   } else if(조건식2) {
	 *   	실행 코드2;
	 *   } else if(조건식3) {
	 *   	실행 코드3;
	 *   } [else {
	 *   	위의 조건들이 다 false일 경우 실행할 코드
	 *   }] 생략가능
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		} else if(num == 0) {
			System.out.println("0이다.");
		} else /*if(num < 0)*/ {
			System.out.println("음수다.");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		} else if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		} else /*if(num % 2 == 1)*/ {
			System.out.println("입력한 숫자는 홀수입니다.");
		} 
	}
	
	public void method5() {
		
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		/*
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age <= 19) { // age가 13초과인건 이미 내제되어있음
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		*/
		
		// 조건검사 실행전
		String result; // 결과를 담아줄 변수 만들어두기
		
		// 조건검사
		if(age <= 13) {
			result = "어린이";
		} else if(age <= 19) { 
			result = "청소년";
		} else {
			result = "성인";
		}
		
		// 조건검사 실행후
		System.out.println(result);
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx님은 남학생입니다.
		// xxx님은 여학생입니다.
		
		/*
		if(gender == 'm' || gender == 'M') {
			System.out.println(name + "님은 남학생입니다.");
		} else if(gender == 'f' || gender == 'F') {
			System.out.println(name + "님은 여학생입니다.");
		}
		*/
		
		String result = ""; // 반드시 변수 세팅시 초기화해두는 습관을 들이자!
		
		if(gender == 'm' || gender == 'M') {
			result = "남학생";
		} else if(gender == 'f' || gender == 'F') {
			result = "여학생";
		} else {
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; // 해당 메소드를 호출했던 곳으로 빠져나가는 구문 
		}
		
		// xxx님은 xxx입니다. 
		System.out.println(name + "님은 " + result + "입니다.");
		
		// 초기화가 된 변수만 출력 가능!
		// 위쪽 조건들이 다 false일 경우 result에 아무런 값도 대입되지 않음
		// 해결 => result변수 미리 세팅시 초기화를 해두자!
	}
	
	public void method7() {
		// 사용자에게 점수를 입력받은 후
		// 점수가 0점이상 100점이하(적절한범위)인지 아닌지를 판별한 후
		// 적절한 범위의 점수가 아닐 경우 => "점수를 잘못입력하셨습니다."
		// 적절한 범위의 점수가 맞을 경우
		// 90점 이상일 경우 => A
		// 80점 이상 90점 미만일 경우 => B
		// 70점 이상 80점 미만일 경우 => C
		// 60점 이상 70점 미만일 경우 => D
		// 60점 미만일 경우 => F
		// 출력형식 : xx점은 xx등급입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade = "F"; 
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				grade = "A";
			} else if(score >= 80) {
				grade = "B";
			} else if(score >= 70) {
				grade = "C";
			} else if(score >= 60) {
				grade = "D";
			}
			System.out.println(score + "점은 " + grade + "등급입니다.");
		} else {
			System.out.println("점수를 잘못입력하셨습니다.");
		}
	}
		
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "홍길동") {
			System.out.println("홍길동님 반갑습니다.");
		} else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
		}
		*/
		
		/*
		 * 				1		1	  2     4    8      4      8      2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 * 참조자료형 : String
		 * 
		 * 기본자료형들끼리 동등 비교시에 ==, != 사용가능 (정상적으로 비교됨)
		 * 단, 참조자료형은 동등 비교시에 ==, != 사용시 정상적으로 비교 안됨
		 * 
		 * 참조자료형간의 동등 비교시 => equals() 메소드를 이용해서 비교해야됨
		 * 						 문자열.equals(문자열)	: 일치하는지
		 * 					     !문자열.equals(문자열)	: 일치하지않은지
		 */
		if(name.equals("홍길동")) { // "홍길동".equals(name)도 가능. 보통 비교할 대상을 앞에 씀
			System.out.println("홍길동님 반갑습니다.");
		} else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
		}
	}
	
	// 조건문 중첩사용
	public void method9() {
		// 사용자에게 정수를 입력받아
		// 양수일 경우 => 이때 3의 배수일 경우 => "3의 배수입니다."
		// 그게 아닐 경우 => "3의 배수가 아닙니다."
		// 양수가 아닐경우 => "양수가 아닙니다."

		Scanner sc = new Scanner(System.in);

		System.out.print("정수(양수) 입력 : ");
		int num = sc.nextInt();

		if (num > 0) { // 양수일 경우

			if (num % 3 == 0) { // (양수이고) 3으로 나누어 떨어지는 경우
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}

		} else { // 양수가 아닐 경우
			System.out.println("양수가 아닙니다.");
		}
	}

}
