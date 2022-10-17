package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
			
		System.out.println((num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다")));
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + num2 / num1);		
		System.out.println("남는 사탕 개수 : " + num2 % num1);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int className = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double exam = sc.nextDouble();
		
		System.out.println(grade + "학년 " + className + "반 " + number + "번 " + name + " " + (gender == 'M' ? "남학생" : "여학생") + "의 성적은 " + exam + "이다.");
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인"));
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("\n합계 : " + (korean + english + math));
		System.out.println("평균 : " + (korean + english + math)/3.0);
		System.out.println(korean >= 40 && english >= 40 && math >= 40 && (korean + english + math)/3.0 >= 60 ? "합격" : "불합격");
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		System.out.println(num == '1' || num == '3' ? "남자" : "여자");
	}
	
}
