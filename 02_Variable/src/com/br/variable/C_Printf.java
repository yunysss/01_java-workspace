package com.br.variable;

public class C_Printf {

	public void printfTest() {
		
		// System.out.print(출력하고자하는값); => 값 출력만 (줄바꿈 x)
		// System.out.println(출력하고자하는값); => 값 출력 후 줄바꿈 o
		
		// System.out.printf("출력하고자하는형식(포맷)"[, 출력하고자하는값, 값, 값, ...]); / [] : 생략가능
		// => 출력하고자하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈x)
		
		/*
		 * 포맷안에서 쓰일수 있는 키워드
		 * %d : 정수 자리
		 * %c : 문자 자리
		 * %s : 문자열 자리 (문자도 가능)
		 * %f : 실수 자리
		 */
		
		System.out.printf("지금은 printf 연습\n");
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10, 20%
		System.out.println(iNum1 + ", " + iNum2 + "%");
		System.out.printf("%d, %d%%\n", iNum1, iNum2);
		
		System.out.printf("%d\n", iNum1, iNum2); // 첫번째 값만 출력
		//System.out.printf("%d %d\n", iNum1); // 에러발생
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽정렬(음수면 왼쪽)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2); // %f : 기본적으로 소수점 아래 6째자리까지 보여줌
		System.out.printf("%.3f %.1f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %C %S \n", ch, str, ch, str);
				
		
		
	}
	
}
