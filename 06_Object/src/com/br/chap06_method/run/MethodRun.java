package com.br.chap06_method.run;

import java.util.Scanner;

import com.br.chap06_method.controller.MethodTest1;
import com.br.chap06_method.controller.OverloadingTest;

public class MethodRun {

	public static void main(String[] args) {		
		/*
		MethodTest1 test1 = new MethodTest1();
		
		test1.method1();
		
		//String str = test1.method2(); 
		//System.out.println(str);		
		System.out.println(test1.method2());
		
		test1.method3(10, 5);
		test1.method3(20, 0);
		
		char ch = test1.method4("pineapple", 3);
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num < str.length()) {
			System.out.println("결과 : " + test1.method4(str, num));
		} else {
			System.out.println("부적절한 정수를 입력했습니다.");
		}
		*/
		
		MethodTest2.method1(); // static method => 살짝 기울인꼴
		//int sum = MethodTest2.method2();
		System.out.println(MethodTest2.method2());
		MethodTest2.method3("윤예서");
		System.out.println(MethodTest2.method4("홍길동", "김말똥"));		
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(30, "gg");
		ot.test("gg", 40);
		ot.test(10, 20);
		ot.test("윤예서");
		
		// 오버로딩의 대표적인 예 => 출력문
		System.out.println(10);
		System.out.println("ss");
		System.out.println(0.3);
		
	}

}
