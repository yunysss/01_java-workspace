package com.br.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		try {
			// 5. load(InputStream is)
			//prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		/*
		 * * .properties 파일을 사용하는 경우
		 *   프로그램 상에 필요한 기본 환경설정 관련한 구문들 기술
		 *   (서버의 ip주소, dbms경로, 계정아이디, 계정비밀번호..)
		 *   그리고 해당 파일에 기술된 내용을 읽어들여서 자바에서 사용하게 됨
		 *   => 모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 쉽게 파악해서 수정하기 쉽다.
		 *   
		 * * .xml파일 특징
		 *   프로그래밍 언어들간에 있어서 호환이 쉽다. 
		 */
	}

}
