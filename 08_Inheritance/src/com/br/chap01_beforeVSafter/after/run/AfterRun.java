package com.br.chap01_beforeVSafter.after.run;

import com.br.chap01_beforeVSafter.after.model.vo.Desktop;
import com.br.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.br.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		Tv t = new Tv("엘지", "t-01", "겂나얇은티비", 3500000, 65);
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");

		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * * 상속이란
		 * - 부모(상위) 자식(하위) 간의 구조로 클래스를 구성하는 것
		 *   다른 클래스가 가지고 있는 필드 및 메소드들을 새로 작성할 필요 없이 마치 내 것처럼 사용할 수 있는 기술
		 *   
		 * * 상속의 장점
		 * - 공통적인 코드들을 부모 클래스로 한번 정의해두면 새로운 클래스 작성시 보다 적은 양의 코드로 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이
		 *   (프로그램의 생산성과 유지보수에 크게 기여)
		 */
	}

}
