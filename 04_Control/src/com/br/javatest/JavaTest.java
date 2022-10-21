package com.br.javatest;

import java.util.Scanner;

public class JavaTest {
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1(1~9) : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2(1~9) : ");
		int num2 = sc.nextInt();
		
		int result = num1 * num2;
		if(num1>=1 && num1<=9 && num2>=1 && num2<=9) {
			if(result <= 9) {
				System.out.println("한 자리 수입니다.");
			} else {
				System.out.println("두 자리 수입니다.");
			}
			
		} else {
			System.out.println("잘못입력되었습니다.");
		}
		
	}
	
	public void test2() {
		
		int sum = 0;
		int cal = 0;
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				i++;
				continue;
			} else {
				sum += i++;
				cal++;
			}
		}
		System.out.println("3의 배수를 제외한 모든 정수들의 합 : " + sum);
		System.out.println("3의 배수를 제외한 모든 정수들의 평균 : " + sum/cal);
	}
	
	public void test3() {
		
		for(int dan=2; dan<=5; dan++) {
			if(dan % 2 != 0) {
				System.out.println("=====" + dan + "단 =====");
					for(int su=1; su<=9; su+=2) {
						System.out.printf("%d x %d = %d\n", dan, su, dan*su);
					}
					System.out.println();
				}
		}
	}
}
