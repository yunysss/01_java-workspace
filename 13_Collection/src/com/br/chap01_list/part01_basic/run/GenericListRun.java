package com.br.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music> 으로 설정
		ArrayList<Music> list = new ArrayList<>();
		
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		//list.add("끝");
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0); // 형변환 절차 필요없음
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());
		
		list.get(0).setTitle("밥이 달다");
		
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========================");
		
		for(Music o : list) {
			System.out.println(o);
		}
		
		/*
		 * * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환하는 절차를 없앨 수 있음
		 */
		

	}

}
