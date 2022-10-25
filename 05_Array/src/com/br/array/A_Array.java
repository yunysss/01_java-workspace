package com.br.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 		단, "같은 자료형의 값"으로만 담을 수 있음       
	 */

	public void method1() {
		// * 배열을 안 썼을 경우
		// 변수만 이용하게 되면 => 대량의 데이터들을 보관하고자 할 경우 각각의 변수를 만들어서 따로 관리
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력시에도 일일이 출력 (반복문 활용 불가)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 총 합을 구할때도 일일이 더해줘야함 (반복문 활용 불가)
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		/*
		 * 1. 배열 선언
		 * 	  자료형 배열명[];
		 * 	  자료형[] 배열명;
		 */
		//int a; // 변수 선언
		
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당 (몇개의 값들을 보관할건지 크기 지정하는 과정 => 그 갯수만큼의 방이 만들어짐)
		 *    배열명 = new 자료형[배열크기];
		 */
		//arr = new int[5];
		
		// ** 배열 선언과 동시에 할당 **
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입 (배열의 특정위치의 방에 값을 대입)
		 *    배열명[인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점 : 반복문을 활용할 수 있음
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 실제 arr에는 "주소값"이 담겨있음
		
	}
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println(i);
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수를 일반 변수
		 * 주소값을 담고 있는 변수는 참조 변수(레퍼런스 변수)
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언된 변수
		 * => 실제 리터럴값을 바로 담는 변수 => 일반 변수
		 * 
		 * 그 외 자료형(int[], double[], char[], short[], ... String, Scanner, ...)으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조 변수(레퍼런스 변수)
		 */
		
		// 배열 선언 및 크기지정까지만 한 상태
		for(int j=0; j<5; j++) {
			System.out.println(iArr[j]);
		}
				
		for(int j=0; j<3; j++) {
			System.out.println(dArr[j]);
		}
		
		// 각 인덱스에 직접 값 대입하지 않아도
		// 초기화 되어있음! 왜?
		// => Heap에는 빈공간이 존재할 수 없음
		// => JVM이 기본값을 초기화(대입) 해줌
	}
	
	public void method3() {
		int[] arr = new int[5];
		
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println(arr); // 배열의자료형 + @ + 주소값의 16진수형태
		System.out.println(arr.hashCode()); // 주소값의10진수형태
		
	}
	
	public void method4() {
		int result = 0;
		double d = 0.0;
		
		int[] arr = null; // 아무것도 참조하고 있지 않음
		// 주소값을 담는 레퍼런스 변수의 기본값은 null
		
		System.out.println(arr);
		
		// null인 상태(생성하지 않은 상태)로 메소드 호출하거나 어딘가에 접근하고자 할 경우
		// 오류발생 => NullPointerException
		//System.out.println(arr.length); 
		//System.out.println(arr.hashCode());
		//System.out.println(arr[0]);
	}
	
	public void method5() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2 * (i + 1); 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
	}
	public void remind() {
		
		int[] ages = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ages.length; i++) {
			System.out.print("나이 : ");
			ages[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
			sum += ages[i];
		}
		System.out.println("총 합 : " + sum);
		System.out.println("평균 나이 : " + (double)sum / ages.length);
	}
}
