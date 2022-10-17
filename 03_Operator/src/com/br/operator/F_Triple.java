package com.br.operator;

import java.util.Scanner;

public class F_Triple {
	
	/*
	 * * 삼항연산자 (항목 3개자를 가지고 연산해주는 연산자)
	 * 
	 * 	 [표현법]
	 * 	 조건식 ? 조건식이 true일경우 돌려줄 결과값 : 조건식이 false일경우 돌려줄 결과값
	 * 
	 * 	 조건식 => 반드시 true/false가 나오도록 작성
	 * 			 주로 비교/논리연산자를 이용해서 작성
	 * 
	 */
	
	public void method1() {
		// 사용자에게 입력받은 정수값이 양수인지 아닌지 판별 후 출력		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수이다." : "양수가 아니다.";
		
		// 사용자가 입력한 xx은(는) xxxxxxxxxx.
		System.out.printf("사용자가 입력한 %d은(는) %s", num, result);		
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		//String result = num % 2 == 0 ? "짝수이다." : "홀수이다.";
		String result = num % 2 == 1 ? "홀수이다." : "짝수이다.";
		
		System.out.println(result);
	}
	
	public void method3() {
		// 입력받은 문자값이 영문자인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 한글자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ? "영문자입니다." : "영문자가 아닙니다.";
		
		System.out.println((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ? "영문자입니다." : "영문자가 아닙니다.");
		
	}

	// 삼항연산자 중첩으로 사용 가능
	public void method4() {
		
		// 사용자가 입력한 정수값이 양수인지, 음수인지, 0인지 를 정확하게 판별한 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
				
		String result = (num > 0 ? "양수이다." : (num < 0 ? "음수이다." : "0이다."));
		
		System.out.println(result);
		
	}
	
	public void method5() {
		// 사용자에게 두개의 정수값 입력받고
		// '+' 또는 '-'를 입력받아 그에 맞는 연산결과를 출력해주기
		// 단, + 또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "잘못입력했습니다."));
		
		// xx x xx = xx
		System.out.printf("%d %c %d = %s", num1, op, num2, result);
		
	}

}
