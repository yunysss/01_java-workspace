package com.br.chap01_poly.run;

import com.br.chap01_poly.part01_basic.model.vo.Child1;
import com.br.chap01_poly.part01_basic.model.vo.Child2;
import com.br.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// '=' 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야됨
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		//((Parent)c1).printParent(); // 자동형변환이 되고 있었음
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (다형성)");
		Parent p2 = /*(Parent)*/new Child1();	// 자동형변환됨
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환 하면 호출은 가능!
		// p2 래퍼런스는 당장 Parent에만 접근 가능하지만
		// Child1타입으로 강제형변환 하면 Child1까지도 접근 가능
		
		/*
		 * "상속구조"의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting
		 *    자식 타입 --> 부모 타입
		 *    자동 형변환 
		 * 
		 * 2. DownCasting
		 *    부모 타입 --> 자식 타입
		 *    강제 형변환
		 */
		
		/*
		 * * 다형성의 정의
		 * - 부모타입으로부터 파생된 여러타입의 자식 객체들을 부모타입 하나로 다룰수 있는 기술
		 * 
		 * * 다형성을 쓰는 목적 (장점)
		 * - 코드 길이 감소
		 */
		
		// 다형성을 적용하기 전
		// Child1 객체 2개와 Child2 객체 2개를 관리
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 3, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// ----------------------------------------
		// 다형성을 적용한 후
		Parent[] arr = new Parent[4];
		
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 3, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 1, 5);
		
		System.out.println("========================");
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		//((Child1)arr[2]).printChild1(); // ClassCastException : 부적절한 클래스형변환시
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("========반복문 이용========");
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof => 현재 레퍼런스가 실질적으로 어떤 클래스타입을 참조하는지 확인할 때 사용 
			 */
			if(arr[i] instanceof Child1) { // arr[i] 레퍼런스가 실제 Child1 참조하고 있을 경우 true
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			
		}
		
		System.out.println("========================");
		/*
		Child1 cc =new Child1();
		cc.print();
		
		Parent pp = new Child1();
		pp.print();
		
		동적바인딩 : 프로그램 실행되기 전 "컴파일시"에는 정적바인딩됨(레퍼런스타입의 메소드를 가리킴)
		          단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어있다면 프로그램 "실행시(런타임시)" 동적으로 자식클래스에 오버라이딩 된 메소드를 찾아서 실행
		*/
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
