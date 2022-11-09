package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fc = new FileDao();
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : fc.fileSave(); break;
			case 2 : fc.filOpen(); break;
			case 3 : fc.fileEdit(); break;
			case 4 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}

}
