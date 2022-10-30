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
	
	public char alphabette() {
		char alph = ' ';
		while(alph < 'A' || alph > 'Z' && alph < 'a' || alph > 'z') {
			alph = (char)(int)(Math.random() * 58 + 65);
		}
		return alph;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		if(str != null) {
			String substr = "";
			for(int i = index1; i < index2; i++) {
				substr += str.charAt(i);
			}
			return "4. " + str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력 : " + substr;
		} else {
			return null;
		}
	}
}
