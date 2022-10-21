package com.br.chap03.branch;

public class B_Continue {

	/* 
	 * continue;	: 반복문 안에서 기술되는 구문
	 * 				  continue; 구문 실행시 그 뒤의 구문들 실행되지 않고
	 * 				  곧바로 현재 속해있는 반복문 위로 올라감
	 */
	public void method1() {
		// 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		for(int i=1; i<=10; i++) {
			
			// i 값이 짝수일 경우 뒤의 출력문 실행 안되도록 바로 다음 반복문이 실행
			if(i % 2 == 0) {
				continue; // 출력문 실행되지 않고 반복문 위로 올라가 증감식 실행
			}
			
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 덧셈연산
		int sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {
				continue;
			}
			
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void method3() {
		// 2단 ~ 9단까지 출력
		// 단, 3의 배수단은 제외하고 출력
		
		for(int dan=2; dan<=9; dan++) {
			if(dan % 3 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "단 ===");
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
			}
			System.out.println();
		}
	}
}
