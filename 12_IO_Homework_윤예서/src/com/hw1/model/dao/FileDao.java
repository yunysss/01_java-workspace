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
		
		
		System.out.print("파일에 저장할 내용을 입력하시오 (\"exit\" 을 입력하면 내용 입력 끝) : ");
		while(true) {
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				sb.append(str + "\n");
			}
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().toUpperCase().charAt(0);
		if(ch == 'Y') {
			System.out.print("저장할 파일명을 입력하시오 : ");
			String str = sc.nextLine();
			
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(str + ".txt"));
				bw.write(sb.toString());
				System.out.println(str + ".txt 파일에 성공적으로 저장하였습니다.");
			}catch( IOException e ) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}		
	}

	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String str = sc.nextLine();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(str + ".txt"));
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}			
		}catch(FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void fileEdit() {
		System.out.print("수정 할 파일명 : ");
		String str = sc.nextLine();
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(str + ".txt"));
			bw = new BufferedWriter(new FileWriter(str + ".txt", true));
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			StringBuilder sb = new StringBuilder();
			
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				String s = sc.nextLine();
				if(s.equals("exit")) {
					break;
				} else {
					sb.append(s + "\n");
				}
			}
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch == 'Y') {
				bw.write(sb.toString());
				System.out.println(str + ".txt 파일의 내용이 변경되었습니다.");
			}
		} catch( FileNotFoundException e ) {
			e.printStackTrace();
		}catch( IOException e ) {
		e.printStackTrace();
		}finally {
			try {
				if(br != null && bw != null) {
					br.close();
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
