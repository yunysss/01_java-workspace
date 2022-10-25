package com.br.homework.controller;

import java.util.Scanner;

public class Function {
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, /) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1- num2; break;
		case 'x': result = num1 * num2; break;
		case '/' :
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");			
			} else {
				result = num1 / num2;
			}
		}
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
		
	}
	
	public void totalCalculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);	
		int max = Math.max(num1, num2);
		int result = 0;
		for(int i=min; i<=max; i++) {
			result += i;
		}
		System.out.println(min + "부터 " + max + "까지 정수들의 합 : " + result);
	}
	
	public void printProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String character = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + character);		
	}

	public void printScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		char result = 'F';
		
		if(result >= 90) {
			result = 'A';
		} else if(result >= 80) {
			result = 'B';
		} else if(result >= 70) {
			result = 'C';
		} else if(result >= 60) {
			result = 'D';
		}
		
		String student = gender == 'M' ? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다.", grade, classNum, num, student, name, score, result);
	}
	
	public void printStarNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for (int i=1; i<=num; i++) {
				for (int j=1; j<i; j++) {
					System.out.print("*");
				}
				System.out.println(i);			
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandom() {
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void exceptGugu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		for(int su=1; su<=9; su++) {
			if(su % dan != 0) {
				System.out.printf("%d * %d = %d\n", dan, su, dan * su);
			}
		}
	}
	
	public void diceGame() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int dice1 = (int)(Math.random() * 6 + 1);
			int dice2 = (int)(Math.random() * 6 + 1);
			int sum = dice1 + dice2;
			
			while(true) {
				System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력) : ");
				int num = sc.nextInt();
				sc.nextLine();
				
				if(num == sum) {
					System.out.println("정답입니다.");
					System.out.println("주사위의 합 : " + sum);
				} else {
					System.out.println("틀렸습니다.");
					continue;
				}
				System.out.print("계속 하시겠습니까? (y/n) : ");
				char ch = sc.nextLine().charAt(0);
				switch(ch) {
				case 'y': case 'Y': break;
				case 'n': case 'N': return;
				}
				break;
			}
		}
		
	}
}
