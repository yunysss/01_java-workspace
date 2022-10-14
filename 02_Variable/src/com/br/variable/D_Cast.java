package com.br.variable;

public class D_Cast {

	/*
	 * * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * * 컴퓨터에서의 값 처리 규칙
	 * 1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야된다.
	 * 	  => 즉, 같은 자료형에 해당하는 값만 대입이 가능하다.
	 *       혹시라도 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
	 * 
	 * 2. 같은 자료형끼리만 연산이 가능 / 연산 결과도 같은 자료형으로 나옴
	 *    값 - 값
	 *    
	 * * 형변환의 종류
	 * 1. 자동 형변환 (내가 직접 형변환 시켜줄 필요없음)
	 * 2. 강제(명시적) 형변환 (내가 직접 형변환 시켜줘야됨)
	 *    [표현법] (바꿀자료형)값
	 */
	
	// 자동형변환
	public void autoCasting() {
		
		/*
		 * * 자동 형변환
		 *   자료형이 다른 두 값 간의 연산(대입, 계산 등) 시
		 *   자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환되어 처리됨
		 */
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1; // 12 => 12.0
		
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // 12.0 + 3.3 => 15.3
		System.out.println("result : " + result);
		
		// 2. int(4byte) --> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		// 3. float(4byte) --> double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/f4;
		
		// ========== 특이케이스 ==========
		// 특이1. long(8byte) --> float(4byte)
		//       float이 실수형이기 때문에 long형보다도 표현 가능한 수의 범위가 더 크기때문에
		float f5 = /*(float)*/l3;
		
		// 특이2. char(2byte) <-> int(4byte)
		int num = 'A';
		char ch = 97;
		// 각 문자들마다 고유한 숫자가 지정되어있기 때문에 쌍방향으로 형변환 가능
		
		System.out.println("num : " + num); // A == 65
		System.out.println("ch : " + ch);   // a == 97
		// 단, char에 음수값 저장 불가 => 0~65535
		
		
	}
	
	// 강제형변환
	public void forceCasting() {
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 강제로 바꾸는 것
		
		// 1. double(8byte) --> float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		
		// 2. double(8byte) --> int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int result = iNum + dNum; // 10.0 + 5.89 => 15.89
									// 연산결과인 double형이 int형에 대입 불가
		
		// 해결방법1. 연산결과를 int형으로 강제형변환
		int result1 = (int)(iNum + dNum); // (int)15.89 => 15
		System.out.println("result1 : " + result1);
		
		// 해결방법2. 덧셈연산시 double형 값만을 int형으로 강제형변환
		int result2 = iNum + (int)dNum; // 10 + 5 => 15
		System.out.println("result2 : " + result2);
		
		// 실수값을 정수값으로 강제형변환시 소수점 아래 부분은 버림처리
		// => 데이터 손실이 발생될 수 있음
	
		// 해결방법3. 연산 결과를 그에 맞는 자료형의 변수에 대입
		double result3 = iNum + dNum;
		System.out.println("result3 : " + result3);
	}
	
}
