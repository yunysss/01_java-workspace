package com.br.chap01_list.part02_mvc.run;

import com.br.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		
		/*
		 * * MVC 패턴 : 각 클래스마다 역할(데이터담당, 화면담당, 요청처리담당)을 부여해서 작업
		 *            => 유지보수 용이
		 *            
		 * -M(Model) : 데이터 담당 (데이터들을 담기 위한 클래스(vo), 비즈니스 로직 처리하기 위한 클래스(service), 데이터 보관함과 연결해서 입출력하는 클래스(dao))
		 * -V(View)  : 화면 담당 즉, 사용자에게 보여지는 시각적인 요소 (출력문(print문), 입력문(Scanner))
		 * -C(Controller) : 요청처리 담당 (사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할)
		 */

		new MusicMenu().mainMenu();
	}

}