package com.br.chap01_poly.part02_electronic.run;

import com.br.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.br.chap01_poly.part02_electronic.model.vo.Desktop;
import com.br.chap01_poly.part02_electronic.model.vo.Electronic;
import com.br.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.br.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	// 실행용 클래스는 납품업체라고 생각
	public static void main(String[] args) {
		
		/*
		// 1. 다형성 적용안했을 경우 (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		
		// 추가
		es.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회
		Desktop d = es.selectDesktop();
		System.out.println(d);
		NoteBook n = es.selectNoteBook();
		System.out.println(n);
		System.out.println(es.selectTablet());
		*/
		
		// 2. 다형성 적용했을 경우 (ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회
		Desktop d =(Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * * 다형성을 사용하는 이유
		 * 1. 부모타입의 배열로 다양한 자식객체들을 받을 수 있음
		 * 2. 메소드 정의시 다형성 개념을 적용시키면 메소드 개수가 줄어듦
		 *    => Object클래스의 equals메소드의 매개변수가 Object타입으로 되어있음       
		 *       학생객체.equals(학생객체)
		 *       도서객체.equals(도서객체)
		 *       제품객체.equals(제품객체)
		 *       
		 */
		Object o1 = new Tablet();
		Object o2 = new Electronic();
				
	}

}
