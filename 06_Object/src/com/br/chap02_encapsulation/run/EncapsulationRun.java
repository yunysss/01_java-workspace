package com.br.chap02_encapsulation.run;

import com.br.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {

	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		hong.korScore = 100;
		hong.mathScore = 90;
		*/
		// private으로 하면 외부에서 직접접근 불가
		
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(162.3);
		hong.setKorScore(100);
		hong.setMathScore(90);
		
		//System.out.println(hong.name);
		
		System.out.println(hong.getName());
		//String name = hong.getName();
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
		hong.setAge(21);
		System.out.println(hong.getAge());
		
		/*
		 * * 캡슐화 : "데이터의 접근제한"을 원칙으로 외부로부터 "데이터의 직접 접근을 막고"
		 *          대신에 "간접적으로나마 처리(값을 대입, 값을 대돌려주거나)"할 메소드를 클래스 내부에 작성
		 *          
		 * 	1) 정보은닉 : private
		 *     직접 접근을 막기 위해 private 라는 접근제한자 이용
		 *     
		 * 	2) setter/getter메소드
		 *     setter메소드 : 해당 필드에 대입시키고자하는 값 전달받아 대입시켜주는 기능 (변경)
		 *     getter메소드 : 해당 필드에 담긴 값을 반환시켜주는 기능 (조회) 
		 */
	}

}
