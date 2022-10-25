package com.br.chap01_abstraction.run;

import com.br.chap01_abstraction.model.vo.Student;

public class AbstractionRun {
	
	/*
	 * ex) 학생 관리 프로그램
	 * 	   1) 학생관련객체(홍길동 학생, 김영희 학생, 김말똥 학생, ...)
	 * 	   2) 공통적인 속성 및 기능들(이름, 나이, 주소, 전화번호, 키, 몸무게, 달리기속도, 학년, 반, 국어점수, 수학점수, 머리색깔, 발사이즈, 먹는다, 똥싼다, 잠잔다, ...)
	 * 	   3) 학생 "인적사항"을 관리하는 프로그램 : 이름, 나이, 주소, 전화번호, 학년, 반
	 * 	      학생 "성적"을 관리하는 프로그램 : 이름, 학년, 반, 국어점수, 수학점수
	 * 		  학생 "건강"을 관리하는 프로그램 : 이름, 학년, 반, 키, 몸무게, 달리기속도, 먹는다, 똥싼다
	 * 
	 * 		  결국 추려진게 "이름, 나이, 키" 라는 가정하에
	 * 	   4) 이름 : String name
	 * 		  나이 : int age
	 * 		  키 : double height
	 * 
	 * 6. 본격적인 프로그래밍
	 * 
	 * 	  1) "변수"만으로 프로그래밍을 한다면??
	 * 		  변수 - 하나의 자료형의 하나의 값만 보관
	 * 		  
	 * 		  홍길동 학생 객체 => String name1 = "홍길동"; int age1 = 20; double height1 = 162.3
	 * 		  김말똥 학생 객체 => String name2 = "김말똥"; int age2 = 21; double height2 = 173.4  
	 * 		   ...
	 * 
	 * 		  어떤문제? => 수백명의 학생객체들을 만들고자할때 수천개의 변수가 만들어짐
	 * 
	 * 	  2) "배열"만으로 프로그래밍을 한다면??
	 * 		  배열 - 하나의 자료형의 여러개의 값들을 보관
	 * 		  
	 * 		  학생들의 이름	String[] name = {"홍길동", "김말똥", "강개순", ...}
	 * 		  학생들의 나이     int[] age = {  20  ,   21  ,   22  , ...}
	 * 		  학생들의 키 double[] height = { 162.3, 173.4 , 182.7, ...}
	 *		 
	 *		  어떤문제? => 기존의 학생 정보를 지울때 잘못 지우면 값이 변질될 수 있음
	 *					새로운 학생 정보를 추가할 때 배열의 크기 변경 불가로, 배열 복사 후 값 추가하는 번거로움
	 *
	 *	  3) "구조체" 개념
	 *		  구조체 - 여러개의 자료형의 여러개의 값들을 보관할 수 있음
	 *		  
	 *		  String값도 담고, int값도 담고, double값도 담을 수 있는 나만의 배열같은 자료형 => 클래스
	 *		  Student 클래스 만들기 => model.vo(value object) 패키지에 보관
	 *
	 */
	public static void main(String[] args) {
		
		// 자바에서의 객체로 만들기 위해서
		// new를 이용해서 Heap영역에 생성
		int[] arr = new int[3];
		arr[0] = 10;
		
		Student hong = new Student(); // 객체생성구문
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		
		System.out.println(hong);
		System.out.println(hong.name + "님의 나이는 " + hong.age + "이고, 키는 " + hong.height + "cm입니다.");
		
		// 김말똥 학생 객체 만들기
		Student ddong = new Student();
		ddong.name = "김말똥";
		ddong.age = 21;
		ddong.height = 172.3;
		
		System.out.printf("%s님의 나이는 %d이고, 키는 %.1fcm입니다.", ddong.name, ddong.age, ddong.height);
		

	}

}
