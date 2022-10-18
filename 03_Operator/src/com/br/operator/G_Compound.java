package com.br.operator;

public class G_Compound {
	
	/*
	 * * 복합대입연산자
	 * 	 산술연산자와 대입연산자가 결합되어있는 형태
	 *   
	 *   +=  -=  *=  /=  %=
	 *   
	 *   a = a + 3;  => a += 3;
	 *   a = a - 3;  => a -= 3;
	 *   a = a * 3;  => a *= 3;
	 *   a = a / 3;  => a /= 3;
	 *   a = a % 3;  => a %= 3;
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("최초 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num += 3;
		System.out.println("또 3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("1/2 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("최종 num : " + num);
		
		// ---- 특이케이스 ----
		String str = "Hello";
		//str = str + "World";
		str += "World"; // 문자열 연이어 줄때는 +=만 가능
						// str += 10; 숫자도 연이어 줄 수 있음
		System.out.println(str);
		
	}

}
