package com.hw3.controller;

public class Function {
	
	public void printLottoNumbers() {
		
		System.out.print("1. 랜덤 값 : ");
		for(int i=0; i<6; i++) {
			int random = (int)(Math.random() * 45 + 1);
			System.out.print(random + " ");
		}
	}
	
	public void outputChar(int num, char c) {
		System.out.print("\n2. " + c + "문자 " + num + "개 출력 : ");
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}
}
