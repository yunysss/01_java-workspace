package com.br.chap04_field.run;

import com.br.chap04_field.model.vo.FieldTest1;
import com.br.chap04_field.model.vo.FieldTest2;
import com.br.chap04_field.model.vo.FieldTest3;
import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class FieldRun {

	public static void main(String[] args) {
		
		/*
		FieldTest1 ft1 = new FieldTest1();
		
		ft1.test(10);
		*/
		
		/*
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		//System.out.println(ft2.pro);
		//System.out.println(ft2.def);
		//System.out.println(ft2.pri);
		*/
		
		
		System.out.println(FieldTest3.sta); 
		System.out.println(FieldTest2.sta);
		
		FieldTest3.sta = "수정수정";
		
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STAFIN);
		
		//FieldTest3.STAFIN = "새로운값"; => 값 변경 불가
		
		System.out.println(Math.PI);
		//Math.PI = 4.56;
		
		
	}

}
