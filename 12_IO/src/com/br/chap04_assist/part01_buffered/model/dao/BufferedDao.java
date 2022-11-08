package com.br.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	/*
	 * 보조스트림 == 기반스트림의 부족한 성능을 보다 향상시켜주는 역할
	 * 			  보조스트림 단독 사용 불가 (반드시 기반스트림과 함께 사용)
	 * 
	 * BufferedXXXXX : 속도를 향상 시키거나 기반스트림에서 제공하지 않는 메소드들을 제공
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 기반스트림
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도 향상)
		
		// 1. 기반스트림 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. 보조스트림 생성
		//BufferedWriter bw = new BufferedWriter(fw); // 보조하고자하는 기반스트림 객체 제시
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도향상에 도움
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine(); // 추가적인 메소드 제공 (줄바꿈)
			bw.write("저리가세요.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/*
		 * try~with~resource 구문을 이용하면 자원반납까지 자동으로 진행 (jdk7버전 이상부터 가능)
		 * 
		 * try(try블럭내에서 사용할 스트림객체 생성구문; 생성구문...) {
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void fileRead() {
		// FileReader
		// BufferedReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// readLine() : 한줄씩 읽어들이는 메소드
			
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // 파일의 끝을 만나는 순간 null
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value = br.readLine()) != null){
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 보조스트림 = new 보조스트림(new 보조스트림(기반스트림객체));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
