package com.br.chap02_abstractAndInterface.part01_abstract.run;

import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.BasketBall;
import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class AbstractRun {

	public static void main(String[] args) {
		
		//Sports s = new Sports(); // 추상클래스로 객체 생성 불가
		//Sports s; // 객체 생성이 안될뿐이지 레퍼런스로는 사용 가능
		Sports s = new BasketBall(); // 다형성 적용 가능
		
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule(); // 동적바인딩
		}
		
		for(Sports a : arr) { // Sports a = arr[0]; => Sports a = arr[1];
			a.rule();
		}
		
		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부({})가 구현되어 있지 않은 메소드
		 * - 자식클래스에서 해당 메소드를 오버라이딩하여 완성시켜야됨
		 * 
		 * * 추상클래스
		 * - 미완성된 클래스
		 * - 객체 생성 불가 (단, 레퍼런스로는 사용 가능)
		 * - 일반멤버변수 + 일반메소드 [+ 추상메소드]
		 *   => 추상메소드 생략가능
		 *   
		 * * 추상메소드가 굳이 없어도 추상클래스로 선언 가능
		 *   언제?
		 *   >> 개념적 : 단지 이 클래스가 미완성된 클래스다 라는 걸 부여할 목적
		 *   >> 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때
		 *   
		 * * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 *   부모클래스에 추상메소드가 있을 경우
		 *   자식클래스에서 강제로 오버라이딩 해서 동일한 패턴의 메소드를 가지게 됨
		 *   => 자식클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할때
		 *      => 메소드 통일성 확보
		 *      => 표준화됨
		 */

	}

}
