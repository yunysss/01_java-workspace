package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		// 초기식, 조건식, 증감식으로 이루어져있는 for문 => for loop문
		
		// 배열 또는 컬렉션과 함께 사용되는 for문
		// 0번 부터 마지막까지 순차적으로 접근할 목적 => 향상된 for문(for each문) // 조회할 때 사용 (생성시에는 for loop문 사용)
		// 단, 자바 5버전 이상부터 사용 가능
		/*
		 * for(순차적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션) { // 반복횟수 == 배열또는컬렉션의 크기
		 * 		반복적으로 실행할 내용
		 * }
		 */
		
		int[] arr = {10, 20, 30};
		
		for(int i=0; i<arr.length; i++) { // for loop문
			System.out.println(arr[i]);
		}
		
		//      int  : int[]
		for(int value : arr) { // value = arr[0]; => value = arr[1]; => value = arr[2]; // 변수의 자료형 대입될 값과 일치시키기!
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("아이폰", "애플", 1400000, "14pro");
		phones[1] = new Phone("갤럭시", "삼성", 1200000, "노트20");
		phones[2] = new Phone("벨벳폰", "LG", 900000, "1");		
		phones[2].setSeries("없음");
		
		int total = 0;
		//   Phone  : Phone[]
		for(Phone p : phones) { // p = phones[0] => p = phones[1] => p = phones[2]
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("총가격 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		boolean flag = true;
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("가격 : " + p.getPrice() + "원");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("저희 가게에서 판매하는 핸드폰이 아닙니다.");
		}
	}

}
