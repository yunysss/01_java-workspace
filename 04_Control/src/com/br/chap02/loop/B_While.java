package com.br.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 실행할 코드;
	 * }
	 * 조건식 == true => 무한반복
	 * 각각의 항목 생략 가능 for(;;){} => 무한반복
	 * 
	 * * while문
	 * [초기식;]
	 * while(조건식) { // 반복을 수행시킬 조건
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 */
	public void method1() {
		// 안녕하세요 5번 반복 출력
		/*
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		*/
		
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i); // while문 밖에서도 변수 i 사용 가능
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		while(i < 6) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");
		}
	}
	
	public void method3() {
		// 1부터 10사이의 홀수만 출력
		// 1 3 5 7 9
		
		int i = 1;
		while(i < 11) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값(1~100) 까지의 총 합계
		
		int random = (int)(Math.random()* 100 + 1);
		int i = 1;
		int sum = 0;
		while(i <= random) {
			sum += i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i++));
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복
		while(true) {
			
			// 메뉴 출력
			System.out.println("\n======= 메뉴 =======");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 5까지 출력");
			System.out.println("3. 1부터 10까지 홀수 출력");
			System.out.println("4. 1부터 랜덤값까지의 총 합계 출력");
			System.out.println("5. 문자열의 각 문자 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 0: System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 메뉴를 다시 입력해주세요."); 
			}			
		}
	}
	
	/*
	 * * do-while문
	 * 
	 * do {
	 * 		반복적으로 실행할코드;
	 * } while(조건식);
	 * 
	 * 처음에 조건검사 없이 무조건 한번은 실행 **
	 * => 조건검사 => true일 경우 실행
	 * ---------- 반복 ----------
	 * => 조건검사 => false일 경우 실행 x => 반복문 종료
	 * 
	 */
	
	public void method7() {
		int num = 1;
		
		do {
			System.out.println(num);
		} while(num < 0); // 조건이 무조건 false
	}
	
	public void method8() {
		// 1부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		do {
			sum += i++;
		} while(i<=num);
		
		System.out.println("총 합계 : " + sum);
	}
	
	public void method9() {
		
		// 매번 반복적으로 사용자에게 문자열을 입력받고 해당 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문 종료
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		do {
			System.out.print("문자열 입력(종료하고자 한다면 exit입력) : ");
			str = sc.nextLine();
			// xxx의 글자수는 xx글자입니다.
			System.out.println(str + "의 글자수는 " + str.length() + "글자입니다.");
		} while(!str.equals("exit"));
	}
}
