package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료\n메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		
		switch(num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 9 : System.out.println("프로그램을 종료합니다."); return;
		}
		System.out.println(menu + " 메뉴입니다.");
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		double avg = (kor + math + eng) / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!", kor, math, eng, kor + math + eng, avg);
			/*System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + (kor + math + eng));
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");*/
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 1 : case 2 : case 12 : season = "겨울"; break;
		case 3 : case 5 : season = "봄"; break;
		case 6 : case 7 : case 8 : season = "여름"; break;
		case 9 : case 11 : season = "가을"; break;
		default : season = "잘못 입력된 달";
		}
		System.out.println(month + "월은 " + season + "입니다.");
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("boram") && pw == "1234") {
			System.out.println("로그인 성공");
		} else if(!(id.equals("boram")) && pw == "1234") {
			System.out.println("아이디가 틀렸습니다.");
		} else if(id.equals("boram") && pw != "1234") {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();
		
		switch(str) {
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
		default : System.out.println("잘못 입력하셨습니다."); 
		}
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";			
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		if (num1 > 0 && num2 > 0) {
			int result = 0;
		
			switch(op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		} else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실행할 기능을 선택하세요.\n1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8();
		}
	}
	
	public void 집에서올린메소드() {
		System.out.println("집에서 올린 코드");
	}
}
	
