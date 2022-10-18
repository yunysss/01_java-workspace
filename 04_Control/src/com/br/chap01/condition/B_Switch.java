package com.br.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * * switch문도 조건문
	 * 
	 *   if문과의 "차이점"
	 *   > if문 안의 조건식은 자유롭게 기술 가능 (범위ㅔ 대한 조건, 동등 비교 등등)
	 *     단, switch문은 동등비교만 가능 (동등비교할 값들만 작성)
	 *   > 실행할구문만 실행하고 자동으로 빠져나오질 못함! (직접 break; 문 작성해야됨)
	 *   
	 *   switch(동등비교할대상자) {
	 *   case 값1 : 실행코드1; break;
	 *   case 값2 : 실행코드2; break;
	 *   ...
	 *   [default : 위의 값들과 모두 일치하지 않을 경우 실행할코드;]
	 *   }
	 */
	
	public void method1() {
		/*
		 * 정수를 입력받아
		 * 1일 경우 "빨간색입니다."
		 * 2일 경우 "파란색입니다."
		 * 3일 경우 "초록색입니다."
		 * 그 외일 경우 "잘못입력하셨습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이의 정수 : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
			System.out.println("빨간색입니다.");
		} else if(num == 2) {
			System.out.println("파란색입니다.");
		} else if(num == 3) {
			System.out.println("초록색입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		switch(num) {
		case 1 : 
			System.out.println("빨간색입니다."); 
			break;
		case 2 : 
			System.out.println("파란색입니다."); 
			break;
		case 3 : 
			System.out.println("초록색입니다."); 
			break;
		default : 
			System.out.println("잘못입력하셨습니다.");
		}

	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자하는 과일(사과,바나나,복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0; // 과일의 가격을 보관할 변수
		
		switch(fruit) {
		case "사과" : price = 1000; break;
		case "바나나" : price = 2000; break;
		case "복숭아" : price = 3000; break;
		default : System.out.println(fruit + "은(는) 판매하는 과일이 아닙니다."); return;
		}
	
		// xx의 가격은 xxxxx원입니다.
		System.out.printf("%s의 가격은 %d원입니다.", fruit, price);
		
	}
	
	// break없는 switch문을 사용하는 예시
	public void method3() {
		// 등급별 권한
		// 1 : 읽기권한, 글쓰기권한, 관리권한
		// 2 : 읽기권한, 글쓰기권한
		// 3 : 읽기권한
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 : System.out.println("관리권한");
		case 2 : System.out.println("글쓰기권한");
		case 3 : System.out.println("읽기권한");
		}
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		switch(gender) {
		case 'm' : case 'M' : System.out.println("남학생"); break;
		case 'f' : case 'F' : System.out.println("여학생"); break;
		default : System.out.println("성별을 잘못입력하셨습니다.");
		}
	}
	
	public void method5() {
		// 달을 입력받아 해당 달의 마지막날짜 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월까지 중 하나를 입력(정수로) : ");
		int month = sc.nextInt();
		
		String day = "";
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = "31일"; break;
		case 4 : case 6 : case 9 : case 11 : day = "30일"; break;
		case 2 : day = "28일 또는 29일"; 
		default : System.out.println("반드시 1~12월까지를 입력해야됩니다."); return;
		}
		
		System.out.printf("입력하신 월은 %s까지입니다.", day);
	}
}
