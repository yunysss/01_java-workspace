package com.br.chap01_list.part01_basic.run;

import java.util.ArrayList;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
	/*
	 * 1. 컬렉션이란
	 *    자료구조가 내장되어있는 자바 클래스로 자바에서 제공하는 "자료구조를 담당하는 프레임워크"이다. 
	 *    
	 *    > 자료구조란?
	 *      방대한 데이터들을 효율적/구조적으로 관리(조회, 정렬, 추가, 수정, 삭제)하기 위한 개념 
	 *    
	 *    > 프레임워크란?
	 *      데이터나 기능들을 보다 쉽게 사용할 수 있도록 제공하는 틀 
	 *      
	 *    => 방대한 데이터들을 효율적으로 관리할 수 있는 기능들이 이미 내장되어있는 클래스다! 
	 *    
	 * 2. 배열과 컬렉션의 차이점 (배열의 단점 vs 컬렉션의 장점)
	 * 
	 *    > 배열
	 *    - 크기에 대한 제약이 많음 (크기 지정 필수, 한번 지정된 크기 변경 불가)
	 *    - 중간 위치에 추가하거나 삭제하는 경우 값을 뒤로 또는 앞으로 땡겨주는 작업을 직접 코드로써 구현해야됨
	 *    - 한 타입의 데이터만 저장 가능 
	 *    
	 *    > 컬렉션
	 *    - 크기에 대한 제약이 없음 (크기 지정 안해도됨, 알아서 크기 변경됨) 
	 *    - 중간 위치에 추가하거나 삭제하는 경우 값을 땡겨주는 알고리즘을 직접 구현할 필요없음 
	 *      이미 메소드로 제공하고 있기때문에 메소드 호출만으로 간단하게 처리할 수 있음 
	 *    - 여러 타입의 데이터 저장 가능 
	 *    
	 * 3. 컬렉션 종류 
	 * 
	 * 	  > List 계열
	 * 		- 데이터(value)만 저장 가능 
	 * 		- 순서 유지함 (index의 개념있음)
	 * 		- 중복된 데이터 허용됨
	 * 		- Vector, "ArrayList", LinkedList, ..
	 * 
	 * 	  > Set 계열
	 * 		- 데이터(value)만 저장 가능 
	 * 		- 순서 유지되지 않음 
	 * 		- 중복된 데이터 허용안됨
	 * 		- HashSet, TreeSet, ..
	 * 
	 * 	  > Map 계열
	 * 		- 키(key)와 데이터(value)를 함께 저장
	 * 		- 순서 유지되지 않음
	 * 		- value는 중복될 수 있으나 key는 중복허용안됨
	 * 		- HashMap, TreeMap, Properties, ..
	 *      
	 */

	public static void main(String[] args) {

		// ArrayList 이용
		
		ArrayList list = new ArrayList(3); // 크기 지정 할 수도 있고 안 할 수도 있음. 생략하면 기본적으로 10짜리 배열 생성
		
		System.out.println(list); // 안에 아무것도 없음! (비어있는 상태) []
		
		
		// E --> Element : 리스트에 담길 데이터들(요소)
		
		// 1. add(E e) : 리스트의 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		list.add("끝");
		// 장점1. 크기의 제약 없음
		// 장점3. 여러타입 보관 가능
		
		System.out.println(list); // list 특징 : 순서유지 하면서 담김 (0번 인덱스부터 차곡차곡)
		
		// 2. add(int index, E e) : 해당 인덱스위치에 데이터를 추가시켜주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		// 장점2. 중간 위치에 데이터 추가시 복잡한 알고리즘 직접 구현 안함
		
		System.out.println(list);
		
		// 3. remove(int index) : 해당 인덱스위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list);
		
		// 4. set(int index, E e) : 해당 인덱스위치에 데이터를 새로이 전달된 e로 변경시켜주는 메소드
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		// 5. size() : 리스트의 사이즈를 반환시켜주는 메소드
		System.out.println("리스트의 사이즈 : " + list.size()); // 배열의 length와 비슷
		System.out.println("리스트의 마지막 인덱스수 : " + (list.size() - 1));
		
		// 6. get(int index) : E => 해당 인덱스위치의 객체를 반환시켜주는 메소드
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)list.get(1)).getTitle());
	}
}
