package com.br.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();	
	{ // 초기화 블럭
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("술이 달다", "에픽하이"));
		list.add(new Music("밥이 달다", "강보람"));		
	}
	
	// 곡 추가 요청을 처리해주는 메소드
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	// 전체 곡 조회요청을 처리해주는 메소드
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	/**
	 * 삭제 요청 처리해주는 메소드
	 * 
	 * @param title 사용자가 입력한 삭제할 곡 명
	 * @return 성공적으로 삭제시 1 | 삭제할 곡 못찾을시 0
	 */
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				list.remove(i);
				result++;
				break;
			}
		}
		// result == 0 (삭제할 곡을 못찾음) | 1 (성공적으로 삭제)
		return result;
	}
	
	/**
	 * @param 
	 * @return
	 */
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> searchList = new ArrayList<>(); // 검색된 Music객체들을 차곡차곡 담을 공간
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			} 
		}
		return searchList;
	}
	
	/**
	 * @param title 사용자가 입력한 수정할 곡 명
	 * @param upTitle 사용자가 입력한 수정 내용(곡명)
	 * @param upArtist 사용자가 입력한 수정 내용(가수명)
	 * @return 성공적으로 수정시 1 | 수정할 곡 못찾을시 0
	 */
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				// 방법1. ArrayList의 set메소드 => 새로운 Music 객체로 덮어씌우는 방법
				//list.set(i, new Music(upTitle, upArtist));
				
				// 방법2. 기존의 Music객체에 접근하여 setter메소드로 필드 수정 => 기존 Music 객체의 필드값 수정
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
				break;
			}
		}
		return result;
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword){
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) { // => 곡명으로 검색
			
			for(Music m : list) {
				if(m.getTitle().contains(keyword)) {
					searchList.add(m);
				}
			}
			
		} else if(menu == 2) { // => 가수명으로 검색
			
			for(Music m : list) {
				if(m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
			
		} else if(menu == 3) { // => 곡명 + 가수명으로 검색
			
			for(Music m : list) {
				if(m.getTitle().contains(keyword) || m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
		}
		return searchList;
	}
}
