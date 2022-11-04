package com.br.chap02_string.controller;

import java.util.StringTokenizer;

public class D_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,Css,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		//       String 클래스에서 제공하는 split메소드
		
		String[] arr = str.split(",");
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰 객체로 관리하고자 할 때
		//       java.util.StringTokenizer 클래스 이용 (import 해야함)
		//       StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken()); // Java // 담겨있는 순서대로 차곡차곡 뽑힘. stn에서는 사라짐(1회용). 여러번 사용하려면 변수에 담아서 사용해야함
		System.out.println(stn.nextToken()); // Oracle
		System.out.println(stn.nextToken()); // JDBC
		System.out.println(stn.nextToken()); // HTML
		System.out.println(stn.nextToken()); // CSS
		System.out.println(stn.nextToken()); // Spring
		//System.out.println(stn.nextToken()); // NoSuchElementException 오류 발생 : 더 이상의 요소가 없음
		System.out.println(stn.countTokens());
		*/
		
		/*
		int count = stn.countTokens(); // 6
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}

}
