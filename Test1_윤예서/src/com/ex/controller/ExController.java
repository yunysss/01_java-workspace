package com.ex.controller;

import java.util.Scanner;

public class ExController {

	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("\n두 정수의 합 : " + (num1 + num2));
		System.out.println("두 정수의 차 : " + (num1 - num2));
		System.out.println("두 정수의 곱 : " + num1 * num2);
		System.out.println("두 정수의 나누기한 몫 : " + num1 / num2);
		
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String brand = sc.nextLine();
		
		System.out.println("\n도서명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("출판사 : " + brand);
	
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int i = sc.nextInt();
		
		System.out.print("실수 : ");
		double d = sc.nextDouble();
		
		int sum = i + (int)d;
		
		System.out.println("\n두 수의 합 : " + sum);
		
	}
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (kor + math + eng) / 3.0;
				
		System.out.println("\n세 점수의 합계 : " + sum);
		System.out.println("세 점수의 평균 : " + avg);
	}
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch == 'Y' || ch =='y' ? "프로그램을 종료합니다" : "프로그램을 계속 진행합니다.";
		
		System.out.println(result);
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학원명 : ");
		String name = sc.nextLine();
		
		System.out.print("강의실 : ");
		int classNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		String student = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = gender == '남' ? "남자" : (gender == '여' ? "여자" : "");
		
		System.out.printf("\n%s 학원 %d 강의실에서 수강중인 %d살 %s %s님 환영합니다", 
							name, classNum, age, result, student);
		
		}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		sc.nextLine();
				
		System.out.print("연산자(+ 또는 - 또는 *) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(op == '+') {
			result = num1 + num2;
		} else if(op == '-'){
			result = num1 - num2;
		} else if(op == '*') {
			result = num1 * num2;
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
			return;
		}
		System.out.println(result);
	}
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
				
		System.out.print("연산자(+ 또는 - 또는 *) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		default : System.out.println("연산자를 잘못 입력하셨습니다."); return;
		}
		System.out.println(result);
		
	}
	
}
