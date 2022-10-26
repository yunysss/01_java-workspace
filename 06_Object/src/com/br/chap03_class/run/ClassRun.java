package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.*;

public class ClassRun {

	public static void main(String[] args) {
		
		Person kang = new Person();
		
		// 생성만 했을 때 각 필드에 기본값이 초기화 되어있음
		/*
		System.out.println(kang.getId()); // null
		System.out.println(kang.getAge());
		System.out.println(kang.getGender());
		*/
		
		kang.setId("user01");
		kang.setPwd("pass01");
		kang.setName("강보람");
		kang.setAge(34);
		kang.setGender('F');
		kang.setPhone("010-1111-2222");
		kang.setEmail("teacherboram@gmail.com");
		
		/*
		System.out.println(kang.getId());
		System.out.println(kang.getPwd());
		System.out.println(kang.getName());
		System.out.println(kang.getAge());
		System.out.println(kang.getGender());
		System.out.println(kang.getPhone());
		System.out.println(kang.getEmail());
		*/
		
		System.out.println(kang.information());
		
		System.out.println("==========================");
		
		Product p = new Product();
		
		p.setpName("텀블러");
		p.setPrice(50000);
		p.setBrand("스탠리");
		
		System.out.println(p.getpName());
		System.out.println(p.getPrice());
		System.out.println(p.getBrand());
		
		System.out.println(p.information());
	}

}
