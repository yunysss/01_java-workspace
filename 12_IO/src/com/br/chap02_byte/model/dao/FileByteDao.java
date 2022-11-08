package com.br.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao (Data Access Object)
public class FileByteDao {
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력
	 * 
	 * - 바이트 스트림 : 데이터를 1byte단위로 전송하는 좁은 통로
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * XXXInputStream : XXX매체로부터 데이터를 입력받을 수 있는 통로
	 * XXXOutputStream : XXX매체로 데이터를 출력시킬 수 있는 통로
	 */
	
	
	public void fileSave() {
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력시킬 수 있는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터를 출력
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null;
		try {
			// 1. FileOutputStrea 객체 생성 (해당 파일과의 연결통로가 만들어짐)
			/*
			 * true 미작성시 => 해당 파일이 존재할 경우 기존의 데이터 덮어씌워짐 (기본값이 false)
			 * true 작성시 => 해당 파일이 존재할 경우 기존의 데이터에 이어서 작성
			 */
			fout = new FileOutputStream("a_byte.txt"/*, true*/); // 해당 파일이 없으면 새로 만들어 준 후 통로연결 / 있으면 그냥 통로연결
			
			// 2. 스트림으로 데이터 출력 (메소드 활용)
			//	  숫자(0~127), 문자
			fout.write(97); // 'a' 문자가 저장
			fout.write('b'); // 'b' 문자가 저장
			//fout.write('하'); // 한글은 2byte짜리기 때문에 깨져서 저장
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // 통째로 지나가지 못하고 하나씩 지나가서 기록 // 'c', 'd', 'e' 문자가 저장
			fout.write(arr, 1, 2); // 'd', 'e' 문자가 저장
			
			// 3. 스트림 반납하기 (반드시)
			//fout.close(); // 중간에 예외가 발생되는 경우 해당 이 구문 실행 안될 수 있음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생하든간에 마지막에 무조건 실행되고 나감
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		FileInputStream fin = null;
		
		try {
			// 1. FileInputStream 객체 생성 => 해당 파일과 연결통로 만들어짐
			fin = new FileInputStream("a_byte.txt"); 
			
			// 2. 스트림으로 데이터 입력받기
			//    read 메소드 사용
			// 실제로 파일에 얼마만큼의 데이터가 있는지 모를 경우 => 반복문 활용
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1을 받아옴
			System.out.println(fin.read());
			*/
			
			/*
			while(fin.read() != -1) { // 읽어들인 값이 -1이 아닐 경우에만 반복수행
				System.out.println(fin.read()); // 다시금 읽어들인 값을 출력하고 있음
			}
			*/
			
			// read() 호출은 반복문 수행시 매번 한번씩 실행되도록
			// 해결방법1. 무한반복
			/*
			while(true) {
				
				int value = fin.read();
				if(value == -1) { // 파일의 끝을 만나는 순간
					break;
				}
			
			}
				System.out.println(value);
			*/
			
			// 해결방법2.
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면 예외 발생 (자동으로 만들어주지 않음)
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 자원 반납
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
