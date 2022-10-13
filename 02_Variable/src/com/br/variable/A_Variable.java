package com.br.variable;

public class A_Variable {
	
	/*
	 * * 학습목표
	 * 1. 변수가 뭔지
	 * 2. 변수를 왜 사용하는지
	 * 3. 변수를 어떻게 쓰면 되는지
	 * 4. 변수명을 어떻게 지으면 되는지 (명명규칙)
	 * 5. 상수가 뭔지
	 */
	
	public void printValue() {
		
		System.out.println("변수 사용 전");
		
		System.out.println(9160 * 8);
		System.out.println(9160 * 8 * 5);
		System.out.println(9160 * 8 * 5 * 4);
		System.out.println(9160 * 8 * 5 * 4 * 0.1);
		// 무슨 의미인지 파악하기 어려움
		System.out.println("=======");
		
		System.out.println("변수 사용 후");
		
		// 1. 변수란? --> 어떠한 값을 메모리상에 기록하기 위한 공간이다. (박스같은 개념)
		int pay = 9160; // 시급
		int hour = 8; 	// 하루 중 근무시간
		int day = 5; 	// 일주일 중 근무일수
		int week = 4;	// 한달 중 근무주수
		double tax = 0.1; // 세금 10%
		
		System.out.println(pay * hour); // 하루치 급여
		System.out.println(pay * hour * day); // 일주일치 급여
		System.out.println(pay * hour * day * week); // 한달치 급여
		System.out.println(pay * hour * day * week * tax); // 내야될 세금
		
		/*
		 * 2. 변수를 사용하는 이유
		 * - 값에 의미를 부여하기 위한 목적 (가독성이 좋아짐)
		 * - 한 번 값을 저장해 두고 계속 사용할 목적으로 사용
		 * - 유지보수에 용이하다.
		 */
	}
	
	public void declareVariable() {
		
		/*
		 * 3. 변수의 선언 (값을 기록하기 위한 변수를 메모리상에 공간을 확보해놓겠다.)
		 *    == 변수(박스) 만들겠다!
		 *    
		 *    [표현법] 자료형 변수명;
		 *    
		 *    자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는거
		 *    변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여)
		 *    
		 *    * 주의할점
		 *    - 변수명은 소문자로 시작
		 *    - 여러단어일 경우 낙타표기법
		 *    - 특정 영역 ({})에서 중복된 변수명으로 재 선언 불가
		 *    - 특정 영역 ({})에서 선언된 변수는 해당 영역안에서만 사용 가능 (지역변수개념)
		 *    
		 *    > 변수에 대입
		 *    [표현법] 변수명 = 값;
		 *    
		 *    > 변수 선언과 동시에 대입
		 *	  [표현법] 자료형 변수명 = 값;
		 */
		
		// --- 자료형 종류 ---
		// 1. 논리형 (논리값 = true/false)
		//boolean bool; // 선언 후
		//bool = true; // 대입
		
		boolean bool = true; // 변수 선언과 동시에 초기화
		
		System.out.println(bool);
		
		bool = false; // 새로운 값 대입
		
		System.out.println(bool);
		
		boolean bool2 = 4 < 2;
		
		System.out.println("bool2의 값 : " + bool2);
		
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum = -128;	// 1byte (-128 ~ 127)
		short sNum = 30000; // 2byte
		int iNum = 1000000000; // 4byte (-21억xxx ~ 21억xxx)
							   // 정수형의 가장 대표적인 자료형 (기본형)
		long lNum = 10000000000L; // 8byte 
		
		// 2_2. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte
						   // 실수형의 가장 대표적인 자료형 (기본형)
		
		// 3. 문자형
		char ch = 'A'; // 2byte
		ch = '강';
		
		// -------- 여기까지가 기본자료형(8개) --------
		
		// 4. 문자열 (참조자료형) ==> 나중에 자세히 다룰 예정
		String str = "ABC";
		
		
		
		
		// 번외 (큰 숫자값 같은경우 _를 이용해서 가독성을 높일 수 있음)
		int etc = 999_999_999; // 실질적으로는 999999999 담겨있음
		
		// 4. 변수 명명 규칙
		int number;
		
		// 1) 변수명 중복 불가 (단, 대소문자는 구분함)
		//byte number;
		int numBer;
		
		// 2) 변수명으로 예약어(이미 자바에서 사용되고 있는 키워드들) 사용 불가
		/*
		int true;
		int public;
		int class;
		int void;
		int static;
		*/
		
		// 3) 숫자 가능 (단, 숫자로 시작하는건 안됨)
		int a1ge1;
		//int 1age;
		
		// 4) 특수문자 가능 (단, _ $ 이외의 특수문자 안됨)
		int num_ber;
		int num$ber;
		int _number;
		int $number;
		//int #number;
		//int !number;
		
		// * 낙타표기법 지키기
		String username;
		String userName; // 관례상 권장하는 표현법
		
		// * 한글을 쓸 수 있지만 쓰지말자
		String 이름;
		
	}
	
	public void constant() {
		/*
		 * 5. 상수란?
		 *    변수와 동일하게 특정 값을 메모리상에 기록하기위한 박스 같은 존재
		 *    변수와의 차이점으로 값을 변경하는게 불가
		 *    즉, 한번 대입된 값은 더이상 변경이 불가능
		 *    
		 *    [표현법] final 자료형 상수이름;
		 *    
		 *    상수명은 다 대문자로 하는걸 권장
		 */
		
		int age = 20;
		age = 30; //변수는 값 변경 가능
		
		final int AGE = 20;
		//AGE = 30; //상수는 값 변경 불가능
		
	}
	
	
	/*
	 * - 값(리터럴) : 프로그램상에 필요한 명시적인 data / 또는 사용자가 마우스 또는 키보드로 입력한 data
	 * - 변수 : 값을 메모리상에 저장하기 위한 공간 (박스같은 존재)
	 * 		   (한 개의 값만 담을 수 있고 / 자료형에 맞는 값만 담을 수 있고 /
	 * 			새로운 값을 다시 대입할 수 있음)
	 * - 상수 : 변수와 비슷하나 값 변경이 불가능
	 * 		   (final 붙여서 선언 / 상수명은 다 대문자로 하는걸 권장)
	 */

}
