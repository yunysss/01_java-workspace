package com.br.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map계열의 컬렉션 => 키+밸류 세트 저장
		
		/*
		Properties prop = new Properties(); // 제네릭 설정x
		
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		// 단, Properties를 주로 사용하는 경우는 Properties에 담겨있는 것들을 파일로 출력 또는 입력받아 올 때 사용함
		// store() : 파일로 저장 (출력)
		// load() : 파일로부터 불러오기 (입력)
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			// 내부적으로 Properties에 담겨있는 키, 밸류 들을 String 형변환해서 출력함
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 키 밸류 세트 모두 문자열로 담을 때 주로 사용
		
		Properties prop = new Properties();
		
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); // 동일 키값 => 덮어씌워짐
		
		System.out.println(prop);
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("list")); // 존재하지 않는 키값 제시하면 null 반환 **
		
		try {
			// 3. store(OutputStream os, String comments) => Properties 안에 담겨있는 Key-Value 세트들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// 4. storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
