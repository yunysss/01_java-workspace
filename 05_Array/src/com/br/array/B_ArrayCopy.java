package com.br.array;

import java.util.Arrays;
// import java.lang.*; => 알게모르게 포함되어있음 => java.lang 패키지 클래스들은 직접 import할 필요없음(ex. System, String, Math, ...)

public class B_ArrayCopy {
	
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		int[] copy = origin;
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}		
		System.out.println(); 
		
		copy[2] = 99;
		System.out.println("-------- 복사본 배열 값 변경 후 --------");
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}		
		System.out.println();
		
		// origin과 copy가 같은 참조하고 있음 (즉, 같은 주소값)
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		// 주소값만을 복사 => 얕은 복사
		
	}
	
	public void method2() {
		// 깊은복사방법1. for문을 활용한 방법
		//	새로운 배열을 생성한 후 반복문을 활용해서
		//	원본배열의 각 인덱스 값을 새로운 배열에 대입
		
			int[] origin = {1, 2, 3, 4, 5};
			int[] copy = new int[5];
		
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1];
		 * ...
		 * copy[4] = origin[4];
		 */		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		System.out.println("==원본배열출력==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}	
		System.out.println("\n==복사본배열출력==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	public void method3() {
		// 깊은복사방법2. System 클래스에서의 arraycopy 메소드를 이용한 방법
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // 0~9번인덱스까지 0이 담겨있을 것
		
		// System.arraycopy(원본배열명, 복사시작할인덱스, 복사본배열명, 복사본배열의복사될시작인덱스, 복사할갯수); => 생성 안하고 호출 가능 (ex. Math.random();, Arrays.copyOf();)
		//System.arraycopy(origin, 0, copy, 0, origin.length);
		System.arraycopy(origin, 2, copy, 5, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	public void method4() {		
		// 깊은복사방법3. Arrays클래스에서 제공하는 copyOf 메소드 이용 방법
		int[] origin = {1, 2, 3, 4, 5};
		// 복사본배열 = Arrays.copyOf(원본배열명, 복사할길이);
		int[] copy = Arrays.copyOf(origin, 10); 
		/*
		 * 내가 제시한 길이 만큼의 새로운 배열생성
		 * => 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 => 기존의 배열에 담겨있는 값 다 복사한 후 나머지 자리는 0
		 * 		 내가 제시한 길이가 원본배열의 크기보다 작을 경우 => 기존의 배열에 담겨있는 값 내가 제시한 길이만큼만 복사
		 */
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 깊은복사방법4. clone()메소드 이용한 방법
		int[] origin = {1, 2, 3, 4, 5};
		// 복사본배열 = 원본배열.clone();
		int[] copy = origin.clone(); // {1, 2, 3, 4, 5}
		
		System.out.println(Arrays.toString(copy)); // 배열의 각각의 인덱스에 있는 값을 문자열로 돌려줌
		
		System.out.println(origin == copy);
		
	}
}
