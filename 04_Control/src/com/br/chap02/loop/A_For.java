package com.br.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 출력하기
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i=1; i<=5; i++) { // i값이 1에서부터 5까지 매번 1씩 증가되는동안 반복 수행 (1, 2, 3, 4, 5)
			System.out.println("안녕하세요");
		}
		
		for(int i=11; i<16; i++) { // 11에서부터 15까지 매번 1씩 증가되는동안 반복 수행 (11, 12, 13, 14, 15)
			System.out.println("반갑습니다");
		}
		
		for(int i=0; i<5; i++) { // 0에서부터 4까지 매번 1씩 증가되는동안 반복 수행 (0, 1, 2, 3, 4)
			System.out.println("저리가세요");
		}
		
		/*
		 * Tip. 내가 원하는 횟수만큼 반복문 돌리고자 할 때
		 * 		for(int i=0; i<횟수; i++) { }
		 */
		for(int i=1; i<=9; i+=2) { // 1에서부터 9까지 매번 2씩 증가되는동안 반복 수행 (1, 3, 5, 7, 9)
			System.out.println("Hello");
		}
		
	}
	
	public void method2() {
		// 1부터 5까지 출력
		
		// 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		// for문을 벗어나서 i변수 사용 불가
		
		System.out.println();
		
		// 5 4 3 2 1
		for(int i=5; i>=1; i--) { // 5에서부터 1까지 매번 1씩 감소하는동안 반복수행 (5, 4, 3, 2, 1)
			System.out.print(i + " ");
		}
		
	}
	
	public void method3() {
		// 1 2 3 ... 9 10
		for(int i=0; i<10; i++) { // 0에서부터 9까지 매번 1씩 증가되는동안 반복수행 (10회)
			System.out.print(i+1 + " ");			
		}
	}
	
	public void method4() {
		// 1부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		
		// 방법1. 딱 5회만 반복문 돌려서 출력
		/*
		for(int i=1; i<=10; i+=2) { // 1에서부터 10까지 매번 2씩 증가하는동안 반복 수행 (1 3 5 7 9)
			System.out.print(i + " ");
		}
		*/
		
		// 방법2. 10회 반복문 돌리되 출력은 홀수만
		//	1에서부터 10까지 매번 1씩 증가되는동안 반복수행 (1 2 3 4 ... 8 9 0 => 10회)
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) { // i값이 홀수일 경우
				System.out.print(i + " ");
			}
		}
	}
	
	public void method5() {
		// 1에서부터 10까지의 총 합계
		// 방법1. int sum = 1+2+3+4+...+9+10;
		// 방법2. 
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ....
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙을 찾아보면
		 * sum 변수에 누적해서 더해지는 행위를 반복수행
		 * 단, 누적해서 더해지는 값이 1에서부터 10까지 1씩 증가되고 있음
		 */
		int sum = 0;
		
		for(int i=10; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("10에서부터 100까지의 총 합계 : " + sum);
		
	}
	
	public void method6() {
		// 1에서부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수일 경우 => 잘 입력한거임 => 총 합께 구해서 알려주기
			int sum = 0;
			for(int i=1; i<=num; i++) {
				sum += i;
			}
			System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
		} else { // 양수가 아닐 경우 => 잘못 입력한거임 => "잘못입력했어" 출력
			System.out.println("잘못입력하였습니다.");
		}
	}
	
	public void method7() {
		// 1에서부터 랜덤값(1~10사이의 랜덤값) 까지의 총 합계
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출해서
		 * 프로그램 실행할 때마다 매번 다른 랜덤값을 얻어낼 수 있음
		 * 생성하거나 변수명 정해줄 필요 없음
		 * 
		 * Math.random() 호출시 => 0.0 ~ 0.9999999999 사이의 랜덤값(실수) 발생
		 * 						(0.0 <=   < 1.0)
		 */
		//int random = Math.random(); // double 형이라서 안됨
		//			0.0 <=  < 1.0	=>	0.0 ~ 0.99999999
		
		//int random = Math.random() * 10;
		//			0.0 <=  < 10.0	=>	0.0 ~ 9.99999999
		
		//int random = Math.random() * 10 + 1;
		//			1.0 <=  < 11.0	=>	1.0 ~ 10.99999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			1   <=  < 11	=>	1 ~ 10	
		
		System.out.println("1~10사이의 랜덤값 : " + random);
		
		/*
		 * Tip. 랜덤값 발생 범위 지정
		 *      (int)(Math.random() * 발생시킬랜덤값갯수 + 시작수)
		 *      
		 *  ex) 11 ~ 20 랜덤값
		 *  	(int)(Math.random() * 10 + 11)
		 */
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;			
		}
		
		System.out.println("1에서부터 " + random + "까지의 총합 : " + sum);
		
	}
	
	public void method8() {
		// 특정 문자열의 각 인덱스별 문자 뽑아서 출력
		
		String str = "Hello";
		//            01234
		
		/*
		 * H	=> str.charAt(0) 출력
		 * e	=> str.charAt(1) 출력
		 * l	=> str.charAt(2) 출력
		 * l	=> str.charAt(3) 출력
		 * o	=> str.charAt(4) 출력
		 * 
		 * 0번인덱스에서부터 4번인덱스(마지막인덱스)까지 매번 1씩 증가되는 인덱스의 문자를 뽑아서 출력
		 */
		
		for(int i=0; i<5; i++) { // 0에서부터 4까지 매번 1씩 증가되는동안 반복수행 (0,1,2,3,4)
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method9() {
		// 사용자에게 입력받은 문자열의 각 인덱스별 문자 뽑아서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		/*
		 * apple => 5글자(마지막 인덱스 : 4)
		 * 01234
		 * 
		 * pineapple => 9글자(마지막 인덱스 : 8)
		 * 012345678
		 * 
		 * kiwi => 4글자(마지막 인덱스 : 3)
		 * 0123
		 * 
		 * 마지막 인덱스 == 문자열의 길이 - 1
		 */
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("문자열의 마지막인덱스수 : " + (str.length() - 1));
		
		// 0번인덱스 ~ 마지막인덱스(문자열의길이-1) 까지 매번 1씩 증가하는 동안 반복
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
				
	}
	
	public void method10() {
		
		// 2단 출력하기
		/*
		 * 2 x 1 =
		 * 2 x 2 =
		 * 2 x 3 =
		 * ...
		 * 2 x 8 =
		 * 2 x 9 =
		 */
		for(int su=1; su<=9; su++) {
			//System.out.println("2 x " + su + " = " + 2 * su);
			System.out.printf("2 x %d = %d\n", su, 2 * su);
		}
	}
	
	public void method11() {
		// 사용자가 입력한 단을 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9)를 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
			}
		} else {
			System.out.println("2~9사이의 숫자를 입력해야됩니다.");
		}
	}
	
	public void method12() {
		// 2~9사이의 랜덤값 발생 시켜
		// 해당 단을 출력하기
		
		int random = (int)(Math.random() * 8 + 2);
		
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", random, su,  random * su);
		}		
	}
	
	// 중첩 for문
	public void method13() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5	
		
		for(int j=0; j<3; j++) { // 행 조건
			for(int i=1; i<=5; i++) { // 열 조건
				System.out.print(i + " ");
			}
			System.out.println();			
		}
	}
	
	public void method14() {
		// ****
		// ****
		// ****
		// ****
		
		// 행은 1~4까지 반복		   => 바깥쪽 for문
		// 매행마다 열은 매번 1~4까지 반복 => 안쪽 for문
		
		for(int j=0; j<4; j++) {
			for(int i=0; i<4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public void method15() {
		// 1***		=> 1행 1열일때 1출력
		// *2**		=> 2행 2열일때 1출력
		// **3*		=> 3행 3열일때 1출력
		// ***4		=> 4행 4열일때 1출력
		
		//			=> 행수와 열수가 일치할 경우 => 숫자(그때당시의 행수 또는 열수)
		//			=>		   그게 아닐 경우 => * 출력
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i == j) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method16() {
		// 2단~9단까지 모두 출력
		
		// 2~9단까지 매번 1씩 증가
		// 한 단이 고정일때 매번 곱해지는 수는 1~9까지 1씩 증가
		
			for(int dan=2; dan<=9; dan++) {
				System.out.println("===" + dan + "단===");
				for(int su=1; su<=9; su++) {
					System.out.printf("%d x %d = %d\n", dan, su, dan * su);
				}
				System.out.println();
		}
		
	}
	
	// =======================================================================
	
	public void method17() {
		// 문제1.
		// 사용자에게 한 개의 정수를 입력받고
		// 1에서부터 사용자가 입력한 수까지 매번 1씩 증가되는
		// 숫자가 홀수인지, 짝수인지 판별해서
		// 홀수면 "박", 짝수면 "수" 출력
		// 단, 사용자가 입력한 수가 양수가 아닐 경우 "양수가 아닙니다" 출력
		
		// ex) 4 입력시 --> 박수박수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=1; i<=num; i++) {
				if(i % 2 == 1) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		} else {
			System.out.println("양수가 아닙니다");
		}
	}
	
	public void method18() {
		// 문제2.
		// 문자열 하나 입력 받고				  (String)
		// 문자열로부터 검색하고 싶은 문자도 입력받기 (char)
		// 문자열에 그 문자가 몇 개 있는지 개수 출력
		
		// ex) "banana", 'a' 입력시 --> 3 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		
		String str = sc.nextLine();
		
		System.out.print("검색하고 싶은 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int num = 0;
		for(int i=0; i<str.length(); i++) {		
			if(ch == str.charAt(i)) {
				num += 1; // num++;
			} 		
		} System.out.println(num);		
	}
}
	


