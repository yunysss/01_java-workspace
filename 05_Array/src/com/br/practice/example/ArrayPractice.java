package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		
		int[] arr = new int[10];
		for(int i=arr.length-1; i>=0; i--) {
			arr[i] = 10 - i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(arr[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char[] arr = new char[str.length()];
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			if(ch == arr[i]) {
				count++;
			}
		}
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(arr[num] + "요일");
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}		
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] arr = new int[num];
		
			if(num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요");
			continue;
			}
			
			for(int i=0; i<=num/2; i++) {
				arr[i] = i + 1;
			}
			for(int i=num/2+1; i<num; i++) {
				arr[i] = num - i;
			}
			for(int i=0; i<num; i++) {
				if(i == num-1) {
					System.out.println(arr[i]);
					break;
				}
				System.out.print(arr[i] + ", ");
			}			
		}
	}
	
	public void practice9() {
		
		String[] arr = {"후라이드", "양념", "양념반후라이드반", "뿌링클", "고추바사삭", "허니콤보", "알싸한마늘"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(chicken.equals(arr[i])) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println(chicken + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i<8) {
				arr[i] = str.charAt(i);
			} else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
}
