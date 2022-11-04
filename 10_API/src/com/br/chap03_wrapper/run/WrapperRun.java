package com.br.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
 
		/*
		 * * Wrapper 클래스
		 *   => 기본자료형을 객체화 시킬 수 있는 클래스들
		 *   
		 *      기본자료형  <-->  Wrapper클래스
		 *      boolean		   Boolean
		 *      byte		   Byte
		 *      short          Short
		 *      int		       Integar *
		 *      long		   Long
		 *      float          Float
		 *      double		   Double
		 *      char		   Character *
		 *      
		 * * 기본자료형을 객체로 취급해야하는 경우
		 * - 메소드 호출해야될때
		 * - 매개변수가 기본자료형이 아닌 객체타입만을 요구할 때
		 * - 다형성을 적용시키고 싶을 때
		 */
		
		// Boxing : 기본자료형 => Wrapper클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		//num1.equals(num2);
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num1 => i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞이 크면 1, 일치하면 0, 뒤가 더 크면 -1 반환
		
		// 2. 객체 생성할 필요 없이 곧바로 대입 (AutoBoxing)
		Integer i3 = num1; // 양쪽 타입 달라도 허용
		System.out.println(i3);
		
		// UnBoxing : Wrapper클래스 자료형 => 기본자료형
		// 1. 해당 Wrapper클래스에서 제공하는 xxxValue() 메소드를 이용
		int num3 = i1.intValue(); // i1 => num3
		System.out.println(num3);
		
		// 2. 메소드 사용하지 않고 바로 대입 (AutoUnBoxing)
		int num4 = i2;
		System.out.println(num4);
		
		System.out.println("==========================");
		
		// 기본자료형 <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 문자열로 작업됨
		
		// * String --> 기본자료형
		//    "10"  -->   10   (int)
		//   "15.3" -->  15.3  (double)
		// 해당 Wrapper클래스.parseXXX() 사용 (parsing)
		int i = Integer.parseInt(str1); // 10
		double d = Double.parseDouble(str2); // 15.3
		
		System.out.println(i + d);
		
		// * 기본자료형 --> String
		//     10   -->  "10"
		//    15.3  --> "15.3"
		// String.valueOf() 사용
		String strI = String.valueOf(i); // "10"
		String strD = String.valueOf(d); // "15.3"
		
		
	}

}
