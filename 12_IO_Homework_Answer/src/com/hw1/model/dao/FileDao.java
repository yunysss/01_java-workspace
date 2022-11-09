package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		System.out.print("파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		
		String content = null;
		
		while(true) {
			content = sc.nextLine();
			if(content.equalsIgnoreCase("exit")) {
				break;
			}else {
				sb.append(content + "\n");
			}			
			
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) {
			System.out.print("저장할 파일명을 입력하시오 : ");
			String fileName = sc.nextLine();
			BufferedWriter bw = null;
			
			try{
				bw = new BufferedWriter(new FileWriter(fileName+".txt"));
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}else {	
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}
	
	public void filOpen() {
		System.out.print("열기 할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		String content = null;
		try {
			
			br = new BufferedReader(new FileReader(fileName+".txt"));
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(br != null) { // FileNotFoundException발생시 br이 제대로 생성되지 않아 null이므로 NullPointerException이 발생될 수 있음
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void fileEdit() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		System.out.print("수정할 파일명 : ");
		String fileName = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String content = null;
		
		try{
			
			br = new BufferedReader(new FileReader(fileName+".txt"));
			bw = new BufferedWriter(new FileWriter(fileName+".txt", true));	// 기존 파일 내용 그대로 두고 추가
			
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
			
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				content = sc.nextLine();
				if(content.equalsIgnoreCase("exit"))
					break;
				else {
					sb.append(content);
					sb.append("\n");
				}			
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) {
				bw.write(sb.toString());
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");		
			}else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null && bw != null) {
					br.close();
					bw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
