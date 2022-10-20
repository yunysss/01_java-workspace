package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i + " = " + sum);				
			} else {
				System.out.print(i + " + ");
			}
		}		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 < num2) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=2 && num<=9) {
			for(int i=num; i<=9; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
				System.out.println();
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num1+(num2*9); i+=num2) {
			System.out.print(i + " ");
		}
		
	}
}
