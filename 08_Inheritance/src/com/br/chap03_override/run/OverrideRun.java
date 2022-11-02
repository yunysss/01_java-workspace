package com.br.chap03_override.run;

import com.br.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {

		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다.", "고래", 200);
		
		System.out.println(bk1.toString());
		System.out.println(bk2/*.toString()*/);
		// 출력문에 레퍼런스 변수 제시시 내부적으로 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출해서 이때 돌아온 결과 출력
		
		// 오버라이딩 전 : Object클래스의 toString() 실행 => "자료형(풀클래스명) + @ + 주소값의 16진수" 반환
		// 오버라이딩 후 : Book클래스의 toString() 실행   => 해당 객체가 가지고 있는 모든 필드값들을 한 문자열로 합쳐 반환
		
		// -------------------------------------------------------------------------------------------
		
		Book bk3 = new Book("수학의 정석", "나수학", 100); //bk1과 동일한 필드값을 가진 bk3
		
		System.out.println("bk1과 bk3가 같은 책입니까? : " + (bk1 == bk3));
		// 기본자료형간의 동등비교시에는 == 연산자 이용
		// 참조자료형(레퍼런스)간에 동등비교시는 equals메소드이용
		System.out.println("bk1과 bk3가 같은 책입니까 ? : " + bk1.equals(bk3));
		
		// 오버라이딩 전 : Object클래스의 equals()메소드 실행 => 두 주소값을 동등비교해서 반환
		// 오버라이딩 후 : Book클래스의 equals()메소드 실행 => 두 객체의 주소값 비교가 아닌 실제 필드값들이 다 같으면 true 반환
		
		// 동일객체(중복객체) : 실제 필드값들도 같고(equals메소드 호출시 true) 해쉬코드값도 일치할 경우
		
		System.out.println("bk1의 해쉬코드 : " + bk1.hashCode());
		System.out.println("bk3의 해쉬코드 : " + bk3.hashCode());
		
		// 오버라이딩 전 : Object클래스의 hashCode()메소드 실행 => 실제 "주소값"을 10진수로 계산한 결과 반환
		// 오버라이딩 후 : Book클래스의 hashCode()메소드 실행 => 실제 "필드값"을 가지고 10진수로 반환
	}

}
