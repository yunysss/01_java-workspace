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
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				} 
			break;
			} 
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");		
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
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=num; i>0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
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
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
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
				} break;
			} System.out.println("1 이상의 숫자를 입력해주세요");	
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
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				for(int i=num; i<=9; i++) {
					System.out.println("=====" + i + "단 =====");
					for(int j=1; j<=9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i*j);
					} System.out.println();
				} break;
			} 
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
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				if(op.equals("/") && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;			
				} else {
					switch(op) {
					case "+": System.out.printf("%d %s %d = %d", num1, op, num2, num1 + num2); break;
					case "-": System.out.printf("%d %s %d = %d", num1, op, num2, num1 - num2); break;
					case "*": System.out.printf("%d %s %d = %d", num1, op, num2, num1 * num2); break;
					case "/": System.out.printf("%d %s %d = %d", num1, op, num2, num1 / num2); break;
					case "%": System.out.printf("%d %s %d = %d", num1, op, num2, num1 % num2); break;
					default : System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
					}
				break;
				}
			}
		}
	}
}
