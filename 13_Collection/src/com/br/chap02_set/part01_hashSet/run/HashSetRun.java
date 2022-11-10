package com.br.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.br.chap02_set.part01_hashSet.model.vo.Student;

public class HashSetRun {

	public static void main(String[] args) {
		// Set 계열 특징 : 데이터만 저장 가능 / 순서 유지 안함 / 중복 객체 허용 안됨
		
		HashSet hs1 = new HashSet();
		
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		// 새로운 데이터를 추가할 때마다 동일객체(hashCode값 일치한지, equals비교시 true인지 : String class(실제 문자열로 비교))인지 판단함
		
		System.out.println(hs1); // 순서 유지X, 중복 데이터(동일객체) 보관X
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("김말똥", 26, 40));
		hs2.add(new Student("홍길동", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); // 중복 제거 x => 동일객체로 판단이 안되고 있기 때문 : Object class(주소값으로 비교)
		
		// * 동일객체 : 각 객체마다 hashCode 결과가 일치, equals 비교시 true여야됨
		
		// Student에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 다 일치하면 true/ 아니면 false
		// Student에 hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 다 일치하면 동일한 10진수 반환
		
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
		
		//System.out.println(hs2.get(1)); // 인덱스의 개념도 없고 get메소드 자체도 없음 (== 한 객체만 뽑을 수 없음)
		
		// 단, HashSet에 담긴 모든 객체들에 순차적으로 접근하는 건 가능
		// 방법1. for문 사용 가능 (단, 향상된 for문으로만 가능)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("==========================================");
		
		// 방법2. ArrayList에 옮겨 담은 후 ArrayList 반복문 돌려서 출력
		// >> ArrayList에 옮겨담기 1. addAll메소드 이용
		ArrayList<Student> list1 = new ArrayList<>();
		list1.addAll(hs2);
		
		// >> ArrayList에 옮겨담기 2. ArrayList 생성시 통채로 추가하기
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("==========================================");
		
		// 방법3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2에 담겨있는 객체들을 => Iterator에 담는 과정 (복사)
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		// StringTokenizer의 hasMoreTokens()와 비슷
		
		//it.next(); // NoSuchElementException 발생
	}
}
